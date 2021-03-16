package quiz06;

public class Book {

	String title;
	String writer;
	int price;
	
	Book(String title, String writer, int price){  // 생성자 1
		this.title = title;
		this.writer = writer;
		this.price = price;
	}
	Book(String title, int price) {                // 생성자 2
		this(title, "미상", price); 
	}
	Book() {                                       // 생성자 3
		this("없음", 0);
	    // 생성자2번째로 넘길 수 도 있음. <생성자 3 => 생성자 2 => 생성자 1로 넘겨짐.>
		// this(title, price); 로 넘기면 된다.
	}
	
	
    void info() {
    	System.out.println("제목 : "+ title +", 저자 : "+ writer +", 가격 : "+ price +"원");
    }
	
	
	
}
