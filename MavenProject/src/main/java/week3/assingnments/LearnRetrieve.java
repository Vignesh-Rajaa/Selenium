package week3.assingnments;

import java.util.ArrayList;
import java.util.List;

public class LearnRetrieve {

	public static void main(String[] args) {
		List <String> values = new ArrayList<String>();
		values.add("Hari");
		values.add("Naveen");
		values.add("Bowya");
		values.add("Sarath");
		values.add("Sam");
		values.add("Dhivya");
		System.out.println("First Element :" +values.get(0));
		System.out.println("Fourth Element :"+values.get(3));
	}

}
