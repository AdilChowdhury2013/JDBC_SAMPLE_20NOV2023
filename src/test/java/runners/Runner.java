package runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= {"classpath:feature_folder"},
		glue = "steps",
		tags= "@DbloginFeature",
		dryRun= false,
		monochrome= true,
		plugin= {
				"pretty", 
				"html:target/reports/cucumber.html",
				"json:target/reports/cucumber.json",
		}
		
		) 
public class Runner {

}
