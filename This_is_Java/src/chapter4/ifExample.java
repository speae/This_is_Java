package chapter4;

public class ifExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 93;
		if (score >= 90) {
			System.out.println("정수가 90보다 큽니다.");
			System.out.println("등급은 A 입니다.");
		}
		
		if (score < 90) System.out.println("정수가 90보다 작습니다.");
		
		//if 블록 바깥 -> if문과 상관없이 실행
		System.out.println("등급은 B 입니다.");
		
		
	}

}
