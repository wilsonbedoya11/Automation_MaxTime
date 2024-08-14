package co.com.productos.certificacion.tasks;

import co.com.productos.certificacion.models.Datos;
import co.com.productos.certificacion.userinterfaces.PaginaReporteDetalleDia;
import co.com.productos.certificacion.userinterfaces.PantallaFlotanteProyecto;
import co.com.productos.certificacion.utils.Esperar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.Switch;
import org.openqa.selenium.Keys;


public class IngresarInformacionReporte implements Task {

    Datos dataTable;
    String tipoDia;

    static String diaLabora="laboral";

    public IngresarInformacionReporte(Datos dataTable, String tipoDia) {
        this.dataTable= dataTable;
        this.tipoDia= tipoDia;
    }


    public static IngresarInformacionReporte lLenaFormulario(Datos dataTable, String tipoDia)
    {
        return Tasks.instrumented(IngresarInformacionReporte.class, dataTable, tipoDia);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

       //seleccionar proyecto
       actor.attemptsTo(
            Click.on(PaginaReporteDetalleDia.CAMPO_LISTA_PROYECTO),
            Esperar.unosSegundos(7),
            CambiarAlIframe.conNombre("")
       );

        if(tipoDia.equals(diaLabora)) {
            actor.attemptsTo(
                    Enter.keyValues(dataTable.proyecto()).into(PantallaFlotanteProyecto.CAMPO_INGRESAR),
                    Hit.the(Keys.ENTER).into(PantallaFlotanteProyecto.CAMPO_INGRESAR),
                    Click.on(PantallaFlotanteProyecto.CHECK_BOX_PRIMER_ELEMENTO_LISTA_PROYECTO),
                    Esperar.unosSegundos(3),
                    Click.on(PantallaFlotanteProyecto.BOTON_ACEPTAR)
            );
        }
        else {
            actor.attemptsTo(
                    Enter.keyValues(dataTable.proyecto_vacas()).into(PantallaFlotanteProyecto.CAMPO_INGRESAR),
                    Hit.the(Keys.ENTER).into(PantallaFlotanteProyecto.CAMPO_INGRESAR),
                    Click.on(PantallaFlotanteProyecto.CHECK_BOX_PRIMER_ELEMENTO_LISTA_PROYECTO),
                    Esperar.unosSegundos(3),
                    Click.on(PantallaFlotanteProyecto.BOTON_ACEPTAR)
            );
        }

            actor.attemptsTo(
                    Esperar.unosSegundos(3),
                    Switch.toDefaultContext(),
                    Esperar.unosSegundos(5)
            );

            //seleccionar tipo hora
        if(tipoDia.equals(diaLabora)) {
            actor.attemptsTo(
                    Click.on(PaginaReporteDetalleDia.CAMPO_LISTA_TIPO_HORA_SELECCIONAR),
                    Click.on(PaginaReporteDetalleDia.LISTA_DESPLEGABLE.of(dataTable.tipo_hora())),
                    Esperar.unosSegundos(5)
            );
        }
        else {
            actor.attemptsTo(
                    Click.on(PaginaReporteDetalleDia.CAMPO_LISTA_TIPO_HORA_SELECCIONAR),
                    Click.on(PaginaReporteDetalleDia.LISTA_DESPLEGABLE.of(dataTable.tipo_hora_vacas())),
                    Esperar.unosSegundos(5)
            );
        }

            //seleccionar servicio
            actor.attemptsTo(
                    Click.on(PaginaReporteDetalleDia.CAMPO_LISTA_SERVICIO),
                    Esperar.unosSegundos(10),
                    CambiarAlIframe.conNombre("")
            );

            actor.attemptsTo(
                Enter.keyValues(dataTable.servicio()).into(PantallaFlotanteProyecto.CAMPO_INGRESAR),
                Hit.the(Keys.ENTER).into(PantallaFlotanteProyecto.CAMPO_INGRESAR),
                Click.on(PantallaFlotanteProyecto.CHECK_BOX_PRIMER_ELEMENTO_LISTA_SERVICIO),
                Click.on(PantallaFlotanteProyecto.BOTON_ACEPTAR)
        );

        actor.attemptsTo(
                Switch.toDefaultContext(),
                Esperar.unosSegundos(5)
        );

        if(tipoDia.equals(diaLabora)) {
            //actividad
            actor.attemptsTo(
                    Click.on(PaginaReporteDetalleDia.CAMPO_LISTA_TIPO_HORA_ACTIVIDAD),
                    Click.on(PaginaReporteDetalleDia.LISTA_DESPLEGABLE.of(dataTable.actividad())),
                    Esperar.unosSegundos(5)
            );

            //HORAS Y COMENTARIO
            actor.attemptsTo(
                    Enter.keyValues(dataTable.horas()).into(PaginaReporteDetalleDia.CAMPO_CANTIDAD_HORAS),
                    Enter.keyValues(dataTable.comentario()).into(PaginaReporteDetalleDia.CAMPO_COMENTARIO)
            );
        }
        else {
            //actividad
            actor.attemptsTo(
                    Click.on(PaginaReporteDetalleDia.CAMPO_LISTA_TIPO_HORA_ACTIVIDAD),
                    Click.on(PaginaReporteDetalleDia.LISTA_DESPLEGABLE.of(dataTable.actividad_vacas())),
                    Esperar.unosSegundos(5)
            );

            //HORAS Y COMENTARIO
            actor.attemptsTo(
                    Enter.keyValues(dataTable.horas()).into(PaginaReporteDetalleDia.CAMPO_CANTIDAD_HORAS),
                    Enter.keyValues(dataTable.comentario_vacas()).into(PaginaReporteDetalleDia.CAMPO_COMENTARIO)
            );
        }

        actor.attemptsTo(
                Click.on(PaginaReporteDetalleDia.BOTON_GUARDAR_CERRAR),
                Esperar.unosSegundos(5)
        );

    }
}
