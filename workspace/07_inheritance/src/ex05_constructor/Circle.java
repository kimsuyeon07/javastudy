package ex05_constructor;

public class Circle extends Coord{

	// field
	private double radius;
	
	// constructor
	public Circle(int x, int y, double radius) {
		super(x,y);  // *부모클래스의 생성자 먼저 작성!
		this.radius = radius;
	}
	
	// method : 
	
	
	// method : info
	public void info() {
		System.out.println("중심 좌표 [ " + getX() + ", " + getY() + " ]");
		xyInfo();  // Coord클래스의 메서드 호출
		System.out.println("반지름 : " + radius);
	}
	
}
