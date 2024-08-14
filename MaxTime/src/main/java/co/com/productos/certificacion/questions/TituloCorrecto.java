package co.com.productos.certificacion.questions;

import co.com.productos.certificacion.userinterfaces.PaginaDiasPendientesXCerrar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TituloCorrecto implements Question<String> {


    @Override
    public String answeredBy(Actor actor) {
        return  Text.of(PaginaDiasPendientesXCerrar.TITULO).answeredBy(actor);
    }

    public static TituloCorrecto tituloReporte() {
        return new TituloCorrecto();
    }
}
