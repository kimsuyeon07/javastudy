package char_Writer_Reader;

import java.io.Serializable;

// ObjectOutputStream => writerObject() 메서드로 호출되는 클래스
// 반드시 "직렬화"해야한다.
// 직렬화방법 : Serializable 인터페이스 구현 : serialVersionID를 생성

public class Board implements Serializable {
	
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

	// method : toString
	@Override
	public String toString() {
		return "Board [title=" + title + ", content=" + content + ", writer=" + writer + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
