package ex02_loop;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
 
		// 3. 비밀번호를 "asdf"로 가정합니다.
		// 비밀번호를 입력받아서 일치하면 "로그인되었습니다"
		// 일치하지 않으면 "비밀번호를 확인하세요"
		// 최대 5번만 입력을 받을 수 있습니다.
		// 5번 실패하면 "비밀번호 입력 횟수를 초과했습니다."
		
		Scanner sc = new Scanner(System.in);
		
//		String pw = null;
//		int n = 0;
//		while (n < 6) {
//			if (n == 5) {
//				System.out.println("비밀번호 입력 횟수를 초과했습니다.");
//				break;
//			}
//			
//			System.out.print("비밀번호를 입력하세요 : ");
//			pw = sc.next();
//			
//			if (pw.equalsIgnoreCase("asdf")) {
//				System.out.println("로그인되었습니다.");
//				break;
//			} else {System.out.println("비밀번호를 확인하세요.");}
//			
//			n++;
//			
//		}
		
		int count = 0;
		while (true) {
			// 최대 5번까지 입력되었을 때, 출력되는 if문
			if (count == 5) {
				System.out.println("비밀번호 횟수를 초과했습니다.");
				break;
			}
			// 사용자가 직접 입력 (비밀번호 입력)
			System.out.print("비밀번호 입력 : ");
			String pwd = sc.next();
			
			// 사용 횟수 누적
			count++;
			
			// 비밀번호가 일치했을 경우, 작동 되는 if문
			if (pwd.equals("asdf")) {
				System.out.println("로그인되었습니다.");
				break;
			} else { System.out.println("비밀번호를 확인하세요."); }
			  // 아니라면, 비밀번호 확인 문자 출력 후, 다시 while문으로 이동.
		}
		
		
		
		
		
	}
}
