package chapter2;

public class FromIntToFloat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 1234567890;
		int num2 = 1234567890;
		
		// ��ȣ(1��Ʈ) + ����(8��Ʈ) + ����(23��Ʈ) = �� 32��Ʈ
		// ����(23��Ʈ) < int(32��Ʈ) --> ����� ����
		float num3 = num2;
		num2 = (int) num3;
		
		int result = num1 - num2;
		System.out.println(result); // -46
	}

}
