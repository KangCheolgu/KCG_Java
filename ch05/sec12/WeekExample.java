package ch05.sec12;

import java.util.Calendar;

public class WeekExample {

	public static void main(String[] args) {
		
		
		Week today = null;
		
		Calendar cal = Calendar.getInstance();
		
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week) {
		case 1: today = Week.SUNDAY; break;
		case 2: today = Week.MONDAY;break;
		case 3: today = Week.TUESDAY;break;
		case 4: today = Week.WEDNESDAY;break;
		case 5: today = Week.목요일;break;
		case 6: today = Week.금요일;break;
		case 7: today = Week.SATURDAY;break;
		}
		
		if(today == Week.금요일) 
			System.out.println("금 요일에 축구를 합니다.");
		else
			System.out.println("자바공부를 합니다.");
	}

}
