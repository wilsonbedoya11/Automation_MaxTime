package co.com.productos.certificacion.tasks;


import co.com.productos.certificacion.userinterfaces.PaginaDiasPendientesXCerrar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarDia implements Task {


    public static SeleccionarDia selecciona() {
        return Tasks.instrumented(SeleccionarDia.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PaginaDiasPendientesXCerrar.BOTON_FECHA)
        );



    }
}
