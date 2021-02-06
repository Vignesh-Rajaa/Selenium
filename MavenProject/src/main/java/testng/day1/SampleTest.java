package testng.day1;

import org.testng.annotations.Test;

public class SampleTest {
	
		@Test(priority = 1)
		public void CreateTest() {
			System.out.println("First");
		}
		@Test(priority = 2)
		public void EditTest() {
			System.out.println("Second");
		}
		@Test(priority = 3)
		public void DeleteTest() {
			System.out.println("Third");

		}
		}
