package ex03_overloading;

/*
   오버로딩 (Overloading)
   1. 이름이 같고, 매개변수가 다른 메서드가 있음을 의미
   2. 결과타입은 오버로딩과 상관 없음
*/

public class Rectangle {

	
	// field
	int width;  //너비
	int height; //높이
	
	// method : (오버로딩) 전달되는 인수의 개수에 따라 작동.
	void set(int w, int h) {
		if (w > 0) {width = w;}
		if (h > 0) {height = h;}	
	}
	
	// method : (오버로딩) 전달되는 인수의 개수에 따라 작동.
	void set(int n) { 
		// ** 다른 set() 메서드를 호출해서 처리한다.
		set(n,n);
	}
	// * 메서드 한개를 짜놓고 이를 이용해서 (오버로딩)으로 코드를 짜는 방식으로 공부 *
	
	// method : (리턴타입) 넓이를 '반환'하는 메서드
	int getArea() {
		return width * height;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
