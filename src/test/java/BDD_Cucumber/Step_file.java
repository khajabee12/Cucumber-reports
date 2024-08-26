package BDD_Cucumber;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_file extends page{
    private static Logger Log = Logger.getLogger(Step_file.class.getName());

	page login;
@Given("Openapplication")
public void openapplication() {
	DOMConfigurator.configure("log4j.xml");
    page.openApplication();
    Log.info("application is open");
}

@When("enterusername {string}")
public void enterusername(String username) {

	page.enterEmailId(username);
	Log.info("username is entered");
    }

@Then("enterpassword {string}")
public void enterpassword(String password) {

	page.enterpassword_facebook(password);

    }

@Then("click on loginbutton")
public void click_on_loginbutton() throws InterruptedException {
	Thread.sleep(3000);
	page.login_method();
	Thread.sleep(3000);
	Log.info("login button is clicked");
    }

@Then("closeapplicaion")
public void closeapplicaion() throws InterruptedException {
	Thread.sleep(3000);
    mainClass.closeApplication();
    Log.info("application is closed");
}



}
