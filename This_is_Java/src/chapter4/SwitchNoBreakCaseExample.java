package chapter4;

public class SwitchNoBreakCaseExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// jdk version > 9
		Runtime.Version version = Runtime.version();
		int versionFeature= version.feature();
		System.out.println("jdk version = " + versionFeature);

		int time = (int)(Math.random()*4) + 8;
		System.out.println("[현재시간 : " + time + " 시]");
		
		if (versionFeature < 17) {
			switch (time) {
			case 8: 
				System.out.println("출근합니다.");
				break;
			case 9: 
				System.out.println("회의를 합니다.");
				break;
			case 10: 
				System.out.println("업무를 봅니다.");
				break;
			default:
				System.out.println("외근을 나갑니다.");
				break;
			}
			
		}else {
			System.out.println(
					switch (time) {
					case 8 -> "출근합니다.";
					case 9 -> "회의를 합니다.";
					case 10 -> "업무를 봅니다.";
					
					default -> "외근을 나갑니다.";
			});
		}
				
	}

}
