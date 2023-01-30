package co.com.sanangel.questions;

import co.com.sanangel.userinterfaces.PaginaPrincipalUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidarPaginaPrincipal implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        return PaginaPrincipalUI.MSJ_PAGINAPRINCIPAL.resolveFor(actor).isVisible();
    }

    public static Question validarMensaje(){
        return new ValidarPaginaPrincipal();
    }
}
