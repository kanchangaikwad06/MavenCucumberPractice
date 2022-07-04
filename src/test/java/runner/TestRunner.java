package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
		@CucumberOptions(
		features = "features/signUp.feature",
		tags= "@Facebook",
	    glue = {"com.facebook.step"},
		plugin = {"pretty", "html:target/Reports/SignUp Parameters pass.html"},
	
		monochrome= true, dryRun =false
		
)


public class TestRunner {
	

}
