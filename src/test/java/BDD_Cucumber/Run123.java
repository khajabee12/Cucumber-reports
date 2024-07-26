package BDD_Cucumber;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="F:\\app\\eclipse\\BDD\\AK.feature",glue="BDD_Cucumber",
plugin={"pretty","html:target/cucumber-reports/AK.html",
		"json:target/cucumber-reports/AK.json",
		"junit:target/cucumber-reports/junit.xml"})
public class Run123 {

}
