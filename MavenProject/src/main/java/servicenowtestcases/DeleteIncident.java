package servicenowtestcases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteIncident {

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
		Thread.sleep(10000);
		driver.switchTo().frame("gsft_main");
		driver.findElementByXPath("(//input[@class='form-control'])[1]").sendKeys("INC0010100",Keys.ENTER);
		driver.findElementByLinkText("INC0010100").click();
		driver.findElementByXPath("(//button[@class='form_action_button header  action_context btn btn-default'])[3]").click();
		Thread.sleep(5000);
		/*
		 * Alert alert1 = driver.switchTo().alert(); alert1.accept();
		 */
		driver.findElementByXPath("//button[text()='Delete']").click();
		driver.findElementByXPath("form-control").sendKeys("INC0010100",Keys.ENTER);
		String value = driver.findElementByXPath("//tr[@class='list2_no_records']").getText();
		String verifyDelete = driver.findElementByXPath("//tr[@class='list2_no_records']/td").getText();
		if(value.contains(verifyDelete)) {
			System.out.println("deleted");
		}
		else {
			System.out.println("not deleted");
		}    
	}

}
