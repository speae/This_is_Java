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
					System.out.println("1. ���� | 2. ���� | 3. ����");
					System.out.println("-------------------------------------");
					System.out.print("���� : ");
				}
				
				keyCode = System.in.read();
				if (keyCode == 49) {
					speed++;
					System.out.println("���� �ӵ� = " + speed);
				}else if (keyCode == 50) {
					speed--;
					System.out.println("���� �ӵ� = " + speed);
				}else if (keyCode == 51) {
					run = false;
				}
			}
		}else {
			while (run) {
				String menu = """
						  -----------------------------------------------
						  1. ���� | 2. ���� | 3. ����
						  -----------------------------------------------
						  """;
				if (keyCode != 10 && keyCode != 13) {
					System.out.print(menu + "���� : ");
				}
				keyCode = System.in.read();
				System.out.println(
						switch (keyCode) {
							case 49 -> "���� �ӵ� = " + ++speed;
							case 50 -> "���� �ӵ� = " + --speed;
							case 51 ->  run = false;
							case 10, 13 -> "";
							default -> "";
							

						});
			}
			
			
		}
		System.out.println("���α׷� ����.");
	}

}
