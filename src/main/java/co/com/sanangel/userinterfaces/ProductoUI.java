package co.com.sanangel.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ProductoUI {

    public static final Target MSJ_AGREGARCARRITO = Target.the("Agregar al carrito").located(By.name("add-to-cart"));

    public static final Target MSJ_PRODUCTO = Target.the("Producto a validar").located(By.xpath("//h1[contains(text(),'Cesta de amor')]"));

}
