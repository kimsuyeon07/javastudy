package quiz05;

public class BankAccount {

	
	// field
	private String accNo;
	private long balance;  // 통장 잔고
	
	
	// constructor
	public BankAccount(String accNo, long balance) {
		this.accNo = accNo;
		this.balance = balance;
	}
	public void bankAccount() {
		
	}
	
	// 입금 : deposit method 
	public void deposit(long money) { 
		// 10000원 입금
		// 마이너스 입금은 불가능합니다.
		if (money > 0) {
			this.balance += money;
			System.out.println(money + "원 입금");
		} else {
			System.out.println(money + "원은 입금할 수 없습니다.");
		}
	}
	
	
	// 출금 : withdraw method
	// (실제로 출금된 금액을 반환하는 메서드로 만들고자!)
	public long withdraw(long money) {  // money : 요청된 금액
		
		// 5000원 출금
		// 마이너스 출금은 불가능합니다.
		// 통장잔고가 부족합니다.
		if (money <= 0) {
			System.out.println( money + "원은 출금이 불가능합니다.");
			return 0;
		} else if (money > this.balance) {
			System.out.println("통장잔고가 부족합니다.");
			return 0;
		}
			this.balance -= money;
			System.out.println( money + "원 출금" );
			return money;
	}

	
	// 이체 : transfer method
	public void transfer( BankAccount who, long money) {
		
		// ** 사용방법 
		// 내 통장에서 출금된 금액을 네 통장에 입금해 준다.
		who.deposit( withdraw(money) );
		// withdraw(money) : 0, money를 반환하기 때문에 결과 값이 0 OR 계산 값이 나온다.

		
		
		//		if (money < balance) {
//			
//			// 내돈은 줄어든다.
//			withdraw(money);
//			// 네돈은 늘어난다.
//			who.deposit(money);
//			
//			return;
//		}
		
		
	}
			
	
	
	// 정보 : inquiry method
	public void inquiry() {
		System.out.println("계좌번호 : "+ accNo +", 잔액 : "+ balance +"원");
	}
	
	
	
	
	
}
