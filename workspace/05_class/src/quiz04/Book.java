package quiz04;

public class Book {

	
	String title;
	String writer;
	int price;
	
	void set(String t, String w, int p) {
		title = t;
		writer = w;
		if ( p > 0) {price = p;}
		
	}

	void set(String t, String w) {
		set(t, w , 0);
	}
	
	void set(String t, int p) {
		set(t, "미상", p);
	}
	
	void info() {
		
		System.out.println("제목 : "+ title +", 저자 : "+ writer +", 가격 : "+ price +"원");
	}
	 
	
	
	
}
