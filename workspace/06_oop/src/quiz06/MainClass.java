package quiz06;

public class MainClass {

	public static void main(String[] args) {
 
		// Quiz06
		// 
		
		Bakery bakery1 = new Bakery(100, 1000, 10000);  // 빵100개, 가격1000원, 자본금10000원
		Bakery bakery2 = new Bakery(50, 500, 10000);    // 빵 50개, 가격 500원, 자본금10000원
		
		Customer customer = new Customer(20000);        // 가진돈20000원
		
		customer.buy(bakery1, 10000);  // 빵집 지정, 빵 10000원어치 구매  - 구매 : 빵 10개, 남은돈 10000원
		customer.buy(bakery2, 10000);  // 빵집 지정, 구매 빵 금액         - 구매 : 빵 30개, 남은돈 0원
		
		bakery1.info();  // 재고 : 빵 90개, 자본금 : 20000
		bakery2.info();  // 재고 : 빵 30개, 자본금 : 20000
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
