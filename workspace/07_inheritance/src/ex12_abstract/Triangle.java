package ex12_abstract;

public class Triangle extends Shape {

	// field
	private int width;
	private int height;
	
	// constructor
	public Triangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
		
	// method : getArea() : abstract(Override)
	// : 넓이 구하기
	@Override
	public double getArea() {
		return (width * height * 0.5);
	}


}
