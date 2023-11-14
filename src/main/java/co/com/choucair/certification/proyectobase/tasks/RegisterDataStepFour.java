package co.com.choucair.certification.proyectobase.tasks;
import co.com.choucair.certification.proyectobase.userinterface.ChoucairRegisterPage;

import cucumber.api.java.sk.Tak;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

public class RegisterDataStepFour implements Task {
    String password;
    String confirmPassword;

    public RegisterDataStepFour(String password, String confirmPassword) {
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public static Performable registerDataStepFour(String password, String confirmPassword) {

        return Tasks.instrumented(RegisterDataStepFour.class,password,confirmPassword);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                //Cuarta parte del formulario de registro
                Enter.theValue(password).into(ChoucairRegisterPage.UTESTPASSWORD),
                Enter.theValue(confirmPassword).into(ChoucairRegisterPage.CONFIRMPASSWORD),
                Click.on(ChoucairRegisterPage.STAYINFORMED),
                Click.on(ChoucairRegisterPage.UTESTTERMS),
                Click.on(ChoucairRegisterPage.PRIVACYYSECURITY));
    }
}
