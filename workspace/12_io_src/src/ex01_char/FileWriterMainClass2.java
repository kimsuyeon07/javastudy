package ex01_char;

import java.io.FileWriter;
import java.io.IOException;


/*
 	try-catch-resource문 
 	1. close() 메서드를 자동으로 호출하는 try문
 	2. 형식
 		try (스트림 생성) {
 		
 		} catch ( ) {
 		
 		}
 		
 	→→→
 	 * char[]을 사용할 때  
 	 * ↓↓↓
 	 * fw.write(cbuf, off(start index), len(length:길이)); 를 사용하는 이유 ?
 	 * --
 	 * (fw,write(cbuf)도 가능하지만,)
 	 * 해당 방법은 경우에 따라서 원본보다 큰 데이터 용량을 전달 받을 수 있다 
 	 * => [배열의 공간에서 빈 공간을 다 한꺼번에 전달해버려서]
 */



public class FileWriterMainClass2 {

	public static void main(String[] args) {

		
		try (FileWriter fw = new FileWriter("text2.txt")) {
			char[] cbuf = {'H','e','l','l','o'};
			fw.write(cbuf, 0, 1);  // '0'번 인덱스번호부터 '1'개 보내세요.  
			fw.write(cbuf, 0, cbuf.length); // 인덱스0부터 cbuf길이만큼 보내기(전체보내기)
		 // fw.write(cbuf, off(start index), len(length:길이)); 
			// fw,write(cbuf)를 사용하게 되면    >>>  경우에 따라서 원본보다 큰 데이터 용량을 전달 받을 수 있다 
			// => [배열의 공간에서 빈 공간을 다 한꺼번에 전달해버려서]
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
