package co.co.choucair.reto.stepdefinitions;

import co.co.choucair.reto.questions.ValiateText;
import co.co.choucair.reto.tasks.InicioSes;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


import static co.co.choucair.reto.userinterfaces.IniciarSesion.TXT_VALIDA_TEXT;
import static co.co.choucair.reto.utils.Datos.ACTOR;
import static co.co.choucair.reto.utils.Datos.URL;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.containsString;


import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;

public class InicioSesionStepDefinitions {


    @Given("el usuario ingresa a la página de login")
    public void elUsuarioIngresaALaPáginaDeLogin() {
        OnStage.theActorCalled(ACTOR).wasAbleTo(Open.url(URL));
    }

    @Given("el usuario ingresa su nombre de usuario {string} y contraseña {string}")
    public void elUsuarioIngresaSuNombreDeUsuarioYContraseña(String user, String password) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                InicioSes.onTheSite(user, password)  // Pasamos el usuario y la contraseña
        );
    }

    @Then("el usuario valida el mensaje {string}")
    public void elUsuarioValidaQueHaIngresadoAlDashboard(String text) {
       OnStage.theActorInTheSpotlight().should(seeThat(ValiateText.of(TXT_VALIDA_TEXT), containsString(text)));


    }
}

