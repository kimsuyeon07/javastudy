package main;

import java.util.List;
import java.util.Scanner;

import dao.StaffDao;
import dto.StaffDto;

public class StaffManager {

	// field
	private StaffDao dao = StaffDao.getInstance();
	private Scanner sc = new Scanner(System.in);
	
	
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
			case 2: updateStaff(); break;
			case 3: deleteStaff(); break;
			case 4: selectOne(); break;
			case 5: selectList(); break;
			case 6: System.out.println("프로그램을 종료합니다.");
					return;
			default : System.out.println("다시 선택하세요.");
			
			}
		} 
	} 
		
	
	// method : insertStaff()
	public void insertStaff() {
		// 사용자 입력
		System.out.print("신규 사원 이름 >>>");
		String name = sc.next();
		System.out.print("신규 부서 이름 >>>");
		String department = sc.next();
		
		// DB전달 순서 : 사용자 입력 > DTO 전달 > DAO 전달 > 데이터베이스(DB)전달
		// DB에 전달하기위해 StaffDao에 전달한다. 
		// [ StaffDto클래스의 ] StaffDto staffDto에 값을 전달한다.
		StaffDto staffDto = new StaffDto(); // StaffDto객체생성
		int no = dao.selectMaxNo(); // 가장 마지막의 사원번호 값을 구한다.
		staffDto.setNo(no + 1);     // 새로운 사원을 등록할 때, 중복된 사원번호를 사용하지 않도록 지정.
		staffDto.setName(name);
		staffDto.setDepartment(department);
		int result = dao.insertStaff(staffDto); 
		// 1. 해당 메서드로 staff에 들어갈 칼럼 값을 입력받고
		// 2. 입력받은 값을 StaffDto클래스의 필드값에 저장시킨다. (Setter 사용)
		// 3. StaffDto클래스의 필드값을 StaffDao클래스의 .insertStaff()에 보내 칼럼값을 저장시킨다. (Getter 사용)
		// 4. dao.insertStaff(staffDto); 으로 StaffDao클래스의 .insertStaff()의 리턴값을 받아온다.
		
		System.out.println(result + "명의 사원이 추가되었습니다.");
		System.out.println();
		
	}
	
	// method : updateStaff()
	public void updateStaff() {
		System.out.print("수정할 사원 번호 입력 >>>");
		int no = sc.nextInt();
		StaffDto staffDto = dao.selectOneByNo(no);
		System.out.print("수정할 내용 선택(1.이름, 2.부서) >>> ");
		int choice = sc.nextInt();
		if (choice == 1) {
			System.out.print("수정할 사원 이름 입력 >>>");
			String name = sc.next();
			// StaffDto클래스에 값을 전달한다.
			staffDto.setName(name);
		} else if (choice == 2) {
			System.out.print("새로운 부서 이름 입력 >>>");
			String department = sc.next();
			// StaffDto클래스에 값을 전달한다.
			staffDto.setDepartment(department);
		} else {
			System.out.println("잘못된 선택입니다. 수정을 종료합니다.");
			return; // 더이상 진행하지 못하도록.
		}
		staffDto.setNo(no);
		//StaffDao클래스의 .updateStaff()메서드의 리턴 값을 전달받는다
		int result = dao.updateStaff(staffDto);
		System.out.println(result + "명의 회원정보가 수정되었습니다.");
		System.out.println();
		
	}
			
		
		
	
	// method : deleteStaff()
	public void deleteStaff() {
		System.out.print("삭제할 회원 번호 입력 >>>");
		int no = sc.nextInt();
		// StaffDto클래스에 값을 전달한다.
		StaffDto staffDto = new StaffDto();
		staffDto.setNo(no);
		// StaffDao클래스의 .deleteStaff()의 리턴값을 전달받는다.
		int result = dao.deleteStaff(staffDto);
		System.out.println(result + "명의 회원정보를 삭제하였습니다.");
		
	}
	
	
	public void selectOne() {
		System.out.print("조회할 사원번호 입력 >>>");
		int no = sc.nextInt();
		StaffDto staffDto = dao.selectOneByNo(no);
		if (staffDto == null) {
			System.out.println("사원번호 " + no + "를 가진 사원이 없습니다.");
		} else {
			System.out.println(staffDto);
		}
	}
	
	
	public void selectList() {
		List<StaffDto> staffList = dao.selectList();
		System.out.println("총 사원 수 : " + staffList.size() + "명");
		for (StaffDto staffDto : staffList) {
			System.out.println(staffDto);
		}
	}
	
	
	
	
	
}
