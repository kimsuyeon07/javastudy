package char_Writer_Reader;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Object_Input_Output_MainClass {

	public static void main(String[] args) {

		// Output : 객체 생성, 파일에 들어갈 내용 삽입
		// Input  : 파일 내용 출력
		
		// ObjectOutputStream : 객체생성
		// ObjectInputStream  : 
		
		
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("board.dat"));
			Board board = new Board("공지", "꼭 읽어라", "관리자");
			oos.writeObject(board);
			
			
			
			
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
