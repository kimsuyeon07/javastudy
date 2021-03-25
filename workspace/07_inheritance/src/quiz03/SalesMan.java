package quiz03;

public class SalesMan extends SalaryMan{

	// field
	private int salesAmount;   // 판매실적
	private double incentive;  // 인센티브(%)
	
	// constructor
	// 필드값을 사용하지 않는 생성자 생성  : 판매실적과 인센티브는 따로 만들어주고자
	public SalesMan(String name, int salary) {
		super(name, salary);
	}

	// method : Getter and Setter
	public int getSalesAmount() {
		return salesAmount;
	}
	public void setSalesAmount(int salesAmount) {
		this.salesAmount = salesAmount;
		if (salesAmount > 1000) {
			setIncentive(0.07); // 7% 인센티브
		} else {
			setIncentive(0.05); // 아니면, 5% 인센티브
		}
	}
	public double getIncentive() {
		return incentive;
	}
	public void setIncentive(double incentive) {
		this.incentive = incentive;
	}
	
	// method : getPay() : Override (세일즈맨의 월급 값으로 수정)
	@Override
	public int getPay() {
		return super.getPay() + getSalesPay() ;
	}
	// method : getSalesPay() : 세일즈맨의 팬매수당 (구해진 값을 리턴타입과 동일하게 해주기 위해 (int) 사용)
	public int getSalesPay() {
		return (int)(salesAmount * incentive);
	}
	
	// SlaryMan - .getPay()
	// SalasMan - @Override getPay()
	// 	->  (SalesMan)세일즈맨의 월급을 다시 만들어준다.
	
	// method : info() : Override
	@Override
	public void info() {
		super.info();  // SalaryMan의 info() 메서드 호출 : name, 기본급 출력
		System.out.println("판매수당 : " + getSalesPay());
		System.out.println("총 월급 : " + getPay());  // getPay() : 현재클래스 내부의 메서드
		// SalesMan의 info
		// 직원명, 기본급, 판매수당, 월급
	}
	
	
	
}


	
	
	
