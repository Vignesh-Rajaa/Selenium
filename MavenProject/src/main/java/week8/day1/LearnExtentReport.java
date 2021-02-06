package week8.day1;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnExtentReport {

	public static void main(String[] args) throws IOException {
		//Step1: create ea physical report
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./reports/result.html");
		//to see history
		reporter.setAppendExisting(true);
		//Step2:create actual report
		ExtentReports extent = new ExtentReports();
		//Step3: Attach the extent data to the physical report
		extent.attachReporter(reporter);
		ExtentTest testcase1 = extent.createTest("CreateLead", "Create Lead with mandatory info");
		testcase1.assignAuthor("Vignesh");
		testcase1.assignCategory("Smoke Test");
		testcase1.pass("Lead created successfully",MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/login.png").build());
		extent.flush();
	}

}
