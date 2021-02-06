package week3.day1;

		class Calculator {
			public void add(int a,int b) {
				System.out.println(a+b);

			}
			public void add(int a,int b,int c) {
				System.out.println(a+b+c);

			}
			public void multiply(int a,int b) {
				System.out.println(a*b);

			}
			public void multiply(int a,int b,int c) {
				System.out.println(a*b*c);

			}
			public void subraction(int a, int b) {
				System.out.println(a-b);

			}
			public void subraction(double d,double e)
			{
				System.out.println(d-e);
			}
			public void divide(int a,int b)
			{
				System.out.println(a/b);
					
			}
			private void divide(int a, double d) {
			System.out.println(d/a);
			}
		public static void main(String args[])
		{
			Calculator c = new Calculator();
			c.add(10, 15);
			c.add(10, 5, 20);
			c.multiply(10, 5);
			c.multiply(10, 5, 15);
			c.subraction(10, 5);
			c.subraction(10.20, 10);
			c.divide(10, 5);
			c.divide(20, 10.22);
		}
}