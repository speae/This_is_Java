package chapter4;

public class SwitchStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String position = "����";
		
		// jdk version > 9
		Runtime.Version version = Runtime.version();
		int versionFeature= version.feature();
		System.out.println("jdk version = " + versionFeature);
		
		if (versionFeature < 17) {
			switch (position) {
			case "부장":
				System.out.println("700만원");
				break;
			case "과장": 
				System.out.println("500만원");
				break;
			
			default:
				System.out.println("300만원");
				break;
			}
			
		}else {
			System.out.println(
					switch (position) {
					case "부장" -> "700만원";
					case "과장" -> "500만원";
					
					default -> "300만원";
			});
		}
	}

}
