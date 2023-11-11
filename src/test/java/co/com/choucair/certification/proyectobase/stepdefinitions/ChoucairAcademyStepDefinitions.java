package co.com.choucair.certification.proyectobase.stepdefinitions;
import co.com.choucair.certification.proyectobase.tasks.ButtonFinal;
import co.com.choucair.certification.proyectobase.tasks.Login;
import co.com.choucair.certification.proyectobase.tasks.OpenUp;
import co.com.choucair.certification.proyectobase.tasks.RegisterData;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Wilmer wants to register a new user by clicking on the Join Today button$")
    public void thanWilmerwantstoregisteranewuserbyclickingontheJoinTodaybutton() {
        OnStage.theActorCalled("Santiago").wasAbleTo(OpenUp.thePage(),(Login.onThePage()));
    }

    @When("^he fills out all the information requested for registration$")
    public void hefillsoutalltheinformationrequestedforregistration() {
        OnStage.theActorCalled("Santiago").wasAbleTo(RegisterData.registerData());
    }

    @Then("^he clicks on the complete setup button$")
    public void heclicksonthecompletesetupbutton() {
        OnStage.theActorCalled("Santiago").wasAbleTo(ButtonFinal.buttonFinal());
    }
}
