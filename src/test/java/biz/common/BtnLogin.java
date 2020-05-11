package biz.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.pages.PageObject;

public class BtnLogin extends PageObject {

	
	public void click() {
	   WebElement BtnLogin =  getDriver().findElement(By.id("com.duolingo:id/introFlowLoginButton"));
	   
	   BtnLogin.click();
	   
	 //  em sử dụng Appium driver thay vì dùng getDriver, => serenity ko gọi đc driver e đã khai báo ở serenity.properties để get element
	}

}
