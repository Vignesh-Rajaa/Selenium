package testcase;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import testng.day2.CreatExcel;

public class CreateLead extends BaseClass {
	@Test(dataProvider = "fetchData")
	public void runCreateLead(String company, String firstName, String lastName) {

		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(company);
		driver.findElementById("createLeadForm_firstName").sendKeys(firstName);
		driver.findElementById("createLeadForm_lastName").sendKeys(lastName);
		driver.findElementByName("submitButton").click();

	}
	
	  @DataProvider(name="fetchData")
	  public String[][] sendData() throws IOException { 
	  CreatExcel ce = new CreatExcel();
	  String[][] readData =ce.readData();
	  /*String[][] data = new String[2][3]; data[0][0]="TestLeaf";
	  data[0][1]="Vignesh"; data[0][2]="B";
	  
	  data[1][0]="Hexaware"; data[1][1]="Rajaa"; data[1][2]="V";*/
	  
	  return readData; }
	 
}
