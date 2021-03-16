package quiz05;

public class Circle {

	// field
	double radius; //반지름
	
	// method : 원의 반지름 길이 세팅
	void setRadius(double radius) {  // (인수값을 받아오는 매개변수)
		this.radius = radius;
	}
	
	// method : 원 둘레 구하는 공식
	double getCircum() {
		return 2 * Math.PI * radius;
	}
	
	//method : 원 넓이 구하는 공식
	double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	
	
	
	
	
	
	
}
