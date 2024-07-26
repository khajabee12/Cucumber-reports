package BDD_Cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_file extends page{
	page login;
@Given("Openapplication")
public void openapplication() {
    page.openApplication();
}

@When("enterusername {string}")
public void enterusername(String username) {
	page.enterEmailId(username);
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
    }

@Then("closeapplicaion")
public void closeapplicaion() throws InterruptedException {
	Thread.sleep(3000);
    mainClass.closeApplication();
}



}
