package co.com.sanangel.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://sanangel.com.co/")
public class PaginaPrincipalUI extends PageObject {

    public static final Target BTN_PRODUCTO = Target.the("Producto a seleccionar").located(By.xpath("//h2[contains(text(),'Évora – 24 rosas')]"));
    public static final Target MSJ_PAGINAPRINCIPAL = Target.the("Mensaje pagina principal").located(By.xpath("//img[@class='vc_single_image-img attachment-full entered litespeed-loaded']"));
    public static final Target IMG_LOGO = Target.the("Logo de la pagina").located(By.xpath("//img[@class='navmenu__logo entered litespeed-loaded']"));
    public static final Target BTN_PRODUCTO_CESTA = Target.the("Producto a validar").located(By.xpath("//h2[contains(text(),'Cesta de amor')]"));
}


