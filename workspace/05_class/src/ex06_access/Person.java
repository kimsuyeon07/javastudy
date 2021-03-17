package ex06_access;

// access modifier 접근제어자
// 1. private   :  클래스 내부에서만 볼 수 있다.
// 2. default   :  같은 패키지에서만 볼 수 있다. (default : 이행하지 않다 ;사전의미)
//                 (access modifier를 지정하지 않으면 default이다.)
// 3. protected :  같은 패키지 또는 상속 관계에 있는 다른 패키지에서만 볼 수 있다. 
//                 (protected : 보호하다 ;사전의미)
// 4. public    :  어디서든 볼 수 있다.

// (데이터 접근이 쉬운 순서) : public > default > protected > private 


// 지정하는 방법
// 1. 필드 : private
// 2. 메서드 (생성자, 일반메서드) : public

public class Person {

	// field : 내부 정보는 숨겨놓는다. ( 정보 은닉 ) 
	// ** {private 사용}
	private String name;
	private int age;
	private boolean isKorean;
	private char gender;
	
	
	// method
	// : 필드의 정보를 가져오기 위해서는 "메서드"를 거쳐야한다.
	// < * 필수 메서드 * >
	// 1. 필드에 값을 전달하는 메서드 : setter
	// 2. 필드 값을 반환하는 메서드   : getter
	
	
	// name에 접근할 수 있는 메서드
	// 1. name에 값을 전달하는 메서드
	public void setName(String name) {
		this.name = name;
	}
	// 2. name을 반환하는 메서드 ( name값을 밖으로 빼주기 위한 작업 )
	public String getName() {
		return name;
	}
	
	
	// age에 접근할 수 있는 메서드
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
	
	//isKorean에 접근할 수 있는 메서드
	public void setKorean(boolean isKroean) {
		this.isKorean = isKorean;
	}
	public boolean isKorean() {
		return isKorean;
	}
	
	

	// gender에 접근할 수 있는 메서드
	// * Source => Generate Getters and Setters (선택) : 필수 매서드 자동 생성 *
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
	
	
	
	
	
	
	
}
