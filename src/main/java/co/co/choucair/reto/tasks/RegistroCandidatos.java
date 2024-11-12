package co.co.choucair.reto.tasks;

import co.co.choucair.reto.models.UserData;
import co.co.choucair.reto.userinterfaces.RegistrarCandidato;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

import static co.co.choucair.reto.userinterfaces.RegistrarCandidato.*;

public class RegistroCandidatos implements Task {
    UserData userData;

    public RegistroCandidatos(UserData dataCandidato) {
        this.userData = dataCandidato;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                JavaScriptClick.on(BTN_RECRUITMENT),
                JavaScriptClick.on(BTN_ADD),
                Enter.theValue(userData.getFullName()).into(RegistrarCandidato.FIRST_NAME),
                Enter.theValue(userData.getMiddle()).into(RegistrarCandidato.MIDDLE_NAME),
                Enter.theValue(userData.getLastName()).into(RegistrarCandidato.LAST_NAME),
                Click.on(RegistrarCandidato.VACANCY),
                Enter.theValue(userData.getEmail()).into(RegistrarCandidato.EMAIL),
                Enter.theValue(userData.getContactNumber()).into(RegistrarCandidato.CONTACT),
                UploadFile.withFile("C:/Users/omar1/OneDrive/Documentos/Selenium.pdf", RegistrarCandidato.BTN_LOUDER),
                Enter.theValue(userData.getKeywords()).into(RegistrarCandidato.KEYWORDS),
                Enter.theValue(userData.getNotes()).into(RegistrarCandidato.NOTES),
                Enter.theValue(userData.getDate()).into(RegistrarCandidato.DATA),
                JavaScriptClick.on(CONSENT_CHECKBOX),
                JavaScriptClick.on(BTN_SAVE)
        );
    }

    public static RegistroCandidatos onTheSite(UserData userData) {
        return Instrumented.instanceOf(RegistroCandidatos.class).withProperties(userData);
    }
}