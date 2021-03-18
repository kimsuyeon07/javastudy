package ex11_abstract;

// 1. 추상 메서드
// 	  1) 본문이 없는 메서드이다.
// 	  2) 메서드를 정의할 때 abstract 키워드를 앞에 추가하면 된다.
//	  3) 중괄호 ( {} )를 뻬고 세미콜론( ; )을 붙이면 된다.
// 			-> public "abstract" int getPay();

// 2. 추상 클래스
//    1) 추상메서드가 1개 이상 포함된 클래스이다.
//    2) 클래스 정의 앞에 abstract 키워드를 추가한다.
//			-> public "abstract" class Staff {

public abstract class Staff {

	// field
	private String name;

	// constructor
	public Staff(String name) {
		super();
		this.name = name;
	}
	
	// method : info()
	public void info() {
		System.out.println("직원명 : " + name);
	}
	// method : getPay(); 
	/*
	// 본문이 없는 getPay() 메서드를 만들면 된다.
	// ↓
	public int getPay() {
		// 현재는 앓 수 없는 내용. ()
		return ??;  => 반환할 수 있는 값이 없다.
	}
	*/
	// ↓
	public abstract int getPay();  
	// abstract public 도 가능/ 순서는 둘 중 한가지로 사용/
}
