package quiz12;

import java.util.Scanner;
// Ctrl + Shift + O  : 불필요한 import를 제거해준다. (해당 클래스에서 사용하지 않는 것을 알아서 정리)

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
		// 무한반복문
		while (true) {
			menu();
			System.out.print("작업 선택 >>>");
			int choice = sc.nextInt();
			
			switch (choice) {
			case 1: reservation(); break;
			case 2: cancel(); break;
			case 3: inquiry(); break;
			case 4: info(); break;
			case 0: exit(); return;  // run() 메서드를 종료하기 위해서.
			default: System.out.println("잘못된 번호입니다. 다시 입력하세요.");
			}
		}
	}
	
	// method : menu()
	public void menu() {
		System.out.println("=====예매프로그램=====");
		System.out.println("1. 예매");
		System.out.println("2. 예매 취소");
		System.out.println("3. 예매 조회");
		System.out.println("4. 전체 예매 현황");
		System.out.println("0. 프로그램 종료");
		System.out.println("==================");
		/*줄바꿈*/System.out.println();
	}
	
	// 에메
	public void reservation() {
		System.out.print("예매할 좌석 타입(S, R, A, B) 입력 : ");
		char seatType = sc.next().charAt(0);
		/*줄바꿈*/System.out.println();
		
		for (int i = 0; i<seatTypes.length ; i++) {
			// 1. 입력받은 좌석 타입과 일치하는 seatTypes배열의 인덱스번호 추출.
			// 2. 추출한 인덱스번호를 seatGroups배열의 인덱스번호로 준다.
			if(seatType == seatTypes[i]) {
				seatGroups[i].reservation();
				/*줄바꿈*/System.out.println();
			}
		}
	}
	
	// 예매 취소
	public void cancel() {
		System.out.print("취소할 좌석 타입(S, R, A, B) 입력 : ");
		char seatType = sc.next().charAt(0);
		/*줄바꿈*/System.out.println();
		
		for (int i = 0; i<seatTypes.length ; i++) {
			// 1. 입력받은 좌석 타입과 일치하는 seatTypes배열의 인덱스번호 추출.
			// 2. 추출한 인덱스번호를 seatGroups배열의 인덱스번호로 준다.
			if(seatType == seatTypes[i]) {
				seatGroups[i].cancel();
				/*줄바꿈*/System.out.println();
			}
		}
	}
	
	//예매 조회
	public void inquiry() {
		System.out.print("조회할 사용자 이름 입력 : ");
		String name = sc.next();
		/*줄바꿈*/System.out.println();
		
		for(int i = 0 ; i < seatGroups.length ; i++) {
			
			SeatGroup seatGroup = seatGroups[i];
			Seat[] seats = seatGroup.getSeats();
			
			for(int j = 0; j < seats.length ; j++) {
				// seatGroups[i].getSeats().length : 
				//		1) ( seatGroups[i].getSeats() )  ->  seatGroups배열 안의 seats배열 을 불러온다
				// 		2)  .length  => seats배열의 길이를 구한다.
				if(seats[j].getName() != null && seats[j].getName().equals(name)) {
					System.out.println(seatTypes[i] + "타입" + (j + 1) + "번 좌석이" + name + "님 앞으로 예약되어있습니다.");
					return;
				}
				
			} //for문 [j] 종료
		} //for문 [i][j] 종료
		System.out.println(name + "님의 예매 정보가 없습니다.");
	}  //inquiry() 메서드 종료
	
	
	// 전체 예매 현황
	public void info() {
		
		System.out.println("홀  : " + hallName );
		System.out.println("예매 총액 : " + getTotalCharge() + "원");
		/*줄바꿈*/System.out.println();
		
		for (SeatGroup seatGroup : seatGroups) {
			seatGroup.info();
		}
		
	}
	
	// 전체 예매 총액 반환
	public int getTotalCharge() {
		int total = 0;
		for (SeatGroup seatGroup : seatGroups) {
			total += seatGroup.getTotalCharge();
		}
		return total;
	}
	
	//프로그램 종료
	public void exit() {
		System.out.println(hallName + " 예매프로그램을 종료합니다.");
		sc.close();
	}
	
	
	
	
	
}
