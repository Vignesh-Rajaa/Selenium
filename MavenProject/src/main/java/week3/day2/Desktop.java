package week3.day2;

public class Desktop implements Hardware, Software
{

	@Override
	public void hardwareResources() {
		// TODO Auto-generated method stub
		 {
			 System.out.println("Hardware");
		 } 
}


	@Override
	public void softwareResources() {
		// TODO Auto-generated method stub
	System.out.println("Software");	
	}
public static void main(String args[])
{
	Desktop d = new Desktop();
	d.hardwareResources();
	d.softwareResources();
}
}