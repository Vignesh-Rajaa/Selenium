package week7.day2;

import java.util.LinkedHashMap;
import java.util.Map;

class Occurenceusingmap {
public static void main(String[] args) {
	String input = "suhitha";
	//convert the input into character array
	char[] charArray = input.toCharArray();
	//create empty map
	Map<Character,Integer> values = new LinkedHashMap<Character,Integer>();
	
	for (char ch : charArray) {
		if(values.containsKey(ch))
		{
			values.put(ch, values.get(ch)+1);
		}
		else {
			values.put(ch, 1);
		}
		System.out.println(values);
	}
}
}
