package week1.day1;

public class Factorial {

	public static void main(String[] args) {
		int myNum = 5;
		int fact=1;
		for (int i = 1; i < myNum; i++) {
			fact = fact*i+fact;
		}
		System.out.println("Factorial of 5 is "+fact); 
	}

}
