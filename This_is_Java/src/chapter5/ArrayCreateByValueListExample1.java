package chapter5;

public class ArrayCreateByValueListExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 중괄호는 주어진 값들을 항목으로 가지는 배열 객체를 힙에 생성하고, 배열 객체의 번지를 반환함.
		int[] scores = { 83, 90, 87 };
		
		System.out.println("scores[0] : " + scores[0]);
		System.out.println("scores[1] : " + scores[1]);
		System.out.println("scores[2] : " + scores[2]);
		
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum += scores[i];
		}
		
		System.out.println("총합 : " + sum);
		double avg = (double) sum / 3;
		System.out.println("총합 : " + avg);
	}

}
