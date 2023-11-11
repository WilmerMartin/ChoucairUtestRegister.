package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairLoginPage extends PageObject {
    public static final Target LOGIN_BUTTON = Target.the("Boton que nos lleva para el formulario de registo").located
            (By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));
}
