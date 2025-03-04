package com.co.primeraAutomatizacion.stepsdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import com.co.primeraAutomatizacion.questions.CompareLogin;
import com.co.primeraAutomatizacion.tasks.LoginTask;

import static com.co.primeraAutomatizacion.utils.Credenciales.URL;

public class LoginStepDefinition {
    @Managed
    WebDriver hisBrowser;

    @Before
    public  void setUP (){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("User");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }

    @Dado("^que el usuario abre la pagina de inicio de sesion$")
    public void queElUsuarioAbreLaPaginaDeInicioDeSesion() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url(URL));
    }


    @Cuando("^ingresa las credenciales validas$")
    public void elUsuarioIngresaLasCredenciales() {

        OnStage.theActorInTheSpotlight().attemptsTo(LoginTask.enterCredencial());

    }

    @Entonces("^deberia ver el texto \"([^\"]*)\"$")
    public void deberiaVerElTexto(String arg0) throws Throwable {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(CompareLogin.compare()
                , Matchers.is("Dashboard")));
    }
}
