package co.com.productos.certificacion.tasks;

import co.com.productos.certificacion.userinterfaces.PaginaReporteDia;
import co.com.productos.certificacion.utils.Esperar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarNuevoReporte implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PaginaReporteDia.OPCION_NUEVO_REPORTE),
                Esperar.unosSegundos(15)
        );
    }

    public static SeleccionarNuevoReporte seleccionaOpcionNuevo()
    {
        return Tasks.instrumented(SeleccionarNuevoReporte.class);
    }
}
