package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/Features/Contact.feature",glue = "CreateContacts",monochrome = true,publish = true)
public class ContactRunTest extends AbstractTestNGCucumberTests{

}
