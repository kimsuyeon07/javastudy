package quiz01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 문제.
// 임의의 Member를 3명 저장하고,
// 사용자로 부터 회원 번호를 입력받아서 해당 회원의 삭제를 진행하시오.

public class MainClass {

	public static void main(String[] args) {

		
		java.sql.Date date = new java.sql.Date(System.currentTimeMillis());  // 오늘 날짜.
		Scanner sc = new Scanner(System.in);
		
		
		
		Member m1 = new Member(1001, "user1", new java.sql.Date(System.currentTimeMillis()));
		Member m2 = new Member(1002, "user2", new java.sql.Date(System.currentTimeMillis()));
		Member m3 = new Member(1003, "user3", new java.sql.Date(System.currentTimeMillis()));
		
		List<Member> members = new ArrayList<Member>();
		
		// 회원 추가
		members.add(m1);
		members.add(m2);
		members.add(m3);
		
		// 회원번호 입력 후, 삭제
		System.out.print("삭제할 회원번호를 입력하세요 >>>");
		int mNo = sc.nextInt();
		
		int removeIdx = -1;  // 존재하지 않는 값(-1) : 삭제할 회원의 인덱스(초기화)
		int length = members.size();
		for (int i = 0; i < length ; i++) {
			// members.get(0) == m1
			if ((members.get(i).getMNo()) == mNo) {
				removeIdx = i;
				break;
			}
		}  
		// for문이 끝났을 때 해당 회원번호를 발견하지 못해서 removeIdx = -1이라면
		if (removeIdx == -1) {
			System.out.println(mNo + "회원번호를 가진 회원이 없습니다.");
		} else {
			members.remove(removeIdx);
			System.out.println(mNo + "회원번호를 가진 회원 정보를 삭제했습니다.");
		}
		
		// Member 클래스는 toString() 메서드가 오버라이드 되어 있으므로.
		// System.out.println(m1); 처럼 출력이 가능하다.
		
//		System.out.println("한번에 확인하는 방법 : " + members);
		System.out.println("순회");
		for (Member memberss : members) {
			System.out.println(memberss);
		}
		

		
	}
}
