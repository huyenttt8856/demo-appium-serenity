package biz.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.pages.PageObject;

public class Password extends PageObject {
	
	public void input(String pass) {
		// TODO Auto-generated method stub
	    WebElement password = getDriver().findElement(By.id("com.duolingo:id/passwordView"));
	    password.sendKeys(pass);

	}

}
