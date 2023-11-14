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

public class RegisterData implements Task {

    String firstName;
    String lastName;
    String email;
    String language;

    public RegisterData(String firstName, String lastName, String email, String language) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.language = language;

    }

    public static Performable registerData(String firstName, String lastName, String email, String language) {

        return Tasks.instrumented(RegisterData.class,firstName,lastName,email,language);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(firstName).into(ChoucairRegisterPage.FIRSTNAME),
                Enter.theValue(lastName).into(ChoucairRegisterPage.LASTNAME),
                Enter.theValue(email).into(ChoucairRegisterPage.EMAIL),
                Click.on(ChoucairRegisterPage.MONTH),
                Click.on(ChoucairRegisterPage.DAY),
                Click.on(ChoucairRegisterPage.YEAR),
                Enter.theValue(language).into(ChoucairRegisterPage.LANGUAJES),
                Hit.the(Keys.ENTER).into(ChoucairRegisterPage.LANGUAJES),
                Click.on(ChoucairRegisterPage.BUTTON_NEXT));
    }
}
