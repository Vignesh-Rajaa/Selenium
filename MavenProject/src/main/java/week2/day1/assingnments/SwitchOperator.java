package week2.day1.assingnments;

public class SwitchOperator {

	public static void main(String[] args) {
		int a=5, b=10;
		String input = "sub";
		switch(input)
		{
		case "add":
			System.out.println(a+b);
			break;
		case "sub":
			System.out.println(a-b);
			break;
		case "mul":
			System.out.println(a*b);
			break;
		case "div":
			System.out.println(a/b);
			break;
		default:
			System.out.println("Not calculating");
		}
	}

}
