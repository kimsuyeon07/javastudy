package ex01_user_type;

public class MainClass {

	public static void main(String[] args) {
 
		
		// 클래스 Person을 타입으로 하는 "객체"를 생성
		/*
		 * 1. 타입 : Person
		 * 2. 객체 : p1
		 * */
		Person p1 = new Person();
		// ** new : 새로운 '객체'를 만들어라.
		
		// 클래스에 포함된 멤버(필드, 메서드)는 마침표(.)를 이용해 호출
		// (초기화 값 확인.)
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.gender);
		System.out.println(p1.height);
		System.out.println(p1.isKorean);
		
		
		// Person은 reference type입니다. <참고>
		System.out.println(p1);  // new Person()으로 생성된 객체의 "주소(참조)" 값이 저장되어있다.
		
		
		Person p2 = p1;  // p2는 객체p1의 "주소(참조)"를 그대로 가지고 있다.
		System.out.println(p2);  
		
		
		// p2를 수정하면 어떤일이 벌어질까?
		p2.name = "alice";  
		System.out.println(p2.name);  // 당연히 alice
		System.out.println(p1.name);  
		// 왜 alice일까? => p1과 p2는 같은 주소값을 가지고 있기 때문에.
		// 15번지의 객체를 수정해라 라는 의미여서 p2도 같은 주소값을 가지고 있기 때문에 수정된다
		
		// ** 실제로 객체는 '1'개 ** : 이 객체의 주소값을 p1, p2가 가지고 있는 것.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
