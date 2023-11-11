package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairButtonFinalPage extends PageObject {
    public static final Target BUTTON_NEXT4 = Target.the("Es el boton para culminar el registro").located
     (By.xpath("//a[@id='laddaBtn']"));
}
