package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/Features", glue = "steps", monochrome = true, publish = true )
public class RunTest extends AbstractTestNGCucumberTests{

}
