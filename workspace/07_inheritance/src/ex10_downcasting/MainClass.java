package ex10_downcasting;

public class MainClass {

	public static void main(String[] args) {

//		// upcasting
//		Person p =new Student();
		
		// 컴파일 -> 실행
		// 코드    -> new 처리
		
		Person p1;
		p1 = new Student();
//		Person p1 = new Student();
		// -
		p1.eat();
		p1.sleep();
//		p1.study; 
		//        => ERR.  
		//           : Person p1; 만 보고 호출할 메서드를 결정하기 때문에 (불가능)
		// ↓↓↓
		// Person타입의 p1을 Student타입으로 변경하면 해결된다.
		// 1. (Student)p1 : p1을 Student로 캐스팅한다.( : downcasting )
		// 2. (Studnet)p1.study() : 정상 동작하지 않는다.
		//    연산자 최우선 순위 : 마침표(.)  =>  p1.study()가 먼저 호출된다는 의미//
		// 3. ((Student)p1).study() : 캐스팅을 먼저 처리하고 나면 study()를 호출해라.
		// →
		((Student)p1).study();
		
		
		//----------------
		
		Person p2 = new Worker();
		p2.eat();
		p2.sleep();
		((Worker)p2).work();
		
		// ----------------
		// 실수를 해봅시다
		Person p3;
		p3 = new Student();
		p3.eat();
		p3.sleep();
//		((Worker)p3).work();  // ClassCastException 발생 
		                  	  // : 실행 시 오류 발생 (오류의 이유 : ClassCastException)

		// 타입을 확인한 뒤 캐스팅 할 수 있다.
		// p3가 Student이면 Student로 캐스팅하고,
		// p3가 Worker이면 Worker로 캐스팅하시오.
		if ( p3 instanceof Student ) {
			((Student)p3).study();
		} else if (p3 instanceof Worker ) {
			((Worker)p3).work();
		}  
		// ↓
		// instanceof(인스턴스오브) : 클래스의 타입을 확인하는 코드
		// p3 instanceof Student
		// 		=> p3객체가 Student클래스타입이면 true
		
		
		
		
		
		
	}
}
