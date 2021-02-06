package week1.day2;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		WebElement element = driver.findElementByXPath("//input[@id = 'username']");
		element.sendKeys("DemoSalesManager");
		driver.findElementByXPath("//input[@id = 'password']").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@value='Login']").click();
		/*
		 * WebElement ele = driver.findElementById("username");
		 * ele.sendKeys("DemoSalesManager");
		 * driver.findElementById("password").sendKeys("crmsfa");
		 * driver.findElementByClassName("decorativeSubmit").click();
		 * driver.findElementByLinkText("CRM/SFA").click();
		 * driver.findElementByLinkText("Create Lead").click();
		 * driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf",Keys
		 * .TAB);
		 * driver.findElementById("createLeadForm_firstName").sendKeys("Vignesh");
		 * driver.findElementById("createLeadForm_lastName").sendKeys("Rajaa");
		 * WebElement dropdown= driver.findElementById("createLeadForm_dataSourceId");
		 * Select dd = new Select(dropdown);
		 */
		/*
		 * List<WebElement> options = dd.getOptions();
		 * System.out.println(options.size()); for (int i = 1; i < options.size(); i++)
		 * { options.get(options.size()-2).click(); }
		 */
		/*
		 * WebElement usingVisibleText =
		 * driver.findElementById("createLeadForm_dataSourceId"); Select dropdown= new
		 * Select(usingVisibleText); dropdown.selectByVisibleText("Employee");
		 * WebElement marketting =
		 * driver.findElementById("createLeadForm_marketingCampaignId"); Select
		 * dropdown1 = new Select(marketting); dropdown1.selectByValue("9001");
		 * WebElement owner = driver.findElementById("createLeadForm_ownershipEnumId");
		 * Select dropdown2 = new Select(owner); dropdown2.selectByIndex(5); WebElement
		 * country = driver.findElementById("createLeadForm_generalCountryGeoId");
		 * Select dropdown3 = new Select(country);
		 * dropdown3.selectByVisibleText("India");
		 */
		driver.findElementByName("submitButton").sendKeys(Keys.ENTER);
	}

}
