package week2.day1.assingnments;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//input[@id='ext-gen248']").sendKeys("Vignesh");
		driver.findElementByLinkText("Find Leads").click();
		Thread.sleep(2000);
		driver.findElementByLinkText("10012").click();
		System.out.println(driver.getTitle());
		driver.findElementByLinkText("Edit").click();
		driver.findElementByXPath("//input[@class='inputBox']").clear();
		driver.findElementByXPath("//input[@class='inputBox']").sendKeys("KSR");
		driver.findElementByClassName("smallSubmit").click();
		System.out.println("Changed Nmae : KSR");
		driver.close();
	}

}
