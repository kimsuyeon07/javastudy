package ex04_this;

/*
 * this
   1. this : 객체 자신을 의미
   2. 어떤 클래스 내부에서만 사용
   3. 활용
      1) this.필드 <가장 주된 활용>
      2) this() : 메서드형태 (다른 생성자를 호출하는 것을 의미)
*/
public class Car {
	
	// field
	String model;
	String manufacturer;
	int price;
	
	// method
	void set(String model , String manufacturer, int price) {
		// this.model == car.model (동일) 
		// 매개변수와 필드가 '동일한 명' 사용할 때, 다른 변수임을 '구분'하기 위해 : "this" 사용
		// (이름이 동일하면 충돌하기 때문에, 구분할 수 있는게 필요)
		
		// ** this가 붙은 변수는 필드를 가르키는 것!
		// this.model(필드) = model(인수);
		
		this.model = model;
		this.manufacturer = manufacturer;
		this.price = price;
		
	}
	
	
	void info() {
		System.out.println("모델명 : " + model);
		System.out.println("제조자 : " + manufacturer);
		System.out.println("가격 : " + price + "만원");
	}
	
	
	
	
	
	
	

}
