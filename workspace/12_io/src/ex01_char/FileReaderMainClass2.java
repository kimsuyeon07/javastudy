package ex01_char;

import java.io.FileReader;

public class FileReaderMainClass2 {

	public static void main(String[] args) {

		try (FileReader fr = new FileReader("text3.txt")) {
			
			
			while (true) {
				char[] cbuf = new char[5];
				int readCharCount = fr.read(cbuf); 
				// 읽은 내용은 cbuf에 저장되고, readcharCount에는 읽은 글자 수가 저장됩니다.
				// 파일의 끝에 도달하면 -1을 readCharCount에 반환합니다.
				
				// 무한반복문이 끝나는 break가 필요하다.
				if (readCharCount == -1) {
					break;
				}
				System.out.print(cbuf);
			}
			
			
		} catch (Exception e) { e.printStackTrace(); }
		
		
		/*
		 *  char[] cbuf = new char[5]  =>  인해서.
		 	
		 	안녕하세요    : cbuf 
		 	.\n반갑습   : cbuf
		 	니다.갑습    : cbuf  // 출력 형태
		 	**
		    < 이를 막기 위해(제대로 출력하기 위헤?) ==> while문 안에 char[]선언을 넣어야 한다. >
		 
		 
		 
		 */
		
		
		
		
		
		
		
		
	}
}
