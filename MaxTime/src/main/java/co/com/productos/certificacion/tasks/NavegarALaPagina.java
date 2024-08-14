package co.com.productos.certificacion.tasks;

import co.com.productos.certificacion.utils.Constantes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class NavegarALaPagina implements Task {

    public static NavegarALaPagina aLaPaginaMaxTime() {
        return Tasks.instrumented(NavegarALaPagina.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url(Constantes.URL_PAGE)
        );
    }
}


