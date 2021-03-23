package quiz01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass2 {

	public static void main(String[] args) {

		// 문제.
		// 임의의 Member를 3명 저장하고,
		// 사용자로 부터 회원 번호를 입력받아서 해당 회원의 삭제를 진행하시오.

		Scanner sc = new Scanner(System.in);
		
		// Member 객체 생성
		Member m1 = new Member(1001, "member1", (new java.sql.Date( System.currentTimeMillis() ) ));
		Member m2 = new Member(1002, "member2", (new java.sql.Date( System.currentTimeMillis() ) ));
		Member m3 = new Member(1003, "member3", (new java.sql.Date( System.currentTimeMillis() ) ));
		// ArrayList 객체 생성
		List<Member> member = new ArrayList<Member>();

		// 추가 : add
		member.add(m1);
		member.add(m2);
		member.add(m3);
		
		// 제거 : remove
		// ↓
		// 회원번호 입력
		System.out.print("삭제할 회원번호 : ");
		int mNo = sc.nextInt();
		// 회원번호에 해당하는 배열의 인덱스번호 찾기
		int removeIdx = -1; //(인덱스번호 초기화 : 있을 수 없는 번호)
		for(int i = 0, length = member.size(); i<length ; i++) { 
			if(member.get(i).getMNo() == mNo) {
				removeIdx = i;
				break; // 찾으면 현재 if문 종료
			}
		}
		// 입력한 회원번호가 없으면
		if (removeIdx == -1) {
			System.out.println(mNo + "회원번호는 없습니다.");
		} else {
			// 입력한 회원번호가 있으면 삭제해라
			member.remove(removeIdx);
			System.out.println(mNo + "회원번호를 삭제했습니다.");
		}
		
		// 순회
		for (Member members : member) {
			System.out.println(members);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
