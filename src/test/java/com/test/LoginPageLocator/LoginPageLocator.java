package com.test.LoginPageLocator;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.test.util.TestBase;

public class LoginPageLocator extends TestBase {
	
	public LoginPageLocator () {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(how= How.XPATH,using="//span[text()='Sign In']")
	public WebElement Signinlink;
	@FindBy(how= How.XPATH,using="//a[text()='Sign In']")
	public WebElement SigninButton;
	@FindBy(how= How.NAME,using="EmailAddress")
	public WebElement username;
	@FindBy(how= How.ID,using="Password")
	public WebElement password;
	@FindBy(how= How.ID,using="sign-in-button")
	public WebElement Signinbutton;
	@FindBy(how= How.XPATH,using="//span[text()=\"MOHAMMAD JAHAN\"]")
	public WebElement loginsuccessfully;
	
	
	
	

}
