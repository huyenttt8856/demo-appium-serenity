package biz.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.thucydides.core.pages.PageObject;

public class Email extends PageObject {
	
	public void input(String email)  {
		// TODO Auto-generated method stub
	    WebElement Email = getDriver().findElement(By.id("com.duolingo:id/loginView"));
	    Email.sendKeys(email);
	}

}
