package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepsLogin extends Baseclass{
	/*
	 * @Given("Enter the username {string}") public void username(String uname) {
	 * driver.findElementById("username").sendKeys(uname); }
	 * 
	 * @Given("Enter the password {string}") public void password(String pwd) {
	 * driver.findElementById("password").sendKeys(pwd); }
	 */
	@When("Click login button")
	public void login() {
		driver.findElementByClassName("decorativeSubmit").click();
	}
	@Then("Verify the login")
	public void verifylogin() {
		System.out.println("Login is success");
	}
	@Given("Click the crmsfa link")
	public void ClickLink() {
		driver.findElementByLinkText("CRM/SFA").click();
	}
	@Given("Click Create Lead")
	public void ClickCreateLead() {
		driver.findElementByLinkText("Create Lead").click();
	}
	@Given("Enter Company Name {string}")
	public void CompanyName(String cmp) {
		 driver.findElementById("createLeadForm_companyName").sendKeys(cmp);
	}
	@Given("Enter First Name {string}")
	public void FirstName(String first) {
		driver.findElementById("createLeadForm_firstName").sendKeys(first);
	}
	@Given("Enter Last Name {string}")
	public void LastName(String last) {
		driver.findElementById("createLeadForm_lastName").sendKeys(last);
	}
	@Given("Click Create Lead button")
	public void CreateLead() {
		driver.findElementByClassName("smallSubmit").click();
	}
}
