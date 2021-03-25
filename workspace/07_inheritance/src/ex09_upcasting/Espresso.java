package ex09_upcasting;

public class Espresso extends Coffee {

	// field
	private int water;  // 물의 양

	// constructor
	public Espresso(String bean, int water) {
		super(bean);
		this.water = water;
	}

	
	// method : info() : Override
	@Override
	public void info() {
		super.info();
		System.out.println("물 : " + water + "ml");
	}
	
	// method : tates() : Override
	@Override
	public void tates() {
		System.out.println("Espresso는 맛이 진하다.");
	}
	
	
	
	
	
	
	
}
