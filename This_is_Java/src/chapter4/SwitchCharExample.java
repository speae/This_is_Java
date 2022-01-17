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
				System.out.println("��� ȸ���Դϴ�.");
				break;
			case 'B':
			case 'b': 
				System.out.println("�Ϲ� ȸ���Դϴ�.");
				break;
			
			default:
				System.out.println("�մ��Դϴ�.");
				break;
			}
			
		}else {
			System.out.println(
					switch (grade) {
					case 'A', 'a' -> "��� ȸ���Դϴ�.";
					case 'B', 'b' -> "�Ϲ� ȸ���Դϴ�.";
					
					default -> "�մ��Դϴ�.";
			});
		}
				
	}

}
