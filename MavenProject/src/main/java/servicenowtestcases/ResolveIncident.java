package servicenowtestcases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ResolveIncident {

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
		Thread.sleep(5000);
		driver.switchTo().frame("gsft_main");
		driver.findElementByXPath("(//input[@class='form-control'])[1]").sendKeys("INC0007002",Keys.ENTER);
		driver.findElementByLinkText("INC0007002").click();
		WebElement state =driver.findElementById("incident.state"); 
		Select dropdown = new Select(state); 
		dropdown.selectByVisibleText("Resolved"); 
		driver.findElementByXPath("//span[text()='Resolution Information']").click();
		WebElement resolve = driver.findElementByXPath("//select[@id='incident.close_code']");
		Select dropdown1 = new Select(resolve);
		dropdown1.selectByIndex(1);
		Thread.sleep(2000);
		driver.findElementByXPath("//textarea[@id='incident.close_notes']").sendKeys("nil");
		driver.findElementByXPath("(//button[text()='Update'])[2]").click();
		String value =driver.findElementByXPath("//tr[@record_class='incident']").getText();
		System.out.println(value);
		String verifyResolve = driver.findElementByXPath("//tr[@record_class='incident']/td[8]").getText();
		if(value.contains(verifyResolve)) {
			System.out.println("verified");
		}
		else {
			System.out.println("not verified");
		}
	}

}
