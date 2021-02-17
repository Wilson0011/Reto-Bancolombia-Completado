package co.com.choucair.certification.baseproject.stepdefinitions;

import co.com.choucair.certification.baseproject.model.UTestData;
import co.com.choucair.certification.baseproject.questions.Answer;
import co.com.choucair.certification.baseproject.tasks.CompleteForm;
import co.com.choucair.certification.baseproject.tasks.JoinToday;
import co.com.choucair.certification.baseproject.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class ChoucairAcademyStepDefintions {

    @Before
    public void setStage () {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Wilson wants to join uTest$")
    public void thanWilsonWantsToJoinUTest() {
        OnStage.theActorCalled("Wilson").wasAbleTo(OpenUp.thePage(), JoinToday.onThePage());
    }

    @When("^he complete the form on the uTest platform$")
    public void heCompleteTheFormOnTheUTestPlatform(List<UTestData> uTestData) throws Exception{
        OnStage.theActorInTheSpotlight().attemptsTo(CompleteForm.thePersonData(uTestData.get(0).getStrFName(), uTestData.get(0).getStrLName(), uTestData.get(0).getStrEmail(), uTestData.get(0).getStrMBirth(), uTestData.get(0).getStrDBirth(), uTestData.get(0).getStrYBirth(), uTestData.get(0).getStrLanguage(), uTestData.get(0).getStrCity(), uTestData.get(0).getStrZip(), uTestData.get(0).getStrCountry(), uTestData.get(0).getStrMobileD(), uTestData.get(0).getStrModel(), uTestData.get(0).getStrOSystem(), uTestData.get(0).getStrPassword()));
    }

    @Then("^he finds the button called to create user$")
    public void heFindsTheButtonCalledToCreateUser(List<UTestData> uTestData) throws Exception{
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toTheQuestion(uTestData.get(0).getStrUserCreated())));
    }

}
