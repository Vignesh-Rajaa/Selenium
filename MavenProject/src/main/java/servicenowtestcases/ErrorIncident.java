package servicenowtestcases;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErrorIncident {

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
		driver.findElementByXPath("//button[text()='Submit']").click();
		/*
		 * Alert alert1 = driver.switchTo().alert(); String text = alert1.getText();
		 */
		String value = driver.findElementByXPath("//div[@class='outputmsg outputmsg_error notification notification-error']").getText();
		String msg = driver.findElementByXPath("//span[text()='The following mandatory fields are not filled in: Short description, Caller']").getText();
		if(value.contains(msg)){
			System.out.println("alert");
		}
		else {
			System.out.println("not alert");
		}
	}

}
