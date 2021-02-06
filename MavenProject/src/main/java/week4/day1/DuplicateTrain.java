package week4.day1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateTrain {

	public static void main(String[] args) throws Exception{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://erail.in/");
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("ms",Keys.TAB);
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("mdu",Keys.TAB);
		driver.findElementById("chkSelectDateOnly").click();
		Thread.sleep(2000);
		List<WebElement> rows = driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr");
		int rowsCount = rows.size();
		List<String> listNames = new ArrayList<String>();
		for (int i = 1; i < rowsCount; i++) {
		String Train = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr["+i+"]/td[2]").getText();
		listNames.add(Train);
	}
		Set<String> setNames = new LinkedHashSet<String>(listNames);
		if(listNames.size()==setNames.size())
		{
			System.out.println("There are no duplicate trains");
		}
		else
		{
			System.out.println("There are duplicate trains");
		}
}
}
