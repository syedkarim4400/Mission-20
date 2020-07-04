package com.test.LoginPageAction;

import org.testng.Assert;

import com.test.LoginPageLocator.LoginPageLocator;
import com.test.util.TestBase;
import com.test.util.Util;

public class LoginPageAction extends TestBase{
	
	LoginPageLocator loginPageLocator = new LoginPageLocator();
	
	public void credantial(String username, String password) {
		loginPageLocator.username.clear();
		loginPageLocator.username.sendKeys(username);
		loginPageLocator.password.clear();
		loginPageLocator.password.sendKeys(password);
		
		}
	
	public void clickonSigninlink() {
		loginPageLocator.Signinlink.click();
		Util.takescreenshot(driver, "Login Page");
	}
	
	public void clickonSigninButton() {
		loginPageLocator.SigninButton.click();
		
	}
	
	public void clickonSigninbutton() {
		loginPageLocator.Signinbutton.click();
		
	}
	
	public void Verifyusercanloginsuccessfully() {
		boolean success= loginPageLocator.loginsuccessfully.isDisplayed();
		Assert.assertTrue(success);
		Util.takescreenshot(driver, "Profile Page");
	}

}
