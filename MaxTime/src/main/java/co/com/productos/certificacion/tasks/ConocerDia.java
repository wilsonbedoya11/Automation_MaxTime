package co.com.productos.certificacion.tasks;

import co.com.productos.certificacion.userinterfaces.PaginaDiasPendientesXCerrar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.questions.Text;

public class ConocerDia implements Task {

    public static ConocerDia identificarDiaSemana() {
        return Tasks.instrumented(ConocerDia.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.remember("fecha", Text.of(PaginaDiasPendientesXCerrar.FECHA_POR_CERRAR_SELECCIONAR));
    }
}
