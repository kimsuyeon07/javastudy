package ex11_abstract;

// 추상 클래스를 상속받는 서브클래스는
// "반드시" 모든 추상 메서드를 오버라이드 해야 한다. (하지 않으면 오류남.)
// @Override <필수>!

public class SalaryMan extends Staff{

	// field
	private int salary;

	// constructor
	public SalaryMan(String name, int salary) {
		super(name);
		this.salary = salary;
	}

	// method : info() : Override
	@Override
	public void info() {
		super.info();
		System.out.println("기본급 : " + salary);
	}
	
	// method : getPay() : Override(abstract)
	//↓ *<필수>*
	@Override
	public int getPay() {
		return salary;
	}
	
	
	
	
	
	
}
