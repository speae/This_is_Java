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
				System.out.println("1번이 나왔습니다.");
				break;
			case 2: 
				System.out.println("2번이 나왔습니다.");
				break;
			case 3: 
				System.out.println("3번이 나왔습니다.");
				break;
			case 4: 
				System.out.println("4번이 나왔습니다.");
				break;
			case 5: 
				System.out.println("5번이 나왔습니다.");
				break;
			default:
				System.out.println("6번이 나왔습니다.");
				break;
			}
			
		}else {
			System.out.println(
					switch (num) {
					case 1 -> "1번이 나왔습니다.";
					case 2 -> "2번이 나왔습니다.";
					case 3 -> "3번이 나왔습니다.";
					case 4 -> "4번이 나왔습니다.";
					case 5 -> "5번이 나왔습니다.";
					
					default -> "6번이 나왔습니다.";
			});
		}
				
	}

}
