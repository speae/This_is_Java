package chapter2;

public class OperationsPromotionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		// 크기가 4byte보다 작은 타입들은 4byte인 int 형태로 변환한 후 연산 수행
		// 따라서 연산 결과도 int 형이 됨.
		// byte byteValue3 = byteValue1 + byteValue2;
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);
		
		char charValue1 = 'A';
		char charValue2 = 1;
		int intValue2 = charValue1 + charValue2;
		System.out.println("유니코드 = " + intValue2);
		System.out.println("출력문자 = " + (char) intValue2);
		
		int intValue3 = 10;
		int intValue4 = intValue3 / 4;
		System.out.println(intValue4);
		
		int intValue5 = 10;
		// 서로 다른 타입의 피연산자가 있을 겨우 두 피연산자 중 크기가 큰 타입으로 자동 변환된 후 연산 수행
		// 저장되는 변수의 타입은 크기가 큰 타입으로 정하거나 형변환해야 함.
		// int intValue6 = 10 / 4.0; -> 컴파일 에러
		// double doubleValue = 10 / 4.0;
		int intValue6 = 10 / (int)4.0; 
		double doubleValue = intValue5 / 4.0;
		System.out.println(intValue6); // 2
		System.out.println(doubleValue); // 2.5	 
	}

}
