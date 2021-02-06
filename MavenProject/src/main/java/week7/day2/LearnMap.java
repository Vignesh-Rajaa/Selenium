package week7.day2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LearnMap {

	public static void main(String[] args) {
		Map<Integer, String> values = new HashMap<Integer, String>();
		values.put(100, "Vicky");
		values.put(200, "Vignesh");
		values.put(300, "Rajaa");
		System.out.println(values);
		Set<Entry<Integer, String>> entrySet = values.entrySet();
		for (Entry<Integer, String> eachentry : entrySet) {
			System.out.println(eachentry.getValue());
		}
	}
}
