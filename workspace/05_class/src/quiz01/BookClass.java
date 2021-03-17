package quiz01;

import java.sql.Date;
import java.util.Calendar;
// import 단축키 : Ctrl + Shift + O (; 잘못들어간 import도 제거하는 역할!)

public class BookClass {

	public static void main(String[] args) { 

		Book book = new Book();
		
		book.title = "프로그래밍 언어 활용";
		book.writer = "코리아IT아카데미";
		book.price = 10000;
		book.stock = 3;
		Calendar date = Calendar.getInstance();  // 현재 날짜 생성 : Calendar클래스로 생성!
		date.set(2020, 0, 10);                   // 날짜 변경  : set() 메서드 사용
		long timestamp = date.getTimeInMillis(); // 타임스탬프 : ㅣ'long' 타입을 사용!
		book.pubDate = new Date(timestamp);      // 타임스탬프로 Date클래스로 변경
		book.isBest = true;
		
		
		System.out.println(book.title);
		System.out.println(book.writer);
		System.out.println(book.price);
		System.out.println(book.stock);
		System.out.println(book.pubDate);
		System.out.println(book.isBest ? "베스트셀러" : "일반서적");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
