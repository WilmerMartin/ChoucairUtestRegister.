package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.ChoucairButtonFinalPage;
import co.com.choucair.certification.proyectobase.userinterface.ChoucairRegisterPage;
import com.gargoylesoftware.htmlunit.javascript.host.Touch;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

public class RegisterData implements Task {
    public static RegisterData registerData() {

        return Tasks.instrumented(RegisterData.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue("Wilmer").into(ChoucairRegisterPage.FIRSTNAME),
                Enter.theValue("Martin").into(ChoucairRegisterPage.LASTNAME),
                Enter.theValue("wilmerm@gmail.com").into(ChoucairRegisterPage.EMAIL),
                Click.on(ChoucairRegisterPage.MONTH),
                Click.on(ChoucairRegisterPage.SETMONTH),
                Click.on(ChoucairRegisterPage.DAY),
                Click.on(ChoucairRegisterPage.SEDAY),
                Click.on(ChoucairRegisterPage.YEAR),
                Click.on(ChoucairRegisterPage.SEYEAR),
                Click.on(ChoucairRegisterPage.LANGUAJES),
                Click.on(ChoucairRegisterPage.SELANGUAJES),
                Click.on(ChoucairRegisterPage.BUTTON_NEXT),
                //Segunda parte del formulario de registro
                Click.on(ChoucairRegisterPage.CITY),
                Enter.theValue("Bog").into(ChoucairRegisterPage.CITY),
                Hit.the(Keys.ARROW_DOWN).into(ChoucairRegisterPage.CITY),
                Hit.the(Keys.ENTER).into(ChoucairRegisterPage.CITY),
                Enter.theValue("111071").into(ChoucairRegisterPage.POSTALCODE),
                Click.on(ChoucairRegisterPage.COUNTRY),
                Click.on(ChoucairRegisterPage.SECOUNTRY),
                Click.on(ChoucairRegisterPage.BUTTON_NEXT2),
                //Tercera parte del formulario de registro
                Click.on(ChoucairRegisterPage.YOURCOMPUTER),
                Click.on(ChoucairRegisterPage.SEYOURCOMPUTER),
                Click.on(ChoucairRegisterPage.VERSION),
                Click.on(ChoucairRegisterPage.SEVERSION),
                Click.on(ChoucairRegisterPage.LANGUAJE),
                Click.on(ChoucairRegisterPage.SELANGUAJE),
                Click.on(ChoucairRegisterPage.YOURMOBILE),
                Click.on(ChoucairRegisterPage.SEYOURMOBILE),
                Click.on(ChoucairRegisterPage.MODEL),
                Click.on(ChoucairRegisterPage.SEMODEL),
                Click.on(ChoucairRegisterPage.OPERATINGSYSTEM),
                Click.on(ChoucairRegisterPage.SEOPERATINGSYSTEM),
                Click.on(ChoucairRegisterPage.BUTTON_NEXT3),
                //Cuarta parte del formulario de registro
                Enter.theValue("Wq101010101").into(ChoucairRegisterPage.UTESTPASSWORD),
                Enter.theValue("Wq101010101").into(ChoucairRegisterPage.CONFIRMPASSWORD),
                Click.on(ChoucairRegisterPage.STAYINFORMED),
                Click.on(ChoucairRegisterPage.UTESTTERMS),
                Click.on(ChoucairRegisterPage.PRIVACYYSECURITY));
    }
}
