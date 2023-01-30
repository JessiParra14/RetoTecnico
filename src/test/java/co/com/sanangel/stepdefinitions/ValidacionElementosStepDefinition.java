package co.com.sanangel.stepdefinitions;

import co.com.sanangel.questions.ValidarPaginaPrincipal;
import co.com.sanangel.questions.ValidarAgregarCarrito;
import co.com.sanangel.tasks.Producto;
import co.com.sanangel.userinterfaces.PaginaPrincipalUI;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class ValidacionElementosStepDefinition {

    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor actor = Actor.named("Ana");

    private PaginaPrincipalUI paginaPrincipalUI = new PaginaPrincipalUI();

    @Before
    public void configuracion(){
        actor.can(BrowseTheWeb.with(navegador));
    }

    @Dado("^que el usuario se encuentre en la pagina web$")
    public void queElUsuarioSeEncuentreEnLaPaginaWeb() {
        actor.wasAbleTo(Open.browserOn(paginaPrincipalUI));
    }

    @Cuando("^el seleccione el elemento que desea comprar$")
    public void elSeleccioneElElementoQueDeseaComprar() {
        actor.attemptsTo(Producto.producto());
    }

    @Entonces("^se validara agregar al carrito y el home$")
    public void seValidaraAgregarAlCarritoYElHome() {
        actor.should(seeThat("El actor puede ver", ValidarAgregarCarrito.validarMensaje(), Matchers.equalTo(true)));
        navegador.navigate().back();
        actor.should(seeThat("El actor puede ver", ValidarPaginaPrincipal.validarMensaje(), Matchers.equalTo(true)));
    }

}
