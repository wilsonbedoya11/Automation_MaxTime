package co.com.productos.certificacion.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Switch;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CambiarAlIframe implements Task {

    private String nombreIframe;

    public CambiarAlIframe(String nombreIframe) {
        this.nombreIframe = nombreIframe;
    }

    public static CambiarAlIframe conNombre(String nombreIframe) {
        return instrumented(CambiarAlIframe.class, nombreIframe);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if(nombreIframe.length()==0)
        {
            actor.attemptsTo(
                    Switch.toFrame(0)
            );
        }
        else{
            actor.attemptsTo(
                    Switch.toFrame(nombreIframe)
            );
        }
    }
}