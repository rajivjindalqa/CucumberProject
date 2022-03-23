package StepDefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions
(
	features= "src/test/resources/cnncLogin",glue= {"StepDefination","carrierDataReported"}
		
		)
public class runner {

}
