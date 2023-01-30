package co.com.sanangel.stepdefinitions;

import co.com.sanangel.questions.ValidarLogoPaginaPrincipal;
import co.com.sanangel.questions.ValidarProducto;
import co.com.sanangel.tasks.ProductoCesta;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class VerificacionProductosStepDefinition {

    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor actor = Actor.named("Ana");

    @Before
    public void configuracion(){
        actor.can(BrowseTheWeb.with(navegador));
    }

    @Cuando("^el usuario recargue la pagina y seleccione el producto que desea comprar$")
    public void elUsuarioRecargueLaPaginaYSeleccioneElProductoQueDeseaComprar() {
        navegador.navigate().refresh();
        actor.should(seeThat("El actor puede ver", ValidarLogoPaginaPrincipal.validarLogo(), Matchers.equalTo(true)));
        actor.attemptsTo(ProductoCesta.productoCesta());
    }

    @Entonces("^se validara el nombre del producto$")
    public void seValidaraElNombreDelProducto() {
        actor.should(seeThat("El producto es", ValidarProducto.validarProducto(), Matchers.equalTo(true)));
    }

}
