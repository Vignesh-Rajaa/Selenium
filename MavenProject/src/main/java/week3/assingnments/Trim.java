package week3.assingnments;

import java.util.ArrayList;

public class Trim {

	public static void main(String[] args) {
		ArrayList <String> values = new ArrayList <String>();
		
		  values.add("Harley Davidson");
		  values.add("Indian Motors");
		  values.add("Ducati");
		  values.add("Triumph");
		 
		
		  System.out.println("Before Triming" +values);
		  //System.out.println("***********"); 
		  //To trim the string values.trimToSize();
		  //System.out.println("Reverse a String:" +values); 
		  //To check the string is empty or not System.out.println("Before Empty:" +values.isEmpty());
		  //values.removeAll(values); 
		  //System.out.println("After Empty:" +values.isEmpty());
		  ArrayList <String> bikes =  (ArrayList <String>)values.clone();
		  System.out.println("Bikes:"+bikes);
	}

}
