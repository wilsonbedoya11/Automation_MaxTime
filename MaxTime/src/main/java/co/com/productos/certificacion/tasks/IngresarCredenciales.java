package co.com.productos.certificacion.tasks;

import co.com.productos.certificacion.userinterfaces.PaginaLoginMaxTime;
import co.com.productos.certificacion.utils.Constantes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class IngresarCredenciales implements Task {

    public static IngresarCredenciales realizarLogin() {
        return Tasks.instrumented(IngresarCredenciales.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(Constantes.USER).into(PaginaLoginMaxTime.CAMPO_USUARIO),
                Enter.theValue(Constantes.PASSWORD).into(PaginaLoginMaxTime.CAMPO_CONTRASEÑA),
                Click.on(PaginaLoginMaxTime.BOTON_CONECTARSE)
        );
    }
}
