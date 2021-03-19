package ex13_interface;

public class Circle implements Shape {

	// field
	private double radius;
	
	// constructor
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	// method : getArea() : abstract(Override)
	// : 넓이 구하기
	@Override
	public double getArea() {
		return (Math.pow(radius, 2) * Math.PI) ;
	}
	
	
	


}
