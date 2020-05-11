package biz.steps;

import biz.steps.serenity.loginAppEndUserStep;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class loginAppDefStep {
	@Steps 
	loginAppEndUserStep endUser;
	
	@Given("I launch doulingo application")
	public void I_launch_doulingo_application() {
		System.out.println("Launch done");
	}
	
	@When("I tap on login button")
	public void I_tap_on_login_button() {    
		endUser.clickBtnLogin();
	}
	
//	@Then("It will display loginPage")
//	public void It_will_display_loginPage() {
//		WebElement el7 = (WebElement) driver.findElement("d851d359-e211-4e54-995c-b0e597cab397");
//		el7.isDisplayed();
//	}

	@And("I put in email '(.*)'")
	public void I_put_in_email(String email){
		endUser.putinEmail(email);
		System.out.println("Put in email");
		
		//Lúc nãy những method này e xử lý chưa đúng
	}
	@And("I put in password '(.*)'")
	public void I_put_in_password(String password){
		endUser.putinPass(password);
		System.out.println("Put in pass");
	}
	
	@And("I tap on signin button")
	public void I_tap_on_signin_button() {
		endUser.clickBtnSignin();
		System.out.println("tap on signin button");
	}
	
	@And("I tap on homemassage button")
	public void I_tap_on_homemassage_button() {
		endUser.clickBtnHomeMessage();
		System.out.println("tap on homemessage button");
	}
	@Then("It will display homescreen")
	public void It_will_display_homescreen() {
		
	}
}
