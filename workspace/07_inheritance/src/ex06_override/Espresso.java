package ex06_override;

// 에스프레소는 커피다.
// is - a

// 서브클래스
public class Espresso extends Coffee{

	// field
	private int water;  // 몇 미리터를 넣겠다.

	
	// constructor : 자동완성 (Source - Generate constructor using Fields...)
	public Espresso(String bean, int water) {
		super(bean);
		this.water = water;
	}
	
	// method : taste() <Override>
	
	// Espresso클래스는 이미 Coffee클래스의 메서드를 사용할 수 있다.
	// Espresso클래스가 Coffee클래스의 taste() 메서드를 사용하는 것이 적절할까? < NO!! >
	//		 => Espresso클래스는 자신의 맛을 표현하기 위해서 새롭게 taste() 메서드를 만드는 것이 좋다.
	
	// 메서드 오버라이드 (method Override)
	// 슈퍼클래스의 메서드를 사용하지 않기 위해서,
	// 서브클래스가 메서드를 다시 만드는 것을 의미한다.
	
	// 유사 단어 : Overload // Override  [오버로딩 // 오버라이드  : 전혀다르다!! *주의!]
	
	// 오버라이드 주의점
	// 1. 필수 : 똑같은 형태로 만든다. (똑같지 않으면 오버라이드가 아니다.)
	// 2. 권장. @Override 애너테이션(annotation)을 작성해 준다.
	//		1) 개발자가 자바에게 이 메서드는 오버리아드 하는 것이라고 알리는 것
	// 		2) 그러면 자바는 오버라이드 규칙을 어겼을 경우 오류를 발생 시켜준다.
	
	@Override
	public void taste() {
		System.out.println("에스프레소는 향이 좋지만 맛은 약간? 엄청 쓰다.");
	}
	
	
	
	
	
	
	
	
}
