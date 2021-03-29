package ex02_byte;

// FileInputStream : (int) [한 글자]하나의 데이터를 4byte로 읽어들인다.
// 읽어내는 단위 : int, byte[]


import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamMainClass {

	public static void main(String[] args) {

		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("byte1.txt");
			
			while (true) {
				int b = fis.read();
				if (b == -1) { break; }
				System.out.print((char)b);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fis != null) { fis.close(); }
			} catch (Exception e) { e.printStackTrace(); }
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
