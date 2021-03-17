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
<<<<<<< HEAD

	
	
	
	
	// 1. method : reservation()
	// 예약	 1) 결과타입 : boolean (성공 true, 실패 false)
	//		 2) 메서드명 : reservation
	// 		 3) 매개변수 : 없다.
	public boolean reservation() {
		// 좌석 번호 (seatNo) : 1 ~ 10
		// seats 배열 인덱스     : 0 ~  9
		System.out.print("예매할 좌석 번호 :");
		int seatNo = sc.nextInt();
		/*줄바꿈*/System.out.println();
		// 사용자가 예매하려는 좌석은 seats[seatNo - 1] 입니다.
		
		// 1). 예매 번호 확인
		if (seatNo < 1 || seatNo > seats.length) {
			System.out.println(seatNo + "번은 없는 좌석입니다. 예약을 다시 시도하세요.");
			/*줄바꿈*/System.out.println();
			return false;  // 현재 메서드를 끝낸다. (return타입의 메서드 경우 : 메서드 끝내는 방법 !!)
		} 
		// 2). 예애 여부 확인
		if(seats[seatNo - 1].check()) {
			System.out.print("예매자의 이름을 입력하세요 : ");
			String name = sc.next();/*줄바꿈*/System.out.println();
			
			seats[seatNo - 1].setName(name);
			System.out.println(seatNo + "번 좌석이 " + name + "님에게 예약되었습니다. 감사합니다.");
			/*줄바꿈*/System.out.println();
			return true;
		}else {
			System.out.println(seatNo + "번 좌석은 이미 예약된 좌석입니다. 예약을 다시 시도하세요.");
			/*줄바꿈*/System.out.println();
			return false;
		}
	}
	
	
	
	// 2. method : cancel()
	// 예약	 1) 결과타입 : boolean (성공 true, 실패 false)
	// 취소	 2) 메서드명 : cancel
	// 		 3) 매개변수 : 없다.
	public boolean cancel() {
		System.out.print("에매 취소자의 이름을 입력하세요 : ");
		String name = sc.next();
		/*줄바꿈*/System.out.println();
		
		for (int i = 0 ; i < seats.length; i++) {
			if(seats[i].getName() != null && seats[i].getName().equals(name)) {
				System.out.print("취소하시겠습니까? (Y/N) >>>");
				String yesNo = sc.next();
				yesNo = yesNo.charAt(0) + "";  // yesNo.substring(0, 1);
				sc.nextLine();
				/*줄바꿈*/System.out.println();
				
				if(yesNo.equalsIgnoreCase("Y")) {
					seats[i].cancel();
					System.out.println("예매가 취소되었습니다.");
					/*줄바꿈*/System.out.println();
					return true;
				} else {
					System.out.println("예매 취소가 취소되었습니다.");
					/*줄바꿈*/System.out.println();
					return false;
				} // if문 (Y/N)종료
			} //if문 (취소하시겠습니까?)종료
		} //for문 종료
		System.out.println(name + " 이름의 예약자가 없습니다. 다시 시도하세요.");
		return false;
		
	} // cancel() 메서드종료
	
	
	
	// 3. method : info()
	// 예약	 1) 메서드명 : info
	// 현황	 
	public void info() {
		System.out.print(seatType + " : ");
		for (int i = 0 ; i < seats.length; i++) {
			seats[i].info();
			System.out.print(" ");
		} //for문 종료
		System.out.println();
	} //info() 메서드 종료
	

	
	// 4. method : getTotalCharge
	// 예약	 1) 결과타입 : int 
	// 총액	 2) 메서드명 : getTotalCharge
	// 반환	 3) 매개변수 : 없다.
	public int getTotalCharge() {
		int total = 0;
		for (Seat seat : seats) {
			if (!seat.check()) { //예약된 좌석이면.
				total += charge;
			} //if문 종료
		} //for문 종료
		return total;
	} //getTotalCharge() 메서드 종료




	
	

	// method : Getter and Setter
=======
	
	// method
	public void info() {
		
	}

	
	
	
	
	// method : Getter / Setter
>>>>>>> 9d4faab8c5a8a9a16b4ac2ee94805518a7ae4ff4
	public Seat[] getSeats() {
		return seats;
	}

	public void setSeats(Seat[] seats) {
		this.seats = seats;
	}
	
	
	
	
	
	
	
	
	
<<<<<<< HEAD
	
=======
>>>>>>> 9d4faab8c5a8a9a16b4ac2ee94805518a7ae4ff4
}
