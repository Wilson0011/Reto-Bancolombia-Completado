package co.com.choucair.certification.baseproject.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CompleteFormUtest {
    public static final Target INPUT_FIRTSNAME = Target.the("complete firstname").located(By.id("firstName"));
    public static final Target INPUT_LASTNAME = Target.the("complete lastname").located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("complete email").located(By.id("email"));
    public static final Target INPUT_BIRTHMONTH = Target.the("complete birthMonth").located(By.id("birthMonth"));
    public static final Target INPUT_BIRTHDAY = Target.the("complete birthDay").located(By.id("birthDay"));
    public static final Target INPUT_BIRTYEAR = Target.the("complete birthYear").located(By.id("birthYear"));
    public static final Target INPUT_LANGUAGESPOKEN = Target.the("complete languages spoken").located(By.xpath("//*[@id=\"languages\"]/div[1]/input"));
    public static final Target SELECT_LANGUAGESPOKEN = Target.the("select languages spoken").located(By.xpath("//*[@id=\"ui-select-choices-row-0-0\"]/span/div"));

    public static final Target BUTTON_NEXTLOCATION = Target.the("button Next: Location").located(By.xpath("//div[@class='form-group col-xs-12 text-right']//span[contains(text(),'Next: Location')]"));

    public static final Target INPUT_CITY = Target.the("complete city").located(By.id("city"));
    public static final Target INPUT_ZIP = Target.the("complete zip").located(By.id("zip"));

    public static final Target SELECT_COUNTRY = Target.the("select1 country").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span"));
    public static final Target INPUT_COUNTRY = Target.the("complete country").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));

    public static final Target BUTTON_NEXTDEVICES = Target.the("button Next: Next Devices").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a/span"));

    public static final Target SELECT_MOBILEDEVICE = Target.the("select mobile device").located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/div[1]/span"));
    public static final Target INPUT_MOBILEDEVICE = Target.the("complete mobile device").located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/input[1]"));
    public static final Target SELECT_MODEL = Target.the("select model").located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/div[1]/span"));
    public static final Target INPUT_MODEL = Target.the("complete model").located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/input[1]"));
    public static final Target SELECT_OSYSTEM = Target.the("select operative system").located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/div[1]/span"));
    public static final Target INPUT_OSYSTEM = Target.the("complete complete operative system").located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/input[1]"));

    public static final Target BUTTON_NEXTLASTSTEP = Target.the("button Next: Last Step").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a"));

    public static final Target INPUT_PASSWORD = Target.the("complete password").located(By.id("password"));
    public static final Target INPUT_CPASSWORD = Target.the("complete confirm password").located(By.id("confirmPassword"));
    public static final Target MARK_TERMSOFUSE = Target.the("mark uTest Terms of Use ").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target MARK_PRIVACYPOLICY = Target.the("mark privacy & security policy ").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));

    public static final Target BUTTON_COMPLETESETUP = Target.the("button Complete Setup").located(By.xpath("//*[@id=\"laddaBtn\"]/span"));
    public static final Target NAME_COMPLETESETUP = Target.the("name Complete Setup").located(By.xpath("//*[@id=\"laddaBtn\"]/span"));

    //*[@id="regs_container"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]
}
