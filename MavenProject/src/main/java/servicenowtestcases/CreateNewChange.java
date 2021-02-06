package servicenowtestcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateNewChange {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dev68594.service-now.com/");
		driver.switchTo().frame("gsft_main");
		driver.findElementByXPath("//input[@name='user_name']").sendKeys("admin");
		driver.findElementById("user_password").sendKeys("India@123");
		driver.findElementByXPath("//button[text()='Login']").click();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.findElementByXPath("//input[@id='filter']").sendKeys("Change");
		driver.findElementByXPath("(//div[text()='All'])[4]").click();
		driver.switchTo().frame("gsft_main");
		driver.findElementByXPath("//button[text()='New']").click();
		driver.findElementByXPath("//div[@class='container-fluid wizard-container']//a").click();
		String incidentno = driver.findElementByXPath("//input[@id='change_request.number']").getAttribute("value");
		System.out.println(incidentno);
		driver.findElementByXPath("//input[@id='change_request.short_description']").sendKeys("Test");
		driver.findElementByXPath("//button[text()='Submit']").click();
		driver.findElementByXPath("//input[@class='form-control']").sendKeys(incidentno,Keys.ENTER);
		driver.switchTo().frame("gsft_main");
		String value = driver.findElementByXPath("//tr[@class='list_row list_odd']").getText();
		String incidentvalue = driver.findElementByXPath("//tr[@class='list_row list_odd']/td[3]").getText();
		if(value.contains(incidentvalue)) {
			System.out.println("created");
		}
		else {
			System.out.println("not created");
		}
		System.out.println("last line");
	}

}
