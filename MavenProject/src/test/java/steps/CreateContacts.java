package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateContacts {
	public class StepsLogin extends Baseclass{
		@Given("Enter username")
		public void Username(){
			driver.findElementById("username").sendKeys("DemoSalesManager");
		}
		@Given("Enter password")
		public void Password()
		{
			driver.findElementById("password").sendKeys("crmsfa");
		}
		@When("Click the Login")
		public void login() {
			driver.findElementByClassName("decorativeSubmit").click();
		}
		@Then("Verify the Login")
		public void verifylogin() {
			System.out.println("Login is success");
		}
		@Given("Click the crmsfa link")
		public void ClickLink() {
			driver.findElementByLinkText("CRM/SFA").click();
		}
}
}
