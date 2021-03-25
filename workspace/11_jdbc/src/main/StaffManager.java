package main;

import java.util.Scanner;

import dao.StaffDao;
import dto.StaffDto;

public class StaffManager {

	// field
	private StaffDao dao = StaffDao.getInstance();
	private Scanner sc = new Scanner(System.in);
	private int no;
	
	
	// method : menu()
	 public void menu () {
		 System.out.println("=======사원관리프로그램========");
		 System.out.println("1. 사원 등록");
		 System.out.println("2. 정보 수정");
		 System.out.println("3. 퇴사 처리");
		 System.out.println("4. 사원 검색");
		 System.out.println("5. 전체 조회");
		 System.out.println("6. 프로그램 종료");
		 System.out.println("==========================");
	 }
	
	// method : execute()
	public void execute() {
		// 무한 반복
		while (true) {

			// 메뉴호출
			menu();
			
			System.out.print("선택 (1~6) >>>");
			switch (sc.nextInt()) {
			case 1: insertStaff(); break;
			case 2:
			case 3:
			case 4:
			case 5:
			case 6: System.out.println("프로그램을 종료합니다.");
					return;
			default : System.out.println("다시 선택하세요.");
			
			}
		} 
	} 
		
	
	// method : insertStaff()
	public void insertStaff() {
		// 사원번호 : 필드를 하나 만들어놓고 insert할때마다 + 해주는 방식
		no++;
		System.out.print("사원 이름 >>>");
		String name = sc.next();
		System.out.print("부서 이름 >>>");
		String department = sc.next();
		
		// DB전달 순서 : 사용자 입력 > DAO 전달 > 데이터베이스(DB)전달
		// DB에 전달하기위해 StaffDao에 전달한다. 
		// [ StaffDto클래스의 ] StaffDto staffDto에 값을 전달한다.
		StaffDto staffDto = new StaffDto();
		staffDto.setNo(no);
		staffDto.setName(name);
		staffDto.setDepartment(department);
		int result = dao.insertStaff(staffDto);
		
		System.out.println(result + "명의 사원이 추가되었습니다.");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
