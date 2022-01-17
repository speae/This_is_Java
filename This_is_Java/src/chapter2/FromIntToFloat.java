package chapter2;

public class FromIntToFloat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 1234567890;
		int num2 = 1234567890;
		
		// 부호(1비트) + 지수(8비트) + 가수(23비트) = 총 32비트
		// 가수(23피트) < int(32비트) --> 결과값 오류
		float num3 = num2;
		num2 = (int) num3;
		
		int result = num1 - num2;
		System.out.println(result); // -46
	}

}
