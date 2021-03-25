package quiz02;

public class Alba extends Staff{

	// field
	private int payHour;   // 시급
	private int times;     // 근무시간

	// constructor
	public Alba(String name) {
		super(name);
	}

	// method : Getter and Setter 
	public int getPayHour() {
		return payHour;
	}
	public void setPayHour(int payHour) {
		this.payHour = payHour;
	}
	public int getTimes() {
		return times;
	}
	public void setTimes(int times) {
		this.times = times;
	}

	// method : getPay()
	public int getPay() {
		return payHour * times;
	}
	
	// method : info() : Override
	@Override
	public void info() {
		super.info();  // Staff의 info()메서드 호출 : name 출력
		System.out.println("페이 : " + getPay());  // getPay() : 현재클래스 내부의 메서드
	}


	
	
}
	
	
	
	
