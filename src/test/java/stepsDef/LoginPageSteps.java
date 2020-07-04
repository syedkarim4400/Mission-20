package stepsDef;

import com.test.LoginPageAction.LoginPageAction;
import com.test.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginPageSteps extends TestBase {
	
	LoginPageAction action = new LoginPageAction ();

	
	@Given("^Launch \"([^\"]*)\"$")
	public void launch_url(String URL) throws Throwable {
	    geturl(URL);
	}
	
	@Then("^click on Signin link$")
	public void click_on_Signin_link() throws Throwable {
	   action.clickonSigninlink();
	}
	
	@Then("^click on Signin Button$")
	public void click_on_Signin_Button() throws Throwable {
	    action.clickonSigninButton();
	}
	
	@Then("^enter username and password$")
	public void enter_username_and_password() throws Throwable {
	    action.credantial(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Then("^click Signin button$")
	public void click_Signin_button() throws Throwable {
	    action.clickonSigninbutton();
	}
	
	@Then("^Verify user can login successfully$")
	public void Verify_user_can_login_successfully() {
		action.Verifyusercanloginsuccessfully();
	}
	
	

}
