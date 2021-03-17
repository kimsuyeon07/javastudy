package ex03_api;

import java.sql.Date;
import java.util.Calendar;

public class Quiz02 {

	public static void main(String[] args) {

		
		// 2. calendar를 활용해서 기념일 계산하기
		// 1) 두 개의 날짜 생성, 그 중 하나는 기념일로 수정
		// 2) 날짜의 차이를 구하고, 일 수로 출력
		
		
		Calendar date = Calendar.getInstance();
		Calendar eventDate = Calendar.getInstance();
		
		
		eventDate.set(2000, 0, 1);  // 2000-01-01
		
		// 타임스탬프의 차이를 구한다.
		long elapseTime = date.getTimeInMillis() - eventDate.getTimeInMillis();
		Date date2 =  new Date(elapseTime);
		
		// 밀리초 -> 일(1000밀리초 * 60 * 60 * 24 == 1일)
		long elapseDay = elapseTime / (1000 * 60 * 60 * 24);
		
		// 출력
		System.out.println( "경과한 일수는 " + elapseDay + "일 입니다.");
		
		
		// ver.2
		// 디데이
		
		eventDate.set(2021, 6, 11);
		
		long dDay = eventDate.getTimeInMillis() - date.getTimeInMillis();
		Date dDayy = new Date(dDay);
		
		
		// 밀리초 -> 일(1000밀리초 * 60 * 60 * 24 == 1일)
		long dDay_day = dDay / (1000 * 60 * 60 * 24);
		
		System.out.println("디데이 : D - " + dDay_day + "일");
		
		
		
		
		
		// date : 오늘 날짜
		int year = date.get(Calendar.YEAR); 
		int  month = date.get(Calendar.MONTH) + 1;
		int day = date.get(Calendar.DAY_OF_MONTH);
		int week = date.get(Calendar.DAY_OF_WEEK);
		System.out.println(year + "-" + month + "-" + day );
		
		// eventDate : 기념일 (날짜 수정)
		int eventYear = eventDate.get(Calendar.YEAR); 
		int  eventMonth = eventDate.get(Calendar.MONTH) + 1;
		int eventDay = eventDate.get(Calendar.DAY_OF_MONTH);
		int eventWeek = eventDate.get(Calendar.DAY_OF_WEEK);
		System.out.println(eventYear + "-" + eventMonth + "-" + eventDay );

//		int eventYear = date.get(Calendar.YEAR); 
//		int  eventMonth = date.get(Calendar.MONTH);
//		int eventDay = date.get(Calendar.DAY_OF_MONTH);
//		int eventWeek = date.get(Calendar.DAY_OF_WEEK);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
