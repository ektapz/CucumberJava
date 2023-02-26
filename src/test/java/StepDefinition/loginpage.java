package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginpage {
	@Given("User is on login page.")
	public void user_is_on_login_page() {
		System.out.println("Inside user is in login page");
	}

	@When("User enter lginpage and password")
	public void user_enter_lginpage_and_password() {
		System.out.println("Inside user giv euser name and password to  login page");
	}

	@And("Click on login button")
	public void click_on_login_button() {
		System.out.println("User click on login button");
	}

	@Then("User is navigated to home page.")
	public void user_is_navigated_to_home_page() {
		System.out.println("user navigate to the home page");
	}
}
