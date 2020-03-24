package com.co.talenta365.certificacion.stepdefinitions;

import static com.co.talenta365.certificacion.utils.Constants.URL_ADVANTAGE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;
import static com.co.talenta365.certificacion.exceptions.CreateUserException.THE_USER_WAS_NOT_CREATED;
import static com.co.talenta365.certificacion.exceptions.MakePurchaseException.THE_PRODUCT_WAS_NOT_FOUND;
import java.util.List;

import org.openqa.selenium.WebDriver;

import com.co.talenta365.certificacion.exceptions.CreateUserException;
import com.co.talenta365.certificacion.exceptions.MakePurchaseException;
import com.co.talenta365.certificacion.interactions.WaitElement;
import com.co.talenta365.certificacion.models.Product;
import com.co.talenta365.certificacion.models.User;
import com.co.talenta365.certificacion.questions.TheProduct;
import com.co.talenta365.certificacion.questions.TheUser;
import com.co.talenta365.certificacion.tasks.Buy;
import com.co.talenta365.certificacion.tasks.Create;
import com.co.talenta365.certificacion.tasks.EnterOptLogin;
import com.co.talenta365.certificacion.tasks.Log;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;

public class CreateUserStepDefinition {

	@Managed
	WebDriver driver;

	@Before
	public void set_the_stage() {
		OnStage.setTheStage(new OnlineCast());

	}

	@Given("^that the user is on the website$")
	public void thatTheUserIsOnTheWebsite() throws InterruptedException {

		theActorCalled("juan").can(BrowseTheWeb.with(driver)).attemptsTo(Open.url(URL_ADVANTAGE),
				WaitElement.forATime(10000));
	}

	@When("^the user log in with the data$")
	public void theUserLogInWithTheData(List<User> user) {
		theActorInTheSpotlight().attemptsTo(EnterOptLogin.inAdvantage(), Log.in(user.get(0)));
	}

	@When("^user search for product$")
	public void userSearchForProduct(List<Product> product) {
		theActorInTheSpotlight().attemptsTo(Buy.aProduct(product.get(0)));
	}

	@Then("^the user should see the product selected (.*)$")
	public void theUserShouldSeeTheProductSelected(String product) {
		theActorInTheSpotlight().should(seeThat(TheProduct.addedIs(), equalTo(product.toUpperCase()))
				.orComplainWith(MakePurchaseException.class, THE_PRODUCT_WAS_NOT_FOUND));
	}

	@Then("^the user should see at (.*) logged in$")
	public void theUserShouldSeeAtPachoLoggedIn(String username) {
		theActorInTheSpotlight().should(seeThat(TheUser.is(), equalTo(username))
				.orComplainWith(CreateUserException.class, THE_USER_WAS_NOT_CREATED));
	}

	@When("^enter the data of the user$")
	public void enterTheDataOfTheUser(List<User> user) {
		theActorInTheSpotlight().attemptsTo(EnterOptLogin.inAdvantage(), Create.user(user.get(0)));
	}

}
