package chapter3;

public class StringEqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// strVar1�� strVar2�� ������ String ��ü�� �������� ����
		String strVar1 = "�Ź�ö";
		String strVar2 = "�Ź�ö";
		
		// �׷��� strVar3�� ��ü ���� �������� new�� ������ ���ο� String ��ü�� �������� ����.
		String strVar3 = new String("�Ź�ö");
		
		// String; ���� Ÿ��
		// ���� Ÿ���� stack ������ �������� heap ������ ��ü �������� ����
		System.out.println(strVar1 == strVar2);
		// ���� �ٸ� ��ü�� �������� ��
		System.out.println(strVar2 == strVar3);
		System.out.println();
		// equals : ��ü�� ���ڿ����� ��
		System.out.println(strVar1.equals(strVar2));
		System.out.println(strVar1.equals(strVar3));
		
	}

}
