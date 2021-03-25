package quiz01;

public class Watch {

	// field
	private int hour;
	private int minute;
	private int second;
	
	
	// 필수 메서드
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	
	
	// constructor
	public Watch(int hour, int minute, int second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	
	// 출력 메서드
	public void see() {
		System.out.println(hour + "시 "+ minute +"분 "+ second +"초");
	}
	
	// method : add
	public void addHour(int hour) {
		// 25시간 후(1시간 후)
		this.hour += hour;
		this.hour %= 24  ;
	}
	
	public void addMinute(int minute) {
		// 61분 후 (1시간 1분 후)
		this.minute += minute;  // 우선, 더해준다.
		int hour = this.minute / 60;
		addHour(hour);
		this.minute %= 60  ;
	}
		
	
	public void addSecond(int second) {
		// 3661초 후 (1시간 1분 1초 후)
		this.second += second;
		int minute = this.second /= 60;
		addMinute(minute);
		this.second %= 60  ;
		
	}
	
	
	/* 
	   1) addSecond(int second ) 메서드
	      1. this.second += second;
	      		인수를 필드값에 더해진 값으로 전달
		  2. int minute = this.second /= 60;
		  		전달 받은 this.second 값에서 '분'을 구한다.  ( this.second/= 60 )
		  addMinute(minute);
		  this.second %= 60  ;
	 */
	
	
	
	
	
	
	
	
	
}
