package week7.day2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotAssignment {

	public static void main(String[] args) throws IOException {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leafground.com/pages/Window.html");
	File source = driver.getScreenshotAs(OutputType.FILE);
	File target = new File("./snaps/homepage.png");
	FileUtils.copyFile(source, target);
	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	driver.findElementByXPath("//button[text()='Open Home Page']").click();
	Set<String> handles = driver.getWindowHandles();
	List<String> listofHandles = new ArrayList<String>(handles);
	String secondwindow = listofHandles.get(1);
	driver.switchTo().window(secondwindow);
	File source1 = driver.getScreenshotAs(OutputType.FILE);
	File target1 = new File("./snaps/newhome.png");
	FileUtils.copyFile(source1, target1);
		/*
		 * String firstwindow = listofHandles.get(0);
		 * driver.switchTo().window(firstwindow);
		 */
	}

}
