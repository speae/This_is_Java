package chapter2;

public class OperationsPromotionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		// ũ�Ⱑ 4byte���� ���� Ÿ�Ե��� 4byte�� int ���·� ��ȯ�� �� ���� ����
		// ���� ���� ����� int ���� ��.
		// byte byteValue3 = byteValue1 + byteValue2;
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);
		
		char charValue1 = 'A';
		char charValue2 = 1;
		int intValue2 = charValue1 + charValue2;
		System.out.println("�����ڵ� = " + intValue2);
		System.out.println("��¹��� = " + (char) intValue2);
		
		int intValue3 = 10;
		int intValue4 = intValue3 / 4;
		System.out.println(intValue4);
		
		int intValue5 = 10;
		// ���� �ٸ� Ÿ���� �ǿ����ڰ� ���� �ܿ� �� �ǿ����� �� ũ�Ⱑ ū Ÿ������ �ڵ� ��ȯ�� �� ���� ����
		// ����Ǵ� ������ Ÿ���� ũ�Ⱑ ū Ÿ������ ���ϰų� ����ȯ�ؾ� ��.
		// int intValue6 = 10 / 4.0; -> ������ ����
		// double doubleValue = 10 / 4.0;
		int intValue6 = 10 / (int)4.0; 
		double doubleValue = intValue5 / 4.0;
		System.out.println(intValue6); // 2
		System.out.println(doubleValue); // 2.5	 
	}

}
