package week2.day1.assingnments;

public class ArmstrongNumber {

	public static void main(String[] args) {
        int calculated=0 , remainder, temp;
        int original = 153;
        temp = original;
        while(original > 0)
        {
        	remainder = original % 10;
        	original = original / 10;
        	calculated =calculated + (remainder * remainder * remainder);
        }	
        if(temp == calculated)
        {
        	System.out.println("Armstrong number");
        }
        else
        {
        	System.out.println("Not");
        }
	}
}
