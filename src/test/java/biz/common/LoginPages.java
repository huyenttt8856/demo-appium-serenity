package biz.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPages extends CommonPageObject {
	public void clickBtnLogin() {
		   WebElement BtnLogin =  getDriver().findElement(By.id("com.duolingo:id/introFlowLoginButton"));
		   BtnLogin.click();		   
		}
	public void inputEmail(String email)  {
			WebElement Email = getDriver().findElement(By.id("com.duolingo:id/loginView"));
			Email.sendKeys(email);
	}
	
	public void inputPassword(String pass) {
			WebElement password = getDriver().findElement(By.id("com.duolingo:id/passwordView"));
			password.sendKeys(pass);
	}
	
	public void clickBtnSignin() {
		WebElement BtnSignin = getDriver().findElement(By.id("com.duolingo:id/signinButton"));
	    BtnSignin.click();
	}
	
	public void clickBtnHomeMessage() {
		WebElement BtnHomeMessage = getDriver().findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[4]" + 
				""));
	    BtnHomeMessage.click();
	}
}
