package chapter3;

public class AccuracyExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		// 부동소수점(float, double)은 0.1을 정확히 표현할 수 없음.
		double result = apple - number * pieceUnit;
		
		System.out.print("사과 한 개에서 ");
		System.out.print("0.7 조각을 빼면, ");
		System.out.println(result + "조각이 남는다.");
		
	}

}
