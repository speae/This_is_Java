package chapter4;

public class SwitchNoBreakCaseExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// jdk version > 9
		Runtime.Version version = Runtime.version();
		int versionFeature= version.feature();
		System.out.println("jdk version = " + versionFeature);

		int time = (int)(Math.random()*4) + 8;
		System.out.println("[����ð� : " + time + " ��]");
		
		if (versionFeature < 17) {
			switch (time) {
			case 8: 
				System.out.println("����մϴ�.");
				break;
			case 9: 
				System.out.println("ȸ�Ǹ� �մϴ�.");
				break;
			case 10: 
				System.out.println("������ ���ϴ�.");
				break;
			default:
				System.out.println("�ܱ��� �����ϴ�.");
				break;
			}
			
		}else {
			System.out.println(
					switch (time) {
					case 8 -> "����մϴ�.";
					case 9 -> "ȸ�Ǹ� �մϴ�.";
					case 10 -> "������ ���ϴ�.";
					
					default -> "�ܱ��� �����ϴ�.";
			});
		}
				
	}

}
