package week4.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindowsAlert {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElementByXPath("//button[text()='Ok']").click();
		driver.findElementByXPath("//a[text()=' FLIGHTS ']").click();
		Set<String> handles = driver.getWindowHandles();
		for (String eachHandle : handles) {
			System.out.println(eachHandle);
		}
		List<String> listofHandles = new ArrayList<String>(handles);
		String secondwindow = listofHandles.get(1);
		driver.switchTo().window(secondwindow);
		System.out.println(driver.getTitle());
		String firstwindow = listofHandles.get(0);
		driver.switchTo().window(firstwindow);
		driver.close();
	}

}
