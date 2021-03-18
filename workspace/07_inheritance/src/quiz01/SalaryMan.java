package quiz01;

public class SalaryMan extends Staff {

	// field
	private int salary;

	// constructor
	public SalaryMan(String name, int salary) {
		super(name);  // 슈퍼클래스의 Staff의 "생성자" 호출
		this.salary = salary;
	}
	
	// method : getPay() : 월급
	public int getPay() {
		return salary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	
	
	
	
	
	
	
}
