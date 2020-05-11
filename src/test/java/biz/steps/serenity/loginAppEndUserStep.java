package biz.steps.serenity;

import biz.common.BtnHM;
import biz.common.BtnLogin;
import biz.common.BtnSignin;
import biz.common.CommonPageObject;
import biz.common.Email;
import biz.common.Password;

public class loginAppEndUserStep {
	CommonPageObject common;
	BtnLogin btnlogin = new BtnLogin(); 
	Email email;
	Password password;
	BtnSignin btnsignin;
	BtnHM btnHome = new BtnHM();
	public void clickBtnLogin() {
		btnlogin.click();
	}

	public void putinEmail(String email) {
		this.email.input(email);
	}

	public void putinPass(String password) {
		// TODO Auto-generated method stub
		this.password.input(password);
						
	}

	public void clickBtnSignin() {
		// TODO Auto-generated method stub
		btnsignin.click();
	}

	public void clickBtnHM() {
		// TODO Auto-generated method stub
		btnHome.click();
	}
	
}
