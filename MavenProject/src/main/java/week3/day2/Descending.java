package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Descending {

	public static void main(String[] args) {
	List<String> values = new ArrayList<String>();
	values.add("HCL");
	values.add("Wipro");
	values.add("Aspire System");
	values.add("CTS");
	Collections.sort(values);
	for (String eachvalue : values) {
		System.out.println(values);
	}
	}

}
