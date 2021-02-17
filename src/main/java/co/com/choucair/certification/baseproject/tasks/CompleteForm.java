package co.com.choucair.certification.baseproject.tasks;

import co.com.choucair.certification.baseproject.userinterface.CompleteFormUtest;
import cucumber.api.java.af.En;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static java.lang.Thread.sleep;

public class CompleteForm implements Task {

    private String strFName;
    private String strLName;
    private String strEmail;
    private String strMBirth;
    private String strDBirth;
    private String strYBirth;
    private String strLanguage;
    private String strCity;
    private String strZip;
    private String strCountry;
    private String strMobileD;
    private String strModel;
    private String strOSystem;
    private String strPassword;

    public CompleteForm(String strFName, String strLName, String strEmail, String strMBirth, String strDBirth, String strYBirth, String strLanguage, String strCity, String strZip, String strCountry, String strMobileD, String strModel, String strOSystem, String strPassword) {
        this.strFName = strFName;
        this.strLName = strLName;
        this.strEmail = strEmail;
        this.strMBirth = strMBirth;
        this.strDBirth = strDBirth;
        this.strYBirth = strYBirth;
        this.strLanguage = strLanguage;
        this.strCity = strCity;
        this.strZip = strZip;
        this.strCountry = strCountry;
        this.strMobileD = strMobileD;
        this.strModel = strModel;
        this.strOSystem = strOSystem;
        this.strPassword = strPassword;
    }

    public static CompleteForm thePersonData(String strFName, String strLName, String strEmail, String strMBirth, String strDBirth, String strYBirth, String strLanguage, String strCity, String strZip, String strCountry, String strMobileD, String strModel, String strOSystem, String strPassword) {
        return Tasks.instrumented(CompleteForm.class, strFName, strLName, strEmail, strMBirth, strDBirth, strYBirth, strLanguage, strCity, strZip, strCountry, strMobileD, strModel, strOSystem, strPassword);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(strFName).into(CompleteFormUtest.INPUT_FIRTSNAME),
                Enter.theValue(strLName).into(CompleteFormUtest.INPUT_LASTNAME),
                Enter.theValue(strEmail).into(CompleteFormUtest.INPUT_EMAIL),
                Enter.keyValues(strMBirth).into(CompleteFormUtest.INPUT_BIRTHMONTH),
                Enter.keyValues(strDBirth).into(CompleteFormUtest.INPUT_BIRTHDAY),
                Enter.keyValues(strYBirth).into(CompleteFormUtest.INPUT_BIRTYEAR),
                Enter.keyValues(strLanguage).into(CompleteFormUtest.INPUT_LANGUAGESPOKEN),
                Click.on(CompleteFormUtest.SELECT_LANGUAGESPOKEN),
                Click.on(CompleteFormUtest.BUTTON_NEXTLOCATION),

                Enter.theValue(strCity).into(CompleteFormUtest.INPUT_CITY),
                Enter.theValue(strZip).into(CompleteFormUtest.INPUT_ZIP),
                Click.on(CompleteFormUtest.SELECT_COUNTRY),
                Enter.keyValues(strCountry).into(CompleteFormUtest.INPUT_COUNTRY),
                Hit.the(Keys.ENTER).into(CompleteFormUtest.INPUT_COUNTRY),
                Click.on(CompleteFormUtest.BUTTON_NEXTDEVICES),

                Click.on(CompleteFormUtest.SELECT_MOBILEDEVICE),
                Enter.keyValues(strMobileD).into(CompleteFormUtest.INPUT_MOBILEDEVICE),
                Hit.the(Keys.ENTER).into(CompleteFormUtest.INPUT_MOBILEDEVICE),
                Click.on(CompleteFormUtest.SELECT_MODEL),
                Enter.keyValues(strModel).into(CompleteFormUtest.INPUT_MODEL),
                Hit.the(Keys.ENTER).into(CompleteFormUtest.INPUT_MODEL),
                Click.on(CompleteFormUtest.SELECT_OSYSTEM),
                Enter.keyValues(strOSystem).into(CompleteFormUtest.INPUT_OSYSTEM),
                Hit.the(Keys.ENTER).into(CompleteFormUtest.INPUT_OSYSTEM),
                Click.on(CompleteFormUtest.BUTTON_NEXTLASTSTEP),

                Enter.theValue(strPassword).into(CompleteFormUtest.INPUT_PASSWORD),
                Enter.theValue(strPassword).into(CompleteFormUtest.INPUT_CPASSWORD),
                Click.on(CompleteFormUtest.MARK_TERMSOFUSE),
                Click.on(CompleteFormUtest.MARK_PRIVACYPOLICY)

                //Click.on(CompleteFormUtest.BUTTON_COMPLETESETUP)

                );
    }
}
