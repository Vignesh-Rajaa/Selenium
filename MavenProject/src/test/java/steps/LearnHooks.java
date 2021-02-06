
package steps;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnHooks extends Baseclass{
	@Before
	public void BeforeScenario(Scenario sc) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		System.out.println("Names"+sc.getName());
		System.out.println("URI"+sc.getUri());
		System.out.println("Line"+sc.getLine());
		 
}
	@After
	public void AferScenario(Scenario sc) {
		System.out.println("Status:"+sc.getStatus());
	}
}
