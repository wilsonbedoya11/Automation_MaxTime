package co.com.productos.certificacion.tasks;

import co.com.productos.certificacion.userinterfaces.PaginaCerrarDia;
import co.com.productos.certificacion.userinterfaces.PantallaFlotanteProyecto;
import co.com.productos.certificacion.utils.Esperar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;

public class CerrarDia implements Task {

    public static CerrarDia cerrarDiaReporte()
    {
        return Tasks.instrumented(CerrarDia.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PaginaCerrarDia.OPCION_CERRAR_DIA),
                Esperar.unosSegundos(5),
                CambiarAlIframe.conNombre(""),
                Click.on(PantallaFlotanteProyecto.BOTON_ACEPTAR_MENSAJE_CERRAR_DIA)
        );

        actor.attemptsTo(
                Esperar.unosSegundos(3),
                Switch.toDefaultContext(),
                Esperar.unosSegundos(3)
        );
    }
}
