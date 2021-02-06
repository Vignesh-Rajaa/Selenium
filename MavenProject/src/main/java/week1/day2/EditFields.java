package week1.day2;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditFields {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Button.html");
		//WebElement fields = driver.findElementById("email");
		//fields.sendKeys("vigneshrajaa.balasubramani@gmail.com");
		//driver.findElementByXPath("((//div[contains(@class,'large-6 small-12')]//input)[2]").sendKeys("Vignesh",Keys.TAB);
		//Verification of Web Browser
		//System.out.println("The title of the page:"+ driver.getTitle());
		//System.out.println("The current URL is:"+ driver.getCurrentUrl());
		//System.out.println("The Page Source is:"+ driver.getPageSource());
		//Verification of Web Element
		//System.out.println(driver.findElementByName("username").getAttribute("value"));
		System.out.println(driver.findElementById("color").getCssValue("background-color"));
		System.out.println(driver.findElementById("color").getText());
		
		driver.close();
	}
}
