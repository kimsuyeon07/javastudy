package quiz11;

public class Day {

	// field
	private String schedule;  // 하루하루 스케줄은 "String"으로 작업

	
	// constructor
	
	
	
	// method : 필수
	public String getSchedule() {
		return schedule;
	}
	
	// 스케줄을 저장하는 메서드 (WeekScheduler클래스에서 사용.)
	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}
	
	// method : info
	public void info() {
		// 스케줄이 있을 때와 없을 때를 구분 (정보 출력은 무조건 가능하게 작업.)
		// .isEmpty() : 빈공간이면 true를 반환한다.
		// ** schedule == null || schedule.isEmpty()  :  null 또는 빈문자열("") 
		if(schedule == null || schedule.isEmpty()) {  
			System.out.println("[ 스케줄이 없다. ]");
		} else {
			System.out.println("[ " + schedule + " ]");
		}
	}
	
	
	
	
}
