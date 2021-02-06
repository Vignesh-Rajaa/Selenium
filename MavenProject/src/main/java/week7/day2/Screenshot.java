package week7.day2;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {
public static void main(String[] args) throws IOException {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	WebElement usernamelabel = driver.findElementByXPath("//label[text()='Username']");
	//to take screenshot of particular element
	File source = usernamelabel.getScreenshotAs(OutputType.FILE);
	File target = new File("./snaps/username.png");
	FileUtils.copyFile(source, target);
	
	
	//to take screeshot of whole page
		/*
		 * File source = driver.getScreenshotAs(OutputType.FILE); File target = new
		 * File("./snaps/login.png"); FileUtils.copyFile(source, target);
		 */
}
}
