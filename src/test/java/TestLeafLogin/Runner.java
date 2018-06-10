package TestLeafLogin;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@CucumberOptions(features = "src/test/java/TestLeafLogin/LoginTestLeaf.feature", glue = {"TestLeafLogin","pages"})
@RunWith(Cucumber.class)
public class Runner {
	
}
