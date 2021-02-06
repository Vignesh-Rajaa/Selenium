package week1.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccount {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		WebElement ele = driver.findElementById("username");
		ele.sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Accounts").click();
		driver.findElementByLinkText("Create Account").click();
		driver.findElementByXPath("//input[@class='inputBox']").sendKeys("Debit Limited Account");
		driver.findElementByXPath("//textarea[@class='inputBox']").sendKeys("Selenium Automation Tester");
		driver.findElementByXPath("(//input[@class='inputBox'])[3]").sendKeys("BVR");
		driver.findElementByXPath("//span[text()='Site Name']/following::input").sendKeys("www.leaftaps.com");
		//String annualRevenue = driver.findElement(By.xpath("//span[text()='Annual Revenue']/following::input")).getAttribute("attribute_value");

	}
}
