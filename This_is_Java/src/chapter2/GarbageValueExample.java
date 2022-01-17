package chapter2;

public class GarbageValueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte var1 = 125;
		int var2 = 125;
		
		// byte 변수값이 127을 넘기는 순간 -128 부터 저장됨.
		for(int i = 0; i < 5; i++) {
			var1++;
			var2++;
			System.out.println("var1 :" + var1 + "\t" + "var2 : " + var2);
		}
		
	}
}
