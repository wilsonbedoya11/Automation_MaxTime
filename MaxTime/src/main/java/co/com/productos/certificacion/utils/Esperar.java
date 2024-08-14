package co.com.productos.certificacion.utils;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class Esperar implements Task {

    private final int segundos;

    public Esperar(int segundos) {
        this.segundos = segundos;
    }

    public static Esperar unosSegundos(int segundos) {
        return instrumented(Esperar.class, segundos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}