package week2.day1.assingnments;

public class CharcOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "welcome to chennai";
		int count = 0;
		int len = str.length();
		for (int i = 0; i < len; i++) {
			if(str.charAt(i)=='e')
			{
				count++;
			}
		}
		System.out.println("Occurence Count :" + count);
	}

}
