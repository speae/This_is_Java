package chapter4;

public class SwitchCharExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade = 'B';
		
		// jdk version > 9
		Runtime.Version version = Runtime.version();
		int versionFeature= version.feature();
		System.out.println("jdk version = " + versionFeature);
		
		if (versionFeature < 17) {
			switch (grade) {
			case 'A':
			case 'a':
				System.out.println("우수 회원입니다.");
				break;
			case 'B':
			case 'b': 
				System.out.println("일반 회원입니다.");
				break;
			
			default:
				System.out.println("손님입니다.");
				break;
			}
			
		}else {
			System.out.println(
					switch (grade) {
					case 'A', 'a' -> "우수 회원입니다.";
					case 'B', 'b' -> "일반 회원입니다.";
					
					default -> "손님입니다.";
			});
		}
				
	}

}
