import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nyka {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nykaa.com/");
		Thread.sleep(10000);
		WebElement men = driver.findElementByXPath("(//li[@class='MegaDropdownHeadingbox'])[9]");
		Actions builder = new Actions(driver);
		builder.moveToElement(men).perform();
		driver.findElementByLinkText("Hair Color").click();
		System.out.println("last line");
	}

}
