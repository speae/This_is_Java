package chapter4;

import java.util.Scanner;

public class DoWhileExample {
	static Scanner scanner = new Scanner(System.in);
	static String inputString;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�޽����� �Է��ϼ���.");
		System.out.println("���α׷��� �����Ϸ��� q�� �Է��ϼ���.");
		
		do {
			
			System.out.println(">");
			inputString = scanner.nextLine();
			System.out.println(inputString);
		} while (!inputString.equals("q"));
		
		System.out.println();
		System.out.println("���α׷� ����");
	}

}
