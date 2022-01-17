package chapter3;

public class CompareOperatorExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3);
		
		double v4 = 0.1;
		float v5 = 0.1f;
		
		// 정확한 결과값 x
		System.out.println(v4 == v5);
		
		// 같은 타입으로 형변환
		System.out.println((float)v4 == v5);
		
		// 정수로 변환하여 비교
		System.out.println((int)(v4*10) == (int)(v5*10));
	}

}
