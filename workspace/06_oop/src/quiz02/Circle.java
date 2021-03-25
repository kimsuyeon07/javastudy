package quiz02;

public class Circle {

	// field
	private Coord center;   // 코드 타입 (포함 관계 : 같은 패키지 안의 클래스를 사용.)
	private double radius;  // 실수 타입
	
	// constructor
	public Circle(Coord center, double radius) {
		this.center = center;
		this.radius = radius;
	}
	
	// constructor 2  : Circle(1, 1, 1.5)
	public Circle(int x, int y, double radius) {
		
		// 1번재 방법
//		this.center = new Coord(x, y);  // x, y 값을 Coord(같은 패키지안의 클래스)의 새로운 객체의 인수로 넘긴다.
//		this.radius = radius;
		
		// 2번째 방법
		this(new Coord(x, y), radius);
		// 다른 생성자로 재귀한다. (호출 ;넘김)
	}
	
	
	
	// method
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	// info method
	public void info() {
		System.out.print("중심좌표 " );
		center.info();  // 다른 자바파일에 있던 Circle클래스의 메서드를 가져오는 방법. 
		                // (* sysout을 사용하지 않는다. *)
		System.out.print(", 반지름 : " + radius + ", 넓이 : " + getArea());
	}
	
	
	
	
	
	
	
	
	// 필수 메서드
	public Coord getCenter() {
		return center;
	}
	public void setCenter(Coord center) {
		this.center = center;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
	
	
}
