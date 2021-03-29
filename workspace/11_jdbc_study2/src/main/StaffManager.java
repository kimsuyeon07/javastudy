package main;

import java.util.List;
import java.util.Scanner;

import dao.StaffDao;
import dto.StaffDto;

public class StaffManager {

	// field
	private StaffDao dao = StaffDao.getInstance();
	private Scanner sc = new Scanner(System.in);
	
	// menu()
	public void menu() {
		System.out.println("=== Staff 관리시스템 ===");
		System.out.println("1. 사원추가");
		System.out.println("2. 정보수정");
		System.out.println("3. 퇴사처리");
		System.out.println("4. 사원검색");
		System.out.println("5. 전체조회");
		System.out.println("6. 프로그램 종료");
		System.out.println("====================");
	}
	
	// execute()
	public void execute() {
		while(true) {
			menu();
			
			System.out.print("선택 (1~6) 입력 >>> ");
			switch (sc.nextInt()) {
			case 1: insertStaff(); break;
			case 2: updateStaff(); break;
			case 3: deleteStaff(); break;
			case 4: selectOneByNo(); break;
			case 5: selectList(); break;
			case 6: System.out.println("프로그램을 종료합니다."); return;
			default: System.out.println("잘못된 번호입니다. 다시 입력하세요.");
			}
		}
	}
	
	
	
	// insertStaff()
	public void insertStaff() {
		System.out.print("신규 사원 이름 : ");
		String name = sc.next();
		System.out.print("신규 사원 부서 : ");
		String department = sc.next();
		
		StaffDto staffDto = new StaffDto();
		staffDto.setName(name);
		staffDto.setDepartment(department);
		int no = dao.selectMaxNo();
		staffDto.setNo(no + 1);
		
		int result = dao.insertStaff(staffDto);
		System.out.println(result + "명의 사원이 추가되었습니다.");
	}
	
	
	// updateStaff()
	public void updateStaff() {
		System.out.print("수정할 사원 번호 >>> ");
		int no = sc.nextInt();
		
		StaffDto staffDto = dao.selectOneByNo(no);

		System.out.print("수정 사항 (1.이름   2.부서) >>>");
		int choice = sc.nextInt();
		
		if (choice == 1) {
			System.out.print("이름 : ");
			String name = sc.next();
			staffDto.setName(name);
		} else if (choice == 2) {
			System.out.print("부서 : ");
			String department = sc.next();
			staffDto.setDepartment(department);
		} else {
			System.out.println("잘못된 입력입니다. 수정을 종료합니다."); return;
		}
		
		int result = dao.updateStaff(staffDto);
		System.out.println(result + "명의 사원 정보가 수정되었습니다.");
	}
	
	// deleteStaff()
	public void deleteStaff() {
		System.out.print("삭제할 사원 번호 >>> ");
		int no = sc.nextInt();
		
		StaffDto staffDto = new StaffDto();
		staffDto.setNo(no);
		
		int result = dao.deleteStaff(staffDto);
		System.out.println(result + "명의 사원 정보가 삭제되었습니다.");
	}
	
	
	// selectOneByNo()
	public void selectOneByNo() {
		System.out.print("조회할 사원 번호 >>> ");
		int no = sc.nextInt();
		
		StaffDto staffDto = dao.selectOneByNo(no);
		if (staffDto == null) {
			System.out.println("사원번호 " + no + "인 사원이 없습니다.");
		} else {
			System.out.println(staffDto);
		}
	}

	
	// selectList()
	public void selectList() {
		List<StaffDto> staffList = dao.selectList();
		System.out.println("총 사원 " + staffList.size() + "명");
		for (StaffDto staffLists : staffList) {
			System.out.println(staffLists);
		}
	}
		
	
	
	
	
	
	
	
	
	
	
	
}
