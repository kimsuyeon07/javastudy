package ex13_interface;

// 인터페이스는 본문이 없는 추상메서드만 가지고 있다.
// 그러므로, 
// 해당 추상메서드를 반드시 *오버라이드*를 해야 한다.

// 클래스를 상속받을 때는 extends를 사용하고,
// 인터페이스를 구현할 때는 implements를 사용한다.
// 인터페이스일 때만 implements 사용! 

// ** Square는 Rectangle를 상속받고 있기 때문에 Square는 extends를 사용한다.
//		==> Rectangle클래스는 추상클래스(인터페이스 클래스)가 아니다.

// 쿨래스를 상속 받는다  === 인터페이스를 구현한다.

public class Rectangle implements Shape{  // extends => implements
	// 직사각형

	// field
	private int width;
	private int heigth;
	
	// constructor
	public void setHeigth(int heigth) {
		this.heigth = heigth;
	}
	
	// method : getArea() : Override(abstract) 
	// : 넓이구하기
	@Override
	public double getArea() {
		return width * heigth;
	}
	
	// method : Getter and Setter
	public int getWidth() {
		return width;
	}
	public Rectangle(int width, int heigth) {
		super();
		this.width = width;
		this.heigth = heigth;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeigth() {
		return heigth;
	}
	
	
	
	
	
}
