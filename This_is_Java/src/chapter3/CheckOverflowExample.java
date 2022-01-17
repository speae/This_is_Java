package chapter3;

public class CheckOverflowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int result = safeAdd(2000000000, 2000000000);
			System.out.println(result);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("�����÷ο찡 �߻��Ͽ� ��Ȯ�ϰ� ����� �� ����.");
		}
	}
	
	
	 public static int safeAdd(int left, int right) {
		if (right > 0) {
			if (left > (Integer.MAX_VALUE - right)) {
				throw new ArithmeticException("�����÷ο� �߻�.");
			}
		}else {
			if (left < (Integer.MIN_VALUE - right)) {
				throw new ArithmeticException("�����÷ο� �߻�.");
			}
		}
		return left + right;
	}

}
