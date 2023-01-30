package co.com.sanangel.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.sanangel.userinterfaces.PaginaPrincipalUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ProductoCesta implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_PRODUCTO_CESTA, isVisible()),
                Click.on(BTN_PRODUCTO_CESTA)
        );
    }

    public static ProductoCesta productoCesta(){return instrumented (ProductoCesta.class);}
}
