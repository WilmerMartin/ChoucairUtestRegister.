package co.com.choucair.certification.proyectobase.tasks;
import co.com.choucair.certification.proyectobase.userinterface.ChoucairRegisterPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

public class RegisterDataStepTwo implements Task {

    String city;
    String codePostal;


    public RegisterDataStepTwo(String city, String codePostal) {
        this.city = city;
        this.codePostal = codePostal;
    }

    public static Performable registerDataStepTwo(String city, String codePostal) {

        return Tasks.instrumented(RegisterDataStepTwo.class,city,codePostal);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                //Segunda parte del formulario de registro
                Click.on(ChoucairRegisterPage.CITY),
                Enter.theValue(city).into(ChoucairRegisterPage.CITY),
                Hit.the(Keys.ARROW_DOWN).into(ChoucairRegisterPage.CITY),
                Hit.the(Keys.ENTER).into(ChoucairRegisterPage.CITY),
                Enter.theValue(codePostal).into(ChoucairRegisterPage.POSTALCODE),
                Click.on(ChoucairRegisterPage.BUTTON_NEXT2),
                //Tercera parte del formulario de registro
                Click.on(ChoucairRegisterPage.YOURMOBILE),
                Click.on(ChoucairRegisterPage.SEYOURMOBILE),
                Click.on(ChoucairRegisterPage.MODEL),
                Click.on(ChoucairRegisterPage.SEMODEL),
                Click.on(ChoucairRegisterPage.OPERATINGSYSTEM),
                Click.on(ChoucairRegisterPage.SEOPERATINGSYSTEM),
                Click.on(ChoucairRegisterPage.BUTTON_NEXT3));
    }
}

