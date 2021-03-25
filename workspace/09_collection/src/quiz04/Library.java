package quiz04;

import java.util.ArrayList;
import java.util.List;

public class Library {

	// field
	private String name;
	private List<Book> books = new ArrayList<Book>();  // 배열의 길이가 정해지 않는다.
	
	
	// constructor
	public Library(String name) {
		this.name = name;
	}
	
	// method : info()
	public void bookInfo() {
		System.out.println("도서관 : " + name);
		for(Book book : books) {
			System.out.println(book);
		}
	}
	
	// method : addBook()
	public void addBook(Book book) {
		books.add(book);
	}
	
	// method : removeBook()
	public void removeBook(int bNo) {
		
		// for문 (향상)
		for (Book book : books) {
			if (book.getBNo() == bNo) {
				books.remove(book);  //지금 확인하고 있는 book배열을 값을 지워라
				break;
			}
		}
		/*==============================================================
		int idx = -1;
		for(int i = 0, length = books.size(); i<length ; i++) {
			if (books.get(i).getBNo() == bNo) {
				idx = i;
				break;
			}
		} //for문 종료
		
		if(idx == -1) {
			System.out.println(bNo + "번호의 책 정보가 없다");
		} else {
			books.remove(idx);
			System.out.println(bNo + "번호의 책 정보을 삭제한다.");
		} // 삭제 여부 확인 후, 삭제 완료
		===============================================================*/
	} //removeBook()메서드 종료
		
		
		
	
	
	
	
	
	
	
	
	
	
}
