package ex09_upcasting;

public class Coffee {

	// field
	private String bean;

	// constructor
	public Coffee(String bean) {
		super();
		this.bean = bean;
	}

	// method : info()
	public void info() {
		System.out.println("원두의 원산지 : " + bean);
	}
	
	// method : tates()
	public void tates() {
		System.out.println("원두 맛 없다.");
	}
	
	
	
	
	
	
	
	
}
