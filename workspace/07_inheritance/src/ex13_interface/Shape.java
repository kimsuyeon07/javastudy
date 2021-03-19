package ex13_interface;

// 인터페이스 : interface
// 1. 모든 메서드가 추상메서드인 추상클래스
// 2. jdk 1.8 이후에 default메서드와 static메서드를 가질 수 있다.
// 3. (ALL) field : final;상수 를 가진다. 

//↓ public abstract class Shape {
public interface Shape {  // interface ↔ abstract class (조건만 같다면 : 모든 메서드가 추상메서드일 때)

	
	// method
	// 모든 도형은 크기가 있다.  / 현재는 크기가 얼마인지 모른다.
	// ↓
	// public abstract double getArea(); 
	double getArea();  
	// interface는 public abstract를 생략해도 자동으로 삽입되어 처리된다.
	
	
	
}
