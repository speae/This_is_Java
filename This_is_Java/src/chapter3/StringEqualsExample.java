package chapter3;

public class StringEqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// strVar1과 strVar2는 동일한 String 객체의 번지값을 가짐
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		
		// 그러나 strVar3은 객체 생성 연산자인 new로 생성한 새로운 String 객체의 번지값을 가짐.
		String strVar3 = new String("신민철");
		
		// String; 참조 타입
		// 참조 타입은 stack 영역의 변수에서 heap 영역의 객체 번지값을 참조
		System.out.println(strVar1 == strVar2);
		// 서로 다른 객체의 번지값을 비교
		System.out.println(strVar2 == strVar3);
		System.out.println();
		// equals : 객체의 문자열만을 비교
		System.out.println(strVar1.equals(strVar2));
		System.out.println(strVar1.equals(strVar3));
		
	}

}
