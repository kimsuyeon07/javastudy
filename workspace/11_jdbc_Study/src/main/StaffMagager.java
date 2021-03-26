package main;

import java.util.List;
import java.util.Scanner;

import dao.StaffDao;
import dto.StaffDto;

public class StaffMagager {

	// field
	private StaffDao dao = StaffDao.getInstance();  // StaffDao클래스의 생성자를 호출 : .getInstance()
	private Scanner sc = new Scanner(System.in);
	
	// method : menu()
	public void menu() {
		System.out.println("==== 사원관리프로그램 ====");
		System.out.println("1. 사원 등록");
		System.out.println("2. 정보 수정");
		System.out.println("3. 퇴사 처리");
		System.out.println("4. 사원 검색");
		System.out.println("5. 전체 조회");
		System.out.println("6. 프로그램 종료");
		System.out.println("====================");
	}
	
	// method : execute() : 메뉴호출
	public void execute() {
		// 무한반복
		while (true) {
			menu();
			System.out.print("선택(1~6) >>> ");
			switch (sc.nextInt()) {
			case 1: break;
			case 2: break;
			case 3: break;
			case 4: break;
			case 5: break;
			case 6: System.out.println("프로그램을 종료합니다."); return;
			default: System.out.println("다시 선택하세요.");
			}
		}
	}
	
	
	// method : [INSERT] insertStaff() : void
	public void insertStaff() {
		System.out.print("신규 사원 이름 >>> ");
		String name = sc.next();
		System.out.print("신규 부서 이름 >>> ");
		String department = sc.next();
		
		StaffDto staffDto = new StaffDto();
		int no = dao.selectMaxNo();
		staffDto.setNo(no + 1);
		staffDto.setName(name);
		staffDto.setDepartment(department);
		int result = dao.insertStaff(staffDto);
		
		System.out.println(result + "명의 사원이 추가되었습니다.");
		System.out.println();
		
	}
	
	
	// method : [UPDATE] updateStaff() : void
	public void updateStaff() {
		System.out.print("수정할 사원 번호 >>> ");
		int no = sc.nextInt();
		
		StaffDto staffDto = dao.selectOneByNo(no);
		System.out.print("수정할 내용 선택 (1.이름, 2.부서) >>> ");
		int choice = sc.nextInt();
		if (choice == 1) {
			System.out.print("수정할 사원 이름 : ");
			String name = sc.next();
			staffDto.setName(name);
		} else if (choice == 2) {
			System.out.print("수정할 부서 이름 : ");
			String department = sc.next();
			staffDto.setDepartment(department);
		} else {
			System.out.println("잘못된 입력입니다. 수정을 종료합니다.");
			return;
		}
		
		staffDto.setNo(no);
		
		int result = dao.updateStaff(staffDto);
		System.out.println(result + "명의 사원 정보가 수정되었습니다.");
		System.out.println();
		
	}
	
	// method : [DELETE] : delectStaff() : void
	public void delecteStaff() {
		System.out.print("삭제할 사원 번호 임력 >>> ");
		int no = sc.nextInt();
		
		StaffDto staffDto = new StaffDto();
		staffDto.setNo(no);
		
		int result = dao.deleteStaff(staffDto);
		System.out.println(result + "명의 사원 정보가 삭제되었습니다.");
	}
	
	// method : [SELECT] : selectOne() : void
	public void selectOne() {
		System.out.print("조회할 사원 번호 입력 >>>");
		int no = sc.nextInt();
		
		StaffDto staffDto = dao.selectOneByNo(no);
		
		if(staffDto == null) {
			System.out.println("사원번호 " + no +"를 가진 사원이 없습니다.");
		} else {
			System.out.println(staffDto);
		}
	}
	
	// method : [SELECT] : selectList() : void
	public void selectList() {
		List<StaffDto> staffList = dao.selectList();
		System.out.println("총 사원 수 " + staffList.size() + "명");
		for (StaffDto staffDto : staffList) {
			System.out.println(staffDto);
		}
	}
	
	
	
	
	
	
	
	
	
	
}
