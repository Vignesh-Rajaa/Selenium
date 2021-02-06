package week1.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateDropDown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Dropdown.html");
		WebElement usingValue = driver.findElementById("dropdown1");
		Select dropdown1 = new Select(usingValue);
		dropdown1.selectByValue("4");
		WebElement usingVisibleText = driver.findElementByName("dropdown2");
		Select dropdown2 = new Select(usingVisibleText);
		dropdown2.selectByVisibleText("Selenium");
		WebElement usingIndex = driver.findElementById("dropdown3");
		Select dropdown3 = new Select(usingIndex);
		dropdown3.selectByIndex(3);
		//WebElement of combo box
		WebElement combo = driver.findElementByXPath("//div[@id='contentblock']/section[1]/div[6]/select[1]");
		Select multiple = new Select(combo);
		//To select multiple item
		multiple.selectByVisibleText("Selenium");
		multiple.selectByVisibleText("Appium");
	}

}
