package servicenowtestcases;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignTheIncident {

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
		Thread.sleep(6000);
		driver.switchTo().frame("gsft_main");
		driver.findElementByXPath("(//input[@class='form-control'])[1]").sendKeys("INC0016502",Keys.ENTER);
		driver.findElementByLinkText("INC0016502").click();
		driver.findElementByXPath("(//span[@class='icon icon-search'])[4]").click();
		Set<String> windowhandles = driver.getWindowHandles();
		List<String> listofhandles = new ArrayList<String>(windowhandles);
		String secondwindow = listofhandles.get(1);
		driver.switchTo().window(secondwindow);
		driver.findElementByXPath("(//input[@class='form-control'])[1]").sendKeys("Software",Keys.ENTER);
		driver.findElementByXPath("//a[text()='Team Development Code Reviewers']").click();
		String firstwindow = listofhandles.get(0);
		driver.switchTo().window(firstwindow);
		Thread.sleep(5000);
		driver.switchTo().frame("gsft_main");
		driver.findElementByXPath("(//button[text()='Update'])[1]").click();
		String value = driver.findElementByXPath("//tr[@record_class='incident']").getText();
		String verifyAssignment = driver.findElementByXPath("//tr[@record_class='incident']/td[8]").getText();
		if(value.contains(verifyAssignment)) {
			System.out.println("verified");
		}
		else {
			System.out.println("not verified");
		}
		System.out.println("last line");	
	}

}
