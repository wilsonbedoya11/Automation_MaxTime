package co.com.productos.certificacion.stepdefinitions;

import co.com.productos.certificacion.models.Datos;
import co.com.productos.certificacion.questions.TituloCorrecto;
import co.com.productos.certificacion.tasks.*;
import co.com.productos.certificacion.utils.Esperar;
import co.com.productos.certificacion.utils.Fecha;
import io.cucumber.java.Before;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.Map;

import static net.serenitybdd.screenplay.EventualConsequence.eventually;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;

public class reporteMaxTimeStepDefinition {

    @DataTableType
    public Datos datos(Map<String, String> entry){
        return new Datos(
                entry.get("proyecto"),
                entry.get("proyecto_vacas"),
                entry.get("tipo_hora"),
                entry.get("tipo_hora_vacas"),
                entry.get("servicio"),
                entry.get("actividad"),
                entry.get("actividad_vacas"),
                entry.get("horas"),
                entry.get("comentario"),
                entry.get("comentario_vacas"),
                entry.get("fecha_vacaciones_inicio"),
                entry.get("fecha_vacaciones_fin")
                );
    }

    @Before
    public void setStage()
    {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("El {actor} está en la página de max time")
    public void elEstáEnLaPáginaDeMaxTime(Actor actor) {
        actor.wasAbleTo(
                NavegarALaPagina.aLaPaginaMaxTime()
        );
    }
    @When("El {actor} realiza el login satisfatorio")
    public void elRealizaElLoginSatisfatorio(Actor actor) {
        actor.attemptsTo(
                IngresarCredenciales.realizarLogin()
        );

        actor.attemptsTo(
                Esperar.unosSegundos(5)
        );
    }
    @When("El {actor} realiza el reporte de las actividades realizadas durante el dia")
    public void elRealizaElReporteDeLasActividadesRealizadasDuranteElDia(Actor actor, Datos dataTable) {

    int diasCerrar=0;

        while(diasCerrar<5) {
            actor.attemptsTo(
                    ConocerDia.identificarDiaSemana()
            );

            String fecha = actor.recall("fecha");
            System.out.println("FECHA ES: " + fecha);

            Fecha fechaIdentificar = new Fecha();
            int dia = fechaIdentificar.VerificarDia(fecha);

            if (dia == 1 || dia == 7) {
                System.out.println("Fin de semana");

                actor.attemptsTo(
                        SeleccionarDia.selecciona()
                );

                actor.attemptsTo(
                        CerrarDia.cerrarDiaReporte()
                );

            } else {
                System.out.println("Dia laboral");

                actor.attemptsTo(
                        SeleccionarDia.selecciona(),
                        SeleccionarNuevoReporte.seleccionaOpcionNuevo()
                );

                int vacaciones = 0;
                vacaciones = fechaIdentificar.Vacaciones(fecha, dataTable.fecha_vacaciones_inicio(), dataTable.fecha_vacaciones_fin());

                //vacaciones
                if (vacaciones == 1) {
                    actor.attemptsTo(
                            IngresarInformacionReporte.lLenaFormulario(dataTable, "No laboral")
                    );

                    actor.attemptsTo(
                            CerrarDia.cerrarDiaReporte()
                    );

                } else {
                    //dia laboral
                    actor.attemptsTo(
                            IngresarInformacionReporte.lLenaFormulario(dataTable, "laboral")
                    );

                    actor.attemptsTo(
                            CerrarDia.cerrarDiaReporte()
                    );
                }
            }

            diasCerrar = diasCerrar + 1;
        }

    }
    @Then("El {actor} finaliza el reporte correctamente")
    public void elFinalizaElReporteCorrectamente(Actor actor) {
        actor.attemptsTo(
                Esperar.unosSegundos(5)
        );

        actor.should(
                eventually(
                        seeThat(TituloCorrecto.tituloReporte(), containsString("Reporte de tiempos / Días pendientes por cerrar")
                        )));
    }
}
