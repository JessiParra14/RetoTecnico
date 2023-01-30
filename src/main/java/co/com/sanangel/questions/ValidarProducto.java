package co.com.sanangel.questions;

import co.com.sanangel.userinterfaces.ProductoUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;


public class ValidarProducto implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        return ProductoUI.MSJ_PRODUCTO.resolveFor(actor).getText().equals("Cesta de amor");
    }

    public static Question validarProducto(){return new ValidarProducto(); }
}
