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
			case "����":
				System.out.println("700����");
				break;
			case "����": 
				System.out.println("500����");
				break;
			
			default:
				System.out.println("300����");
				break;
			}
			
		}else {
			System.out.println(
					switch (position) {
					case "����" -> "700����";
					case "����" -> "500����";
					
					default -> "300����";
			});
		}
	}

}
