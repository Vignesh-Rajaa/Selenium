package seleniumworkshop;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Carwale {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.carwale.com/");
		Thread.sleep(2000);
		WebElement cars = driver.findElementByXPath("//div[text()='USED CARS']");
		Actions builder = new Actions(driver);
		builder.moveToElement(cars).perform();
		System.out.println("last line");
	}

}
