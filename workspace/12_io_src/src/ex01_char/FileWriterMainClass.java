package ex01_char;

import java.io.FileWriter;
import java.io.IOException;

/*
 	FileWriter 클래스 : 출력 스트림의 일종
 	1. "문자 기반 + 출력 스트림" 입니다 : Writer
 	2. 	문자를 보낼 때 사용합니다.
 		1) 통신 : 상대방에게 문자를 보낼 때
 		2) 파일 : 텍스트 파일을 만들 때
 	3. 	출력 메서드
 		write()
 	4.	출력단위
 		char[], String, int
 	5.	예외처리가 필요합니다. (throws)
 */

public class FileWriterMainClass {

	public static void main(String[] args) {

		// Stream 처리할 때는 반드시 "예외처리" 필수
		FileWriter fw = null;
		try {
			// 파일 생성
			fw = new FileWriter("text1.txt"); // text1.txt 파일이 생성됩니다.
			// text1.txt 파일로 전송할 데이터
			char[] cbuf = {'H','e','l','l','o' };
			String str = " Java";
			int ch = '!';
			String str2 = "Nice to meet you!";
			// text1.txt 파일로 데이터 전송하기
			fw.write(cbuf);
			fw.write(str);
			fw.write(ch);
			fw.write('\n');  // write()메서드는 줄바꿈을 직접 해줘야 한다.
			fw.write(str2);
			System.out.println("text1.txt 파일이 생성되었습니다.");
		  // 예외처리 : catch문
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fw != null) { fw.close(); }
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
