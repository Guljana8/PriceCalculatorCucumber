package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //providing path for the feature directory
        features = "src/test/resources/features",
        glue="steps",
        dryRun = false,
        tags="@priceCalculator",
        //removes unnecessary info from the console
        monochrome = true,
        //pretty keywords prints the steps in the console to increase readability,
        //to generate the report we need plugin of runner class
        plugin = {"pretty","html:target/cucumber.html", "json:target/cucumber.json"}

)
public class SmokeRunner {
}
