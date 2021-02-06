package week1.day1;

public class PrimeNum {

	public static void main(String[] args) {
		int num = 13;
		boolean flag = false;
		for(int i=2;i<num;i++)
		{
			int rem = num%2;
		if(rem == 0)
		{
			flag = true;
			break;
		}
		}
		if(flag == false)
		{
			System.out.println("13 is a prime number");
		}
		else
		{
			System.out.println("13 is not a prime");
		}
		
	}

}
