package ex08_upcasting;

public class MainClass {

	public static void main(String[] args) {

		Tv tv = new Tv(200, "LG-75");
		tv.info();  // Tv클래스의 info() 호출
		
		Elec elec = tv;  // Tv 타입의 객체를  Elec타입으로 변경  (up-casting)
						 // 서브 -> 슈퍼 타입으로 변경하는 것으로 "upcasting"이라고 한다.
		 				 // upcasting은 별도 casting문법이 없다.		
		elec.info(); 
		// Elec클래스의 info()가 호출된다.
		// 실행결과 : Elec클래스의 info()메서드가 호출되는 것이 아니다.
		//		   ? => 
		// 메서드의 호출
		// 1. 객체의 타입에 따라 결정된다.
		// 	    호출할 메서드를 결정하는 것을 "바인딩"이라고 표현한다.
		// 2. 자바는 "동적 바인딩"이다.
		// 		** 기본적으로 동작하는 순서는 이해 **
		//    1) 메서드 호출 시점 (실행 전)에는 객체의 타입을 본다. [ 정적 바인딩 ] -> [ 동적 바인딩 ] : 알아서 바꿔주겠다.
		//		 Elec elec = tv; 이므로, elec.info()는 Elec의 info()이다.
		//	  2) (실행 전)실제 객체를 확인한다.
		//		 Tv tv = new Tv(200, "LG-75"); 이므로 tv 객체가 Tv타입이라는 것을 확인한다.
		// 	  3) 실제 객체의 타입으로 바꿔서 호출하고 실행한다.    [ 동적 바인딩 ]
		//		 elex.info() 가 실행될때는 Tv의 info()가 호출된다.
		
		Elec elec2 = new Tv(300, "Samsung-85");
		elec2.info();
		
		
		
		
		
	}
}
