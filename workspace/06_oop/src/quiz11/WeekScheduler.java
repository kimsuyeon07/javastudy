package quiz11;

import java.util.Scanner;

public class WeekScheduler {

	// field
	private int nthWeek;
	private Day[] week;
	private String[] weekNames = {"일","월","화","수","목","금","토"};
	private Scanner sc = new Scanner(System.in);
	
	// constructor
	public WeekScheduler(int nthWeek) {
		this.nthWeek = nthWeek;
		week = new Day[7];
		for (int i = 0 ; i < week.length ; i++) {
			// week 배열에 Day객체 생성.
			week[i] = new Day();  
		}
	}

	// method : run
	public void run() {
		/*줄바꿈*/System.out.println();
		
		// 스케줄을 저장, 수정, 입력 : 사용자에게 입력받아서.
		// 무한 반복문
		while(true) {
			
			// 1. menu를 보여준다
			menu();
			
			// 2. 작업 선택 : 사용자 입력
			
			System.out.print("작업 선택 >>>");
			int choice = sc.nextInt();
			sc.nextLine(); // choice 입력 뒤에 남아있는 엔터를 제거하기 위한 코드
			
			// 3. 입력 후 해당 작업으로 이동 할 수있도록 작업
			switch (choice) {
			case 1: makeSchedule(); break;
			case 2: deleteSchedule(); break;
			case 3: updateSchedule(); break;
			case 4: serchSchedule(); break;
			case 5: printAllSchedule(); break;
			case 0: exit(); return;
			// return;  :  run() 메서드의 실행을 종료하는 코드
			default : System.out.println("없는 작업입니다. 다시 입력하세요.");
				
			}
		}
	}
	// nextLine() : Enter를 입력하기 전까지 한 문자열로 인식
	
	// method : menu
	public void menu() {
		System.out.println("=====스케쥴러=====");
		System.out.println("1. 스케줄 만들기");
		System.out.println("2. 스케줄 삭제하기");
		System.out.println("3. 스케줄 수정하기");
		System.out.println("4. 스케줄 조회하기");
		System.out.println("5. 전체 스케줄 조회하기");
		System.out.println("0. 프로그램 종료하기");
		System.out.println("==================");
		/*줄바꿈*/System.out.println();
	}
	
	
	// 3. _case 0: < method : exit() >
	public void exit() {
		/*줄바꿈*/System.out.println();
		System.out.println("스케쥴러를 종료합니다.");
		sc.close();
	}
	
	
	// 3. _case 1:  < method : makeSchedule() >
	public void makeSchedule() {
		/*줄바꿈*/System.out.println();
		System.out.println("=====스케쥴 만들기=====");
		System.out.print("스케쥴을  등록할 요일 (일 ~ 토) 입력 >>>");
		String weekName = sc.next();
		weekName = weekName.substring(0, 1);
		sc.nextLine();  // 요일 뒤에 남아있는 엔터 제거
		/*줄바꿈*/System.out.println();
		
		// 배열 2개를 가지고 작업.
		// weekNames[i]의 인덱스번호를 가져와서, week[i]에 스케줄을 입력하는 방식.
		for(int i = 0; i < week.length ; i++) {
			
			// 입력한 요일이 week배열의 인덱스번호가 일치할 때 실행 하겠다.
			if(weekNames[i].equals(weekName)) {
				
				// 해당 배열공간이 비어있을 때 실행하겠다.
				if(week[i].getSchedule() == null || week[i].getSchedule().isEmpty()) {
					System.out.print(weekName + "요일의 신규 스케쥴 입력 >>>");
					String schedule = sc.nextLine();
					week[i].setSchedule(schedule);
					System.out.println(weekName + "요일에 신규 스케줄이 저장되었습니다. ");
				} else {  // 아니라면, 저장공간이 없음을 알려준다.
					System.out.println(weekName + "요일은 이미 스케줄이 있습니다.");
				}
				break;  //for문 종료
			} //if문 종료
		} //for문 종료
		System.out.println(weekName + "요일은 존재하지 않습니다.");
		/*줄바꿈*/System.out.println();
	} //makeSchedule() 종료
	
	
	// 3. _case 2:  < method : deleteSchedule() >
	public void deleteSchedule() {
		System.out.println("=====스케쥴 삭제=====");
		System.out.print("스케쥴을 삭제할 요일( 일 ~ 토 ) 입력 >>>");
		String weekName = sc.next();
		weekName = weekName.substring(0, 1); // 만약에 화 -> 화요일로 입력하게된다면,
		sc.nextLine();           		     // 0 <= 추출할 문자열 < 1     
											 // ;타입에 맞는 메서드를 사용  
											 //   ->  char : .charAt() , String : .substring()
		
		// 배열 2개를 가지고 작업.
		for(int i = 0 ; i < week.length ; i++) { 
			
			// weekNames[i]의 인덱스번호를 가져와서, week[i]에 스케줄을 입력하는 방식.
			if(weekNames[i].equals(weekName)) {
				
				// 삭제하고자 하는 데이터를 확인 및 삭제 절차 진행
				if(week[i].getSchedule() == null || week[i].getSchedule().isEmpty()) {
					/*줄바꿈*/System.out.println();
					System.out.println(weekName + "요일은 스케줄이 없습니다.");
				}else {
					System.out.println(weekName + "요일 스케쥴 조회");
					System.out.println("[ " + week[i].getSchedule() + " ]");
					/*줄바꿈*/System.out.println();
					
					System.out.println("삭제할까요 (Y / N) ? ");
					String yesNo = sc.next();
					yesNo = yesNo.substring(0, 1);  // yesNo문자열의 일부분 추출
					
					// "Y"일 때, 삭제하겠다.
					if (yesNo.equalsIgnoreCase("Y")) {
						week[i].setSchedule(null);
						System.out.println(weekName + "요일의 스케쥴이 삭제되었습니다.");
						/*줄바꿈*/System.out.println();
						
					 // "N"일 떄, 취소하겠다.	
					}else {
						System.out.println("삭제가 취소되었습니다.");
						/*줄바꿈*/System.out.println();
					} //세번째 if문 종료
				} //두번째 if문 종료 
				break; //*(이 시점에서 "break;" 입력 : for문을 종료시키기 위해서)
			} //첫번째 if문 종료
		} //for문 종료
		System.out.println(weekName + "요일은 존재하지 않습니다.");
		/*줄바꿈*/System.out.println();
	} //deleteSchedule() 메서드 종료
		
		
	// 3. _case 3:  < method : updateSchedule() >
	public void updateSchedule() {
		
		// 스케쥴 내용을 수정
		System.out.println("=====스케쥴 수정======");
		System.out.print("스케쥴 수정할 요일 (일 ~ 토) 입력 >>>");
		String weekName = sc.next();
		weekName = weekName.substring(0, 1);
		sc.nextLine();
		/*줄바꿈*/System.out.println();
		
		// 배열 두개 사용
		for (int i = 0 ; i < week.length ; i++) {
			
			// 동일한 인덱스번호가 있는 week배열에 내용 수정
			if(weekNames[i].equals(weekName)) {
				
				// 1) week배열에 내용이 없을 때, 신규 등록
				if(week[i].getSchedule()==null || week[i].getSchedule().isEmpty()) {
					System.out.println("업로드된 스케쥴이 없습니다.");
					/*줄바꿈*/System.out.println();
					
					// 신규 등록
					System.out.print("새로운 스케쥴을 등록하시겠습니까 ( Y / N ) ?");
					String yesNo = sc.next();
					sc.nextLine();
					
					// 1. 신규등록 : "Y" 입력할 때,
					if (yesNo.charAt(0) == 'Y' || yesNo.charAt(0) == 'y') {
						System.out.print(weekName + "요일의 신규 스케쥴 입력 >>>");
						String schedule = sc.nextLine();
						week[i].setSchedule(schedule);
						System.out.println(weekName + " 요일에 신규 스케쥴이 저장되었습니다.");
						
						// 1. 신규등록 :  "N" 입력할 때,
					} else {
						System.out.println("스케쥴 수정이 취소되었습니다.");
					}
					/*줄바꿈*/System.out.println();
					// 수정안에서의 신규등록 종료.
					
					// 1) week배열에 내용이 있고, 수정 시작
				} else {
					System.out.println(weekName + "요일 스케쥴 조회");
					System.out.println("[ " + week[i].getSchedule() + " ]");
					/*줄바꿈*/System.out.println();
					
					// 수정 ;질문
					System.out.print("스케쥴을 수정하시겠습니까 ( Y / N ) ?");
					String yesNo = sc.next();
					yesNo = yesNo.substring(0, 1);
					sc.nextLine();
					
					// 수정 : "Y" 입력할 때,
					if (yesNo.equalsIgnoreCase("Y")) {
						System.out.print(weekName + "새로운 스케쥴 입력 >>>");
						String schedule = sc.nextLine();
						week[i].setSchedule(schedule);
						System.out.println(weekName + "요일의 스케쥴이 수정되었습니다.");
						/*줄바꿈*/System.out.println();
						
						// 수정 :  "N" 입력할 때, 
					} else {
						System.out.println("스케쥴 수정이 취소되었습니다.");
						/*줄바꿈*/System.out.println();
						
					} //세번째 if문 종료
				} //두번째 if문 종료
				break; //*(이 시점에서 "break;" 입력 : for문을 종료시키기 위해서)
			} //첫번째 if문 종료
		} //for문 종료
		System.out.println(weekName + "요일은 존재하지 않습니다.");
		/*줄바꿈*/System.out.println();
	} //updateSchedule() 메서드 종료
	
	
	// 3. _case 4:  < method : serchSchedule() >	
	public void serchSchedule() {
		
		// 조회 업무
		System.out.println("=====스케쥴 조회=====");
		System.out.print("조회하고자 하는 스케쥴 요일 (일 ~ 토) 입력 >>>");
		String weekName = sc.next();
		weekName = weekName.substring(0, 1);
		sc.nextLine();
		/*줄바꿈*/System.out.println();
		
		// 배열 2개 사용
		for (int i = 0 ; i < week.length; i++) {
			
			// weekNames배열의 인덱스번호와 동일한 week배열의 스케쥴 조회
			if(weekNames[i].equals(weekName)) {
				
				// 조회
				System.out.print(weekName + "요일의 스케쥴 : ");
				week[i].info();
				/*줄바꿈*/System.out.println();
				return;
				
			}//if문 종료
		} //for문 종료
		System.out.println(weekName + "요일은 존재하지 않습니다.");
		/*줄바꿈*/System.out.println();
	} //serchSchedule() 메서드 종료 
		
	
	// 3. _case 5:  < method : printSchedule() >			
	public void printAllSchedule() {
		
		// 전체 출력
		System.out.println("====="+ nthWeek +"주차 전체 스케쥴 조회=====");
		
//		for(Day day : week) {
//			day.info();
//		}  => 향상 for문 사용 시 : 요일이 안나와서 안씀...
		
		for(int i = 0 ; i < week.length ; i++) {
			System.out.print(weekNames[i] + "요일 스케쥴 : ");
			week[i].info();
			/*줄바꿈*/System.out.println();
		} // for문 종료
		
	} //printAllSchedule() 메서드 종료
	
	
	// 이클립스로 GitHub에 업로드 하는 방법
	// Git Staging 창에서
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
