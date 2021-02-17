package co.com.choucair.certification.baseproject.questions;

import co.com.choucair.certification.baseproject.userinterface.CompleteFormUtest;
import cucumber.api.java.en_scouse.An;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {
    private String question;
    public Answer(String question) {
        this.question = question;
    }
    public static Answer toTheQuestion(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String nameCourse= Text.of(CompleteFormUtest.NAME_COMPLETESETUP).viewedBy(actor).asString();
        if(question.equals(nameCourse)){
            result = true;
        }else {
            result = false;
        }
        return result;
    }
}
