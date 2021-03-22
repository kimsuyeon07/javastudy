package ex08_exception_class;

import java.util.prefs.BackingStoreException;

public class MainClass {

	public static void main(String[] args) {

		// BankAccount 객체 생성
		BankAccount me = new BankAccount("1111", 10000);
		BankAccount you = new BankAccount("2222", 10000);
		

		// 입금 / 출금 / 조회
		// try가 필요
		try {
//			me.deposit(10000);
//			me.withdraw(50000);
			me.transfer(you, 5000);
		} catch (BankAccountException e) {
			System.out.print("에러코드 [ " + e.getErrorCode() + " ]");
			System.out.println(e.getMessage());
		} finally { // 오류가 나는 안나든 무조건 실행하는 코드
			me.inquiry();
			you.inquiry();
		}
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
