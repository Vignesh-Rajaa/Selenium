package week3.day1;

	class SmartPhone1 extends AndroidPhone1 {
		@Override
		public void takeVideo() {
			System.out.println("taken");
		}
		public static void main(String[] args) {
			SmartPhone1 c = new SmartPhone1();
			c.takeVideo();
		}
		}
	

