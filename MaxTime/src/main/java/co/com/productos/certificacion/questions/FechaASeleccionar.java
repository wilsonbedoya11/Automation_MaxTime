package co.com.productos.certificacion.questions;

import co.com.productos.certificacion.userinterfaces.PaginaDiasPendientesXCerrar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class FechaASeleccionar implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {

        return Text.of(PaginaDiasPendientesXCerrar.FECHA_POR_CERRAR).answeredBy(actor);
    }

    public static FechaASeleccionar fecha() {
        return new FechaASeleccionar();
    }
}
