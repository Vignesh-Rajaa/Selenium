package week3.day2;

public class College extends University {

	@Override
	public void ug() {
		// TODO Auto-generated method stub
		System.out.println("Under-Graduate");
	}
	public static void main(String[] args) {
		College s = new College();
		s.pg();
		s.ug();
	}
}
