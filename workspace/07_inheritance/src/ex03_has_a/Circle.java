package ex03_has_a;

public class Circle extends Coord {

	// field
	private double radius;
	
	// method
	public void setCircle(int x, int y, double radius) {
		
		this.radius = radius;
		
		// Coord클래스의 set() 메서드는 x,y 좌표값을 저장하는 메서드
		// Circle클래스는 Coord클래스를 상속받았기 때문에,
		// Coord클래스의 모든 메서드를 자신의 것처럼 사용할 수 있다.
		set(x, y);  // => Coord클래스의 set() 메서드 호출 (자신의 것처럼)
		
	}  // setCircle() 메서드 종료
	
	// method : circleInfo()
	public void circleInfo() {
		System.out.print("중심좌표 : ");
		info();  // Coord클래스의 CircleInfo 메서드를 자신의 것처럼 호출
		System.out.println("반지름 : " + radius);
	} //circleInfo() 메서드종료
	
	
	
	
	
}
