package ex02_generic;

// 제네릭의 일반화 타입은 관례상 "영문 대문자"로 사용합니다.

public class Box <T, U>{

	// field
	private T item1;
	private U item2;

	
	// method : Getter and Setter
	public T getItem1() {
		return item1;
	}
	public void setItem1(T item1) {
		this.item1 = item1;
	}
	public U getItem2() {
		return item2;
	}
	public void setItem2(U item2) {
		this.item2 = item2;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
