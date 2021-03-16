package quiz06;

public class Customer {

	// field
	private int customerMoney;
	private int customerBread;
	
	
	// constructor
	public Customer(int customerMoney) {
		this.customerMoney = customerMoney;
	}
	
	
	// method
	public void buy(Bakery where,int money) {
		// 베이커리에서 판매한 빵과 잔돈을 받으면 된다.
		BreadAndChange bnc = where.sell(money);
		
		// 구매처리
		customerBread += (bnc.getBread());
		customerMoney -= money;
		customerMoney += (bnc.getChange());
		System.out.println("구매 : 빵 "+ customerBread +"개,  남은돈 : "+ customerMoney + "원" );
	}

	
	
	
	

	
	
	
}
