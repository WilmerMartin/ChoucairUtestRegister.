package co.com.choucair.certification.proyectobase.stepdefinitions;
import co.com.choucair.certification.proyectobase.tasks.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.Before;
import cucumber.api.java.jv.Lan;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Wilmer wants to register a new user by clicking on the Join Today button$")
    public void thanWilmerwantstoregisteranewuserbyclickingontheJoinTodaybutton() {
        OnStage.theActorCalled("Wilmer").wasAbleTo(OpenUp.thePage(),(Login.onThePage()));
    }

    @When("^he enters the First Name \"([^\"]*)\", Last Name \"([^\"]*)\", Email \"([^\"]*)\", Language \"([^\"]*)\"")
    public void heEntersTheFirstNameLastNameEmailLanguage(String FirstName, String LastName, String Email, String Language) {
        OnStage.theActorCalled("Wilmer").attemptsTo(RegisterData.registerData(FirstName,LastName,Email,Language));
    }

    @When("^in Step two enter city \"([^\"]*)\", zip code \"([^\"]*)\"")
    public void inStepTwoEnterCityZipCode(String City, String CodePostal) {
        OnStage.theActorCalled("Wilmer").attemptsTo(RegisterDataStepTwo.registerDataStepTwo(City,CodePostal));
    }

    @When("^in Step four enter password \"([^\"]*)\", confirm password \"([^\"]*)\"$")
    public void inStepFourEnterPasswordConfirmPassword(String Password, String ConfirmPassword) {
        OnStage.theActorCalled("Wilmer").attemptsTo(RegisterDataStepFour.registerDataStepFour(Password,ConfirmPassword));

    }

    @Then("^he clicks on the complete setup button$")
    public void heclicksonthecompletesetupbutton() {
        OnStage.theActorCalled("Wilmer").wasAbleTo(ButtonFinal.buttonFinal());
    }
}
