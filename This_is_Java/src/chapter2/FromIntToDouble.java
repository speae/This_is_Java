package chapter2;

public class FromIntToDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 1234567890;
		int num2 = 1234567890;
		
		// ��ȣ(1��Ʈ) + ����(11��Ʈ) + ����(52��Ʈ) = �� 64��Ʈ
		// ����(52��Ʈ) > int(32��Ʈ) --> ������� ���������� ���
		double num3 = num2;
		num2 = (int) num3;
		
		int result = num1 - num2;
		System.out.println(result);
	}

}
