package ex12_abstract;

public class Rectangle extends Shape{
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
