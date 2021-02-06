package testng.day1;

import org.testng.annotations.Test;

public class TestSet {
	@Test(dependsOnMethods = "testng.day1.SampleTest.EditTest",alwaysRun = true)
	public void DuplicateTest() {
		System.out.println("fourth");
	}
}
