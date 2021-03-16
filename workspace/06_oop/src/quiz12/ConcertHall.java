package quiz12;

import java.util.Arrays;
import java.util.Scanner;

public class ConcertHall {
	
	// 클래스 내에
	// 좌석 등급 , 요금, 좌석개수 (배열화)
	
	
	// field
	private String hallName;
	private char[] seatTypes = { 'S','R','A','B' };
	private int[] seatCounts = { 10, 10, 10 ,10 };  // 각 좌석의 개수
	private int[] charges = { 200000, 150000, 100000, 50000 };
	private SeatGroup[] seatGroups;
	private Scanner sc = new Scanner(System.in);
	
	// constructor  : 홀 이름만 받아온다.
	public ConcertHall(String hallName) {
		this.hallName = hallName;
		
		// seatGroup
		this.seatGroups = new SeatGroup[seatTypes.length];  // seatTypes.length == 4
		// seatGroup클래스의 객체 생성 (생성자)
		for (int i = 0 ; i <seatTypes.length ; i++) {
			seatGroups[i] = new SeatGroup(seatTypes[i], seatCounts[i], charges[i]);
		}
	}
		
		
	// method : run (예약)
	public void run() {
		for (int i = 0 ; i < seatGroups.length; i++) {
			System.out.println(seatTypes[i]);
			System.out.println(Arrays.toString((Seat[])seatGroups[i].getSeats()));
		}
	}
	
	
	
	
	
	
	
	
	
}
