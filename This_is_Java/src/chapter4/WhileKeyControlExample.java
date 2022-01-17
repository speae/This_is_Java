package chapter4;

import java.io.IOException;

public class WhileKeyControlExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		Runtime.Version version = Runtime.version();
		if (version.feature() < 17) {
			while (run) {
				if (keyCode != 13 && keyCode != 10) {
					System.out.println("-------------------------------------");
					System.out.println("1. 종속 | 2. 감속 | 3. 중지");
					System.out.println("-------------------------------------");
					System.out.print("선택 : ");
				}
				
				keyCode = System.in.read();
				if (keyCode == 49) {
					speed++;
					System.out.println("현재 속도 = " + speed);
				}else if (keyCode == 50) {
					speed--;
					System.out.println("현재 속도 = " + speed);
				}else if (keyCode == 51) {
					run = false;
				}
			}
		}else {
			while (run) {
				String menu = """
						  -----------------------------------------------
						  1. 종속 | 2. 감속 | 3. 중지
						  -----------------------------------------------
						  """;
				if (keyCode != 10 && keyCode != 13) {
					System.out.print(menu + "선택 : ");
				}
				keyCode = System.in.read();
				System.out.println(
						switch (keyCode) {
							case 49 -> "현재 속도 = " + ++speed;
							case 50 -> "현재 속도 = " + --speed;
							case 51 ->  run = false;
							case 10, 13 -> "";
							default -> "";
							

						});
			}
			
			
		}
		System.out.println("프로그램 종료.");
	}

}
