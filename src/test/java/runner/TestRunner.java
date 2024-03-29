package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (

		features = "features/signUp.feature",
		tags= "@SignUp",
	    glue = {"com.facebook"},
		plugin = {"pretty", "html:target/Reports/SignUp direct2 paramete.html"},
		
		monochrome= true, dryRun =false
		
)


public class TestRunner {
	

}
