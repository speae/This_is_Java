package chapter5;

import java.util.Calendar;

public class EnumWeekExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Week today = null;
		String[] javaVersionElement = System.getProperty("java.version").split("\\.");
		int major = Integer.parseInt(javaVersionElement[0]);
		System.out.println("jdk version = " + major);
		if (major >= 17) {
			Calendar cal = Calendar.getInstance();
			int week = cal.get(Calendar.DAY_OF_WEEK);
			
			today = switch (week) {
				case 1 -> Week.SUNDAY;
				case 2 -> Week.MONDAY;
				case 3 -> Week.TUSEDAY;
				case 4 -> Week.WEDNESDAY;
				case 5 -> Week.THURDAY;
				case 6 -> Week.FRIDAY;
				case 7 -> Week.SATURDAY;
				default -> Week.SUNDAY;
			};
			
			System.out.println("오늘 요일 : " + today);
			if (today == Week.SUNDAY) {
				System.out.println("일요일에는 축구를 합니다.");
			}else {
				System.out.println("열심히 자바 공부합니다.");
			}
		}
	}

}
