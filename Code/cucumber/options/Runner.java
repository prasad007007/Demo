package cucumber.options;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {
        //"Resources/featuresPackage/flipkartLogin.feature",
        "Resources/featuresPackage/amazingFlipkart.feature"},
        glue = {"testStepsPackages"},
dryRun = false,
        plugin = {"html:Reports/test-result.html"}
)
public class Runner {
}
