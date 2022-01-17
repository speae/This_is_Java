package chapter4;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = (int)(Math.random()*6) + 1;
		
		// jdk version < 9
//		String[] javaVersionElement = System.getProperty("java.version").split("\\.");
//		int major = Integer.parseInt(javaVersionElement[0]);
//		System.out.println("jdk version = " + major);
		
		// jdk version = 9
//		Runtime.Version version = Runtime.version();
//		int versionMajor = version.major();
//		System.out.println("jdk version = " + versionMajor);
		
		// jdk version > 9
		Runtime.Version version = Runtime.version();
		int versionFeature= version.feature();
		System.out.println("jdk version = " + versionFeature);
		if (versionFeature < 17) {
			switch (num) {
			case 1: 
				System.out.println("1���� ���Խ��ϴ�.");
				break;
			case 2: 
				System.out.println("2���� ���Խ��ϴ�.");
				break;
			case 3: 
				System.out.println("3���� ���Խ��ϴ�.");
				break;
			case 4: 
				System.out.println("4���� ���Խ��ϴ�.");
				break;
			case 5: 
				System.out.println("5���� ���Խ��ϴ�.");
				break;
			default:
				System.out.println("6���� ���Խ��ϴ�.");
				break;
			}
			
		}else {
			System.out.println(
					switch (num) {
					case 1 -> "1���� ���Խ��ϴ�.";
					case 2 -> "2���� ���Խ��ϴ�.";
					case 3 -> "3���� ���Խ��ϴ�.";
					case 4 -> "4���� ���Խ��ϴ�.";
					case 5 -> "5���� ���Խ��ϴ�.";
					
					default -> "6���� ���Խ��ϴ�.";
			});
		}
				
	}

}
