package ex17_Object.ex02;

public class Dog {

	// field
	private String name;

	
	// constructor
	public Dog(String name) {
		super();  // Object의 생성자호출 (생략 가능.)
		this.name = name;
	}


	// method
	// Object클래스의 toString()을 사용하지 않기 위해서
	// toString() 메서드를 "오버라이드" 한다. : Dog클래스의 toString() 메서드를 다시 만들었다.
	@Override
	public String toString() {
		return "[name : " + name + " ]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
