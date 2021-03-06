package ex04_constructor;

// 서브클래스 : 자식클래스

// 부모가 먼저 태어나야 자식도 태어날 수 있다.
// 자식이 태어날 때 (서브클래스를 new 할 때), 먼저! 부모가 태어나야하는 코드를 짜주어야 한다.

// ** 서브클래스의 생성자는 슈퍼클래스의 생성자를 "반드시" 먼저 호출해야 한다!!
// 생략이 가능한 경우는 슈퍼클래스의 생성자가 "디폴트 생성자" 형태 일 때만 가능하다.

// 슈퍼클래스 키워드
// super : 슈퍼클래스의 참조 값
// 사용방법 1. super.멤버 : super.필드, super.메서드()
// 사용방법 2. super()  : 슈퍼클래스의 생성자 호출

public class Student extends Person {

	// field
	private String school;
	
	// constructor : 부모클래스를 생성해주지 않으면 자식클래스에 오류가 생긴다.
	public Student(String name, String school) {
		super(name);  //부모클래스 생성자를 "먼저" 호출!
		this.school = school;
	}
	
	// method
	public void info() {
		System.out.println("학생 이름 : " + getName() );  // Person클래스의 메서드를 사용 : 변수는 private하기 때문에 사용이 안된것 뿐.
		System.out.println("학교 : " + school);
	}
	
	
}
