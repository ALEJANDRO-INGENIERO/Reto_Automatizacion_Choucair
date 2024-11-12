package co.co.choucair.reto.ruuners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/loginUser.feature",
        tags = "@Login",
        glue = "co.co.choucair.reto.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE

)

public class InicioSesionRunner {
}
