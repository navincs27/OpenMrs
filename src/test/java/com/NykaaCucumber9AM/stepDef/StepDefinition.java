package com.NykaaCucumber9AM.stepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.NykaaCucumber9AM.base.BaseClass;
import com.NykaaCucumber9AM.pom.Login;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition  extends BaseClass {
	
	
	
	@Given("User launch the browser with url")
	public void user_launch_the_browser_with_url() {
	   browserLaunch("chrome");
	   launchUrl("https://www.nykaa.com/");
	}

	@When("User able to click the signIn button")
	
	public void user_able_to_click_the_sign_in_button() {
		Login l = new Login();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clickElement(l.getLogin());
	}

	@And("User able to enter the mobile number")
	public void user_able_to_enter_the_mobile_number() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User able to view the Home Page")
	public void user_able_to_view_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


}
