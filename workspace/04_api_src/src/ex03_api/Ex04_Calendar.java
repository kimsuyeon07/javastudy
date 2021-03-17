package ex03_api;

import java.sql.Date;
import java.util.Calendar;

public class Ex04_Calendar {

	public static void main(String[] args) {

		// Calendar 
		// java.util.Calendar
		// 1. 자바에서 날짜와 시간을 처리하는 주요 클래스
		// 2. 미리 정해진 필드를 이용해서 각 단위를 추출할 수 있다.
		
		// 현제 날짜와 시간 생성
		Calendar date = Calendar.getInstance();
		
		// 배열 생성 (안쓰는 요소를 넣을 수도 있음. => 요일번호와 인덱스번호를 맞추기 위해서.)
		String[] week = { "", "일", "월", "화", "수", "목", "금", "토" }; 
				
		// 배열 생성
 
		int year = date.get(Calendar.YEAR); 
		int month = date.get(Calendar.MONTH) + 1;  // Calender.MONTH : 0 ~ 11
		int day = date.get(Calendar.DAY_OF_MONTH);
		int weekNo = date.get(Calendar.DAY_OF_WEEK);  // 요일 번호 (일:1, 월:2, 화:3, 수:4, ...)
		// 출력
		System.out.println(year + "-" + month + "-" + day + " " + week[weekNo] + "요일");
		
		
		
		
		
		int ampm = date.get(Calendar.AM_PM);
		int hour = date.get(Calendar.HOUR);          // 0 ~ 11
		int hour2 = date.get(Calendar.HOUR_OF_DAY);  // 0 ~ 23
		int minute = date.get(Calendar.MINUTE);
		int second = date.get(Calendar.SECOND);
		int millis = date.get(Calendar.MILLISECOND);
		// 출력
		String am_pm = ampm == 0 ? "AM" : "PM" ;
		System.out.println(am_pm + " " + hour + " : " + minute + " : " + second + "." + millis);
		
		
		
		
		
		// 날짜 변경하기.
//		date.set(year, month, date, hourOfDay, minute, second);
		date.set(1990, 10, 10, 9, 30, 40);  
		// 날짜 : 1990년 11월 10일 9시 30분 40초 <기준>
		//      Calender.MONTH : 0 ~ 11 이기 때문에  "10+1"을 해주어야 한다.
		System.out.println(date);
		
		// Calendar를 이용한 타임스탬프 알아내기
		long timestamp = date.getTimeInMillis();
		System.out.println(timestamp);
		
		// Calendar -> java.sql.Date 타입으로 바꿔주는 작업 
		// - 과거의 호환 문제 때문에 Date클래스를 사용하지 않도록 권고하지만 
		//   Date타입으로 변경해야 하는 상황이 있다.
		Date date2 =  new Date(timestamp);
		System.out.println(date2);
		
		
		
		
		// java.sql.Date -> Calendar
		Calendar date3 = Calendar.getInstance();
		date3.setTime(date2);
		System.out.println(date3);
		
		
		
		
		
		// Calendar는 현재 날짜만 생성이 가능하다.
		// 날짜를 변경하고 싶다면
		// 1. 우선 현재 날짜를 생성한 뒤 
		// 2. 변경 메서드를 사용해야 한다. => set();
		
		
		
		
		
		
		
	}
}
