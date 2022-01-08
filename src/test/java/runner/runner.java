package runner;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
//import cucumber.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
//@Cucumber.Options(format = {"pretty", "html:target/cucumber"})
@CucumberOptions(
        features = {"src/test/java/Steps/"}
)

public class runner{ }