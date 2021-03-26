package ex02_byte;

import java.io.Serializable;

// ObjectOutputStream에 의해서 writeObject() 메서드로 호출되는 클래스입니다.
// 반드시 "직렬화" 해야 합니다.

// "직렬화" 방법 : Serializable 인터페이스를 구현합니다. => serialVersionID를 생성합니다.

public class Board implements Serializable {

	/**  
	 *  => javadoc (주석과 비슷하지만 다른 개념? 자바도큐먼트)
	 */
	private static final long serialVersionUID = 8782542118491866388L;
	
	// field
	private String title;
	private String content;
	private String writer;
	// constructor
	public Board(String title, String content, String writer) {
		super();
		this.title = title;
		this.content = content;
		this.writer = writer;
	}
	// method : toString()
	@Override
	public String toString() {
		return "Board [title=" + title + ", content=" + content + ", writer=" + writer + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
