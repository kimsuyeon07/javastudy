package ex05_constructor;

/*
   생성자 (constructor)
   1. 객체를 생성하는 메소드 
   2. 특징
      1) 결과타입 : 존재하지 않는다. (아예 작성하지 않는다.)
      2) 메서드명 : 클래스명과 동일
      3) 매개변수 : 일반 메서드와 동일 (전달되는 인수가 있으면 선언, 아니라면 작성하지 않는다.)
   3. 호출 시점
      : 객체를 생성하기 위해서 new를 호출하면 그 때 호출된다. ('new'에서만 호출한다.)
         (메서드이지만 성격이 조금 다르다.) 
 */

/*
  객체 생성										생성자
   Person p = new Person()						Person() { ... }
   Person p = new Person("james")				Person(String name) { ... }
   Person p = new Person("ali" 20)				Person(String name, int age)  { ... }
 */



public class Person {

	
	// field
	String name;
	int age;
	char gender;
	
	// constructor (생성자는 필드생성 후 바로 만들어진다고 본다.)
	Person(String name, int age, char gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	// constructor : Overloading 1
	// this() : 메서드형태 (다른 생성자를 호출하는 것을 의미)
	// 여기서의 this : 생성자 를 의미한다.
	Person(String name) {
		this(name, 0, '\0');
	}
	// constructor : Overloading 2
	Person(String name, int age) {
		this(name,age,'\0');
	}
	// constructor : Overloading 3
	Person(){
		this(null, 0 , '\0');
	}
	
	
	// 생성자는 객체생성에 목적을 둠.
	// 초기화만 해주는게 좋음.
	
	
	
}
