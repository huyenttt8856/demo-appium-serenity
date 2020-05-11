package biz.steps.serenity;

import biz.common.LoginPages;
public class loginAppEndUserStep {
	LoginPages login;
	public void clickBtnLogin() {
		login.clickBtnLogin();
	}

	public void putinEmail(String email) {
		login.inputEmail(email);
	}

	public void putinPass(String password) {
		// TODO Auto-generated method stub
		login.inputPassword(password);
						
	}

	public void clickBtnSignin() {
		// TODO Auto-generated method stub
		login.clickBtnSignin();
	}

	public void clickBtnHomeMessage() {
		// TODO Auto-generated method stub
		login.clickBtnHomeMessage();;
	}
	
}
