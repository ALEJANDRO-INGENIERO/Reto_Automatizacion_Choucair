package co.co.choucair.reto.stepdefinitions;


import co.co.choucair.reto.models.UserData;
import co.co.choucair.reto.tasks.RegistroCandidatos;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

public class RegistroCandidato {

    @When("el usuario ingresa los datos del candidato")
    public void elUsuarioIngresaLosDatosDelCandidato(io.cucumber.datatable.DataTable dataTable) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                RegistroCandidatos.onTheSite(UserData.setData(dataTable).get(0)));
    }
    @Then("el sistema valida los datos del candidato")
    public void elSistemaValidaLosDatosDelCandidato() {

    }

}
