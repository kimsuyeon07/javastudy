package ex12_abstract;

public class MainClass {

	public static void main(String[] args) {

		Shape[] shapes = new Shape[10];  // 10개의 도형을 저장할 수 있는 Shape배열 생성
		
		shapes[0] = new Rectangle(3, 4);
		shapes[1] = new Square(5);
		shapes[2] = new Triangle(3, 5);
		shapes[3] = new Circle(1.5);
		
		// ver.1
		for (int i = 0 ; i < shapes.length ; i++) {
			if (shapes[i] != null) {
				System.out.println(shapes[i].getArea());
			}
		}
		
		// ver.2
		for (Shape shape : shapes) {
			if (shape != null) {
				System.out.println(shape.getArea());
			}
		}
		
		
		
		
		
		
		
		
		
		
	}
}
