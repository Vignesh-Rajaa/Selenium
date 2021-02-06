package week1.day2;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Page {

	public static void main(String[] args) {
		// To create Chrome driver 
		WebDriverManager.chromedriver().setup();
		// To create an object for chrome driver
		ChromeDriver driver = new ChromeDriver();
		// To launch an URL
		driver.get("http://leaftaps.com/opentaps");
		// To maximize the page
		driver.manage().window().maximize();
		driver.findElementById("Username").sendKeys("DemoSalesManager");
		driver.findElementByName("Password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
	}

}