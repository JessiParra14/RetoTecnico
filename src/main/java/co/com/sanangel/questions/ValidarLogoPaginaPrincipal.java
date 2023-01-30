package co.com.sanangel.questions;

import co.com.sanangel.userinterfaces.PaginaPrincipalUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidarLogoPaginaPrincipal implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        return PaginaPrincipalUI.IMG_LOGO.resolveFor(actor).isVisible();
    }

    public static Question validarLogo(){return new ValidarLogoPaginaPrincipal();}
}
