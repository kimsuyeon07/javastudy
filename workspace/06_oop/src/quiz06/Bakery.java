package quiz06;

public class Bakery {

	// field
	private int breadCount;
	private int breadPrice;
	private int bakeryMoney;
	
	// constructor
	public Bakery(int breadCount, int breadPrice, int bakeryMoney) {
		this.breadCount = breadCount;
		this.breadPrice = breadPrice;
		this.bakeryMoney = bakeryMoney;
	}
	
	// method
	// 1. 판매 메소드
	// 1) 결과타입 : breadAndChage
	// 2) 메서드명 : sell
	// 3) 매개변수 : int money
	BreadAndChange sell(int money) {
		// 판매 빵개수
		int sellBread = money/breadPrice;
		
		// 잔돈
		int change = money % breadPrice ;
		
		// 고객에게 돌려줄 BreadAndChage 생성  (빵의 개수, 돌려줄 돈)
		BreadAndChange bnc = new BreadAndChange(sellBread, change);
		
		// Bakery의 판매처리
		bakeryMoney += (money - change);
		breadCount -= sellBread;
		
		// 고객에게 빵과 잔돈 전달
		return bnc;
		
	}
	
//	public void buy(int buyCount) {
//		breadCount -= buyCount;
//		bakeryMoney += (buyCount * breadPrice);
//	}
//	
	

	// 2. info
	public void info() {
		System.out.println("재고 : 빵 " + breadCount + "개,  자본금 : " + bakeryMoney + "원");
	}
	
	
	// 필수 메서드
	public int getBreadCount() {
		return breadCount;
	}
	
	public void setBreadCount(int breadCount) {
		this.breadCount = breadCount;
	}
	
	public int getBreadPrice() {
		return breadPrice;
	}
	
	public void setBreadPrice(int breadPrice) {
		this.breadPrice = breadPrice;
	}
	
	public int getBakeryMoney() {
		return bakeryMoney;
	}
	
	public void setBakeryMoney(int bakeryMoney) {
		this.bakeryMoney = bakeryMoney;
	}
	
	
}
