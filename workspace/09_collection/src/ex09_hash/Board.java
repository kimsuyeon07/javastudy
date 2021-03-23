package ex09_hash;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Board {

	// field
	private int bNo;
	private String title;
	private String writer;

	
	// method : toString() : Override
	@Override
	public String toString() {
		return "Board [bNo=" + bNo + ", title=" + title + ", writer=" + writer + "]";
	}


	// method : hashCode() + equals() : Override : 자동완성 
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bNo;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((writer == null) ? 0 : writer.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Board other = (Board) obj;
		if (bNo != other.bNo)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (writer == null) {
			if (other.writer != null)
				return false;
		} else if (!writer.equals(other.writer))
			return false;
		return true;
	}

	
//	// method : hashCode() : Override : 자동으로 만들어준다.
//	@Override
//	public int hashCode() {
//		// return 1 ; // 모든 Board는 해시코드가 1이다. (성능차이 : 안좋은 방법 : 모든 Board를 비교하겠다는 의미)
//		//return title.length(); // title의 글자 수가 같으면 같은 Board의 가능성이 있다.
//		return title.length() + writer.length(); // title의 글자수와 writer의 글자수를 합친 수가 같으면 ..
//	}
//	
//	// method :equals() : Override 
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj) {
//			return true;
//		}
//		if (obj instanceof Board) {       // 전달받은 Object(obj)와  현재 데이터타입(Board)을 비교하겠다. 
//			Board board = (Board)obj;
//			return this.bNo == board.bNo; // 게시글의 번호(bNo)가 같으면 같은 Board이다.
//		} else {
//			return false;  // 전달받은것이 Board타입이 아니다.
//		}
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

/*
 * HashSet에 Board를 저장하고자 합니다.
 * 동일한 Board의 경우 저장이 안되도록 설정해야 합니다.
 * 
 * 1. 자바의 기본 동작 
 *    1) 저장할 Board의 해시코드를 확인합니다. (저장된 주소값 호출)
 *    2) 같은 해시코드를 가지고 있는 Board가 있습니까? <없음>
 *    	 =>  ( ? : Board를 만들기 위해서는 "new"가 필요하기 때문에 같은 주소값을 가질 수 없습니다 )
 *    3) 따라서, 같은 Board는 없다고 판단합니다.
 *    4) 무조건 저장됩니다.
 * 
 * 2. 추가해야 할 작업_
 *    1) 같은 Board는 같은 해시코드를 가질 수 있도록 hashCode()메서드를 오버라이드 합니다. 
 *    2) 같은 Board인지 비교할 수 있는 equals()메서드를 오버라이드합니다.
 *    3) 같은 해시코드르 가지고, equals() 결과가 true이면 동일한 Board가 있다고 판단하므로  저장되지 않습니다.
 *    
 *    
 * ==================== 최종결론 =====================
 * 
 * Hash 기반의 컬렉션프레임워크(HashSet, HashMap 등)에
 * 저장할 객체들은
 * 모두 Generate hashCode() and equals() 를 추가해 줍니다.   
 *    
 * ================================================    
 *    
*/













