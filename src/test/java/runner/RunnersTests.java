package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/"}, 
        //tags = {"@AppliTest, @LoginTest, @ResponseTest,@PositiveTest,@NegativeTest"},
        glue={"stepDefinition"},
        plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json",
        		 "junit:target/cucumber-reports/Cucumber.xml",
        		 "html:target/cucumber-reports"}
)
public class RunnersTests {
    public static void main(String[] args) {
    }
}
