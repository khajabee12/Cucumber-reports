package BDD_Cucumber;

import org.openqa.selenium.By;

public class page extends mainClass{

public static By txt_email = By.xpath("//input[@name='email']");
public static By txt_password =By.xpath("//input[@id='pass']");
public static By btn_login =By.xpath("//*[@id=\"loginbutton\"]");



public  static void enterEmailId(String EmailId) {
	driver.findElement(txt_email).sendKeys(EmailId);
	System.out.println("emailid is entered");
}
public static void enterpassword_facebook(String passwordId) {
	driver.findElement(txt_password).sendKeys(passwordId);
}
public static void login_method() throws InterruptedException {
	Thread.sleep(3000);
	driver.findElement(btn_login).click();
}
}
