package co.com.choucair.certification.baseproject.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestJoinPage {
    public static final Target JOIN_BUTTON = Target.the("button that shows us the form to join").located(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[2]/a"));



}
