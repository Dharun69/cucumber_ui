package com.step_definitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.constants.Constants;
import com.page_objects.LoginPage;
import com.webdriver_manager.Driver_Manger;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifyCEOName_Step_Def {

	private static final Logger LOGGER = LogManager.getLogger(VerifyCEOName_Step_Def.class);

	@Given("the user is logged in successfully and is on Home Page")
	public void the_user_is_logged_in_successfully_and_is_on_home_page() {
		//login
		Driver_Manger.getDriver().get(Constants.url);
		
		LoginPage.getInstance();
		LoginPage.USERNAME.sendKeys(Constants.username);
		LoginPage.PASSWORD.sendKeys(Constants.password);
		LoginPage.LOGIN_BUTTON.click();

		String url =Driver_Manger.getDriver().getCurrentUrl();

		if(url.contains("Employee List")) {
			LOGGER.info("the user is logged in successfully and is on Home Page");
		}


	}

	@When("the user clicks on the directory option from the Menu bar")
	public void the_user_clicks_on_the_directory_option_from_the_menu_bar() {
		System.out.println("the user clicks on the directory option from the Menu bar");
	}

	@When("the user selects the job title as {string} from the drop down")
	public void the_user_selects_the_job_title_as_from_the_drop_down(String string) {
		System.out.println("the user selects the job title as {string} from the drop down");
	}

	@When("click the search button")
	public void click_the_search_button() {
		System.out.println("click the search button");

	}

	@Then("the user should see the CEO name as {string}")
	public void the_user_should_see_the_ceo_name_as(String string) {
		System.out.println("the user should see the CEO name as John smith");

	}



}
