package chapter3;

public class StringConcatExample {

		public static void main(String[] args) {
			String str1 = "JDK" + 17;
			String str2 = str1 + " Ư¡";
			System.out.println(str2);
			
			String str3 = "jre" + 17 + 0.1;
			String str4 = 17 + 0.1 + "jre";
			System.out.println(str3);
			System.out.println(str4);
			
			
		}
}
