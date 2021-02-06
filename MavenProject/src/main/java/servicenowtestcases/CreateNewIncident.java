package servicenowtestcases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.grpc.Context.Key;

public class CreateNewIncident {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dev68594.service-now.com/");
		driver.switchTo().frame("gsft_main");
		driver.findElementByXPath("//input[@name='user_name']").sendKeys("admin");
		driver.findElementById("user_password").sendKeys("India@123");
		driver.findElementByXPath("//button[text()='Login']").click();
		driver.findElementById("filter").sendKeys("incident");
		Thread.sleep(5000);
		driver.findElementByXPath("(//div[@class='sn-widget-list-content']/div[contains(text(),'All')])[2]").click();
		driver.switchTo().frame("gsft_main");
		driver.findElementByXPath("//button[text()='New']").click();
		String incidentno = driver.findElementById("incident.number").getAttribute("value");
		System.out.println(incidentno);
		Thread.sleep(3000);
		driver.switchTo().frame("gsft_main");
		driver.findElementByXPath("//span[@id='icon icon-search']").click();
		/*
		 * driver.findElementByXPath("//input[@id='sys_display.incident.caller_id']").
		 * sendKeys("abel");
		 * driver.findElementByXPath("//input[@id='incident.short_description']").
		 * sendKeys("Employee");
		 * driver.findElementByXPath("(//button[text()='Submit'])[1]").click();
		 */
		 
	}
}
