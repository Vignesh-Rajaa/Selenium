package servicenowtestcases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class UpdateExistingIncident {
		
		public static void main() throws InterruptedException {
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
		Thread.sleep(10000);
		driver.switchTo().frame("gsft_main");
		driver.findElementByXPath("(//input[@class='form-control'])[1]").sendKeys("INC0016502",Keys.ENTER);
		driver.findElementByLinkText("INC0016502").click();
		WebElement state =driver.findElementById("incident.state"); 
		Select dropdown = new Select(state); 
		dropdown.selectByVisibleText("In Progress"); 
		WebElement urgency = driver.findElementById("incident.urgency");
		Select dropdown1 = new Select(urgency);
		dropdown1.selectByIndex(0);driver.findElementByXPath("//button[@id='sysverb_update']").click();
		String value =driver.findElementByXPath("//tr[@record_class='incident']").getText();
		System.out.println(value);
		String verifyProgress = driver.findElementByXPath("//tr[@record_class='incident']/td[8]").getText();
		System.out.println(verifyProgress);
		String verifyStatus = driver.findElementByXPath("//tr[@record_class='incident']/td[7]").getText(); 
		System.out.println(verifyStatus);
		if(value.contains(verifyStatus) && value.contains(verifyProgress))
		{
			System.out.println("verified");
		}
		else {
			System.out.println("not verified");
		}
		System.out.println("last line");
	}

}
