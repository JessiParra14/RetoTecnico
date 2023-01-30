package co.com.sanangel.questions;

import co.com.sanangel.userinterfaces.ProductoUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidarAgregarCarrito implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        return ProductoUI.MSJ_AGREGARCARRITO.resolveFor(actor).isVisible();
    }

    public static Question validarMensaje(){
        return new ValidarAgregarCarrito();
    }
}
