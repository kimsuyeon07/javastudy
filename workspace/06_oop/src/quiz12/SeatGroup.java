package quiz12;

import java.util.Scanner;

public class SeatGroup {

	// field
	private char seatType; // "S", "R", "A", "B"
	private int charge; // 요금
	private Seat[] seats;
	private Scanner sc = new Scanner(System.in);
	
	// constructor
	public SeatGroup(char seatType, int seatCount, int charge) {
		this.seatType = seatType;
		this.charge = charge;
		this.seats = new Seat[seatCount];  // 배열만 생성 (정보는 아직.)
		// 배열에 실제 Seat 생성 작업
		for(int i = 0 ; i < seats.length; i++) {  // seats.length == seatCount
			seats[i] = new Seat();  //  : (Seat객체 생성) 빈 좌석 생성
		}
	}  // 생성자(S, 2, 5000); ==> 생성자 하나하나가 SeatGroup객체로 되어있는 배열로 보여짐.
	
	// method
	public void info() {
		
	}

	
	
	
	
	// method : Getter / Setter
	public Seat[] getSeats() {
		return seats;
	}

	public void setSeats(Seat[] seats) {
		this.seats = seats;
	}
	
	
	
	
	
	
	
	
	
}
