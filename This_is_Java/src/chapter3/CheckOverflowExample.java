package chapter3;

public class CheckOverflowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int result = safeAdd(2000000000, 2000000000);
			System.out.println(result);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("오버플로우가 발생하여 정확하게 계산할 수 없음.");
		}
	}
	
	
	 public static int safeAdd(int left, int right) {
		if (right > 0) {
			if (left > (Integer.MAX_VALUE - right)) {
				throw new ArithmeticException("오버플로우 발생.");
			}
		}else {
			if (left < (Integer.MIN_VALUE - right)) {
				throw new ArithmeticException("오버플로우 발생.");
			}
		}
		return left + right;
	}

}
