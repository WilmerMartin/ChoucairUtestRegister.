package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.ChoucairButtonFinalPage;
import co.com.choucair.certification.proyectobase.userinterface.ChoucairRegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ButtonFinal implements Task {
    public static ButtonFinal buttonFinal() {
        return Tasks.instrumented(ButtonFinal.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
       // Cuarta parte del formulario de registro
        Click.on(ChoucairButtonFinalPage.BUTTON_NEXT4);
}
}

