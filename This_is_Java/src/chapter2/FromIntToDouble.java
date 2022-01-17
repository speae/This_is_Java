package chapter2;

public class FromIntToDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 1234567890;
		int num2 = 1234567890;
		
		// 부호(1비트) + 지수(11비트) + 가수(52비트) = 총 64비트
		// 가수(52비트) > int(32비트) --> 결과값을 정상적으로 출력
		double num3 = num2;
		num2 = (int) num3;
		
		int result = num1 - num2;
		System.out.println(result);
	}

}
