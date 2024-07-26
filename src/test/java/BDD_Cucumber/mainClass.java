package BDD_Cucumber;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mainClass {
	public static WebDriver driver;
public static void openApplication() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.facebook.com/login/");
	System.out.println("application is opened");;
	
}
public static void closeApplication() {
	driver.close();
}
}
