package ex17_Object.ex04;

public class MainClass {

	public static void main(String[] args) {

		
		Product p1 = new Product();
		Product p2 = new Product();
		
		p1.setModel("CA-001");
		p1.setManufacturer("bio");
		p1.setDate("2021-03-01");
		
		p2.setModel("CA-001");
		p2.setManufacturer("bio");
		p2.setDate("2021-03-05");
		// 같은 종류의 제품(모델명, 제조사 : 모두 같은 경우), 제조일만 다르다.
		// 제품은 2개 (독립적인 제품)
		
		// p1 = new Product();  |   p2 = new Product(); 
		// 2개의 객체이기 때문에 JAVA는 같은 제품이라고 생각하지 않는다.
		
		// Object의 equals
		if (p1.equals(p2)) {  // .equals() : Object클래스가 가지고 있는 메서드
			System.out.println("같은 종류의 제품입니다.");
		} else {
			System.out.println("다른 종류의 제품입니다.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
