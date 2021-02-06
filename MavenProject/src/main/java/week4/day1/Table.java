package week4.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Table {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/table.html");
		List<WebElement> columnCount = driver.findElementsByXPath("//table[@id='table_id']//tr/th");
		int column = columnCount.size();
		System.out.println("Column Count :" +column);
		List<WebElement> rowsCount = driver.findElementsByXPath("//table[@id='table_id']//tr");
		int rows = rowsCount.size();
		System.out.println("Rows Count:" +rows);
		String text = driver.findElementByXPath("//table[@id='table_id']//tr[3]/td[2]").getText();
		System.out.println(text);
		String vitalTask = driver.findElementByXPath("//table[@id='table_id']//tr[4]/td[2]").getAttribute("checkbox");
		System.out.println(vitalTask);
		
	}

}
