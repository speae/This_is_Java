package chapter3;

public class AccuracyExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		// �ε��Ҽ���(float, double)�� 0.1�� ��Ȯ�� ǥ���� �� ����.
		double result = apple - number * pieceUnit;
		
		System.out.print("��� �� ������ ");
		System.out.print("0.7 ������ ����, ");
		System.out.println(result + "������ ���´�.");
		
	}

}
