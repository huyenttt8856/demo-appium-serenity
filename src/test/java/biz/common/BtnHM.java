package biz.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.pages.PageObject;

public class BtnHM extends PageObject{

	public void click() {
		// TODO Auto-generated method stub
		WebElement BtnHM = getDriver().findElement(By.id("com.duolingo:id/homeMessageSecondaryButton"));
	    BtnHM.click();
	}

}
