package ex02_byte;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// 빠른 속도 제공 위해서


public class BufferedOutputStreamMainClass {

	public static void main(String[] args) {
 
		
		try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("byte2.txt"))) {
			String str = "안녕하세요. 반갑습니다.";
			byte[] bytes = str.getBytes();
			bos.write(bytes);
		} catch (IOException e) {
			e.printStackTrace();
		}
		


		/* 입력 방법 : byte[]  and  int  */
		/* byte[] 안에 String타입의 문자열을 넣어주는 개념  */
		/* String타입을 byte타입으로 캐스팅 => .getBytes()사용  */
		/* .getBytes()사용법 : String타입의 변수명에  메서드 호출  */
		
		
		
		
		
		
		
		
		
		
		
	}
}
