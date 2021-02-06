package week2.day1.assingnments;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		int [] data = {3,2,11,4,6,7};
		int size = data.length;
		Arrays.sort(data);
		System.out.println(data);
		for(int i = size + 1; i>=0;i--)
		{
			int num = data.length-2;
		if(i==num)
		{
			System.out.println(data[i]);
		}
		}
	}

}
