package week3.assingnments;

import java.util.ArrayList;
import java.util.List;

public class LearnInsert {

	public static void main(String[] args) {
		List<String> values = new ArrayList <String>();
		values.add("C");
		values.add("C++");
		values.add("C#");
		values.add("Java");
		values.add("Python");
		System.out.println("Before inserting elements: " +values);
		values.add(values.size()-5,"JavaScript");
		values.add(values.size()-1,"R");
		System.out.println("After inserting elements: " +values);
	}

}
