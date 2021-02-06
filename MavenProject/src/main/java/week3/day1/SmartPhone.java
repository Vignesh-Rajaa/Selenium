package week3.day1;

public class SmartPhone extends AndroidPhone{
		public void connectWhatsapp() {
			System.out.println("Connected");

		}
		public static void main(String[] args) {
			SmartPhone obj = new SmartPhone();
			obj.sendMsg();
			obj.makeCall();
			obj.saveContact();
			obj.takeVideo();
			obj.connectWhatsapp();
		}
}
