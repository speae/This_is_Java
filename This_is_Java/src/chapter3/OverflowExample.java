package chapter3;

public class OverflowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int x = 1000000;
//		int y = 1000000;
//		int z = x * y;
//		--> overflow
		long x = 1000000;
		long y = 1000000;
		long z = x * y;
		
		System.out.println(z);
	}

}
