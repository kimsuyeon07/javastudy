package ex01_char;


import java.io.FileReader;

// FileReader  >>>   FileWriter의 반대역할.
/*
 * FileReader 클래스
 * 1. "문자 기반 + 입력 스트림" 입니다.
 * 2. 문자를 읽을 때 사용합니다.
 *    1) 통신 : 상대방이 보낸 문자를 받을 때
 *    2) 파일 : 텍스트 파일을 읽을 떼
 * 3. 입력 메서드
 * 	  read()
 * 4. 입력단위
 *    char[], int
 * 5. 예외 처리가 필요합니다.
 */


public class FileReaderMainClass {

	public static void main(String[] args) {

		try (FileReader fr = new FileReader("text1.txt")) {
			// read() 메서드 이용해서 읽기 => 정수로 나타낸다 <글자수로 지정>
			// : 완성된 텍스트 파일을 읽어들일 때 사용.
			
			// 1. 방법 
			/*
			// 파일 전체를 읽어들이는 코드 (무한 반복문 사용)
			while (true) {
				int ch = fr.read();  //  ch = 읽은 문자 또는 -1이 저장됩니다. (-1 : 모두 읽었을 때.)
				if (ch == -1) {
					break;
				}
				System.out.print((char)ch);  // 읽은 문자 보여주기
				// ch는 정수타입 => 문자의 코드값이 보여진다.
				// ==> 그래서. 캐스팅처리 해줘야 한다.
			}
			*/
			
			// 2. 방법 : 내용은 같다.
			int ch = 0;
			while ((ch = fr.read()) != -1) {
				System.out.print((char)ch);
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
