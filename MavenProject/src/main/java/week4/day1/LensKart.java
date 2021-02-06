package week4.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LensKart {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.lenskart.com");
		WebElement comp = driver.findElementByXPath("//a[text()='Computer Glasses']");
		Actions builder = new Actions(driver);
		builder.moveToElement(comp).perform();
		WebElement men = driver.findElementByXPath("//div[@class='gender active']//span");
		builder.moveToElement(men).perform();
		WebElement batch = driver.findElementByXPath("//span[text()='PREMIUM RANGE']");
		builder.moveToElement(batch).click().perform();
	}

}
