package ex09_upcasting;

public class Latte extends Espresso{

	// field
	private int milk;  // 우유 양

	// constructor
	public Latte(String bean, int water, int milk) {
		super(bean, water);
		this.milk = milk;
	}

	// method : info() : Override
	@Override
	public void info() {
		super.info();
		System.out.println("우유 : " + milk + "ml");
	}
	
	// method : tates() : Override
	public void tates() {
		System.out.println("Latte는 고소한 맛이 나는 쓴 커피");
	}
	
}
