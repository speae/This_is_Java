package chapter3;

public class SignOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
		
		short s = 100;
		// short result3 = -s <-- 연산시 int형으로 연산되므로 저장되는 변수도 int형으로 변환해야 함.
		int result3 = -s;
		System.out.println("result3 = " + result3);
	}

}
