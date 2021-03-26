package quiz02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// Download

public class FileCopyProgram {

	public static void main(String[] args) {

		// Buffered를 사용하는 방식 : 속도가 빨라서 이를 사용하는 것이 좋다!
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		BufferedInputStream bis = null;
		
		try {
			
			bis = new BufferedInputStream(new FileInputStream("Windmill.mp4"));   // 원본
			bos = new BufferedOutputStream(new FileOutputStream("Windmill.mp4")); // 복사본
			byte[] b = new byte[1024];  // 1024 : 1KB
			while (true) {
				int readByte = fis.read(b); //영상 저장은 b, 실제 읽은 바이트 수는 readByte
				if (readByte == -1) { break;}
				fos.write(b, 0, readByte);  // b배열의 전체 배열을 읽어들일 필요가 없다. => 
			}
			System.out.println("Windmill.mp4 파일이 복사되었습니다.");
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fos != null) {fos.close();}
				if (fis != null) {fis.close();}
			} catch (Exception e) {e.printStackTrace();}
		} 
		
		
		
		// 1. 기본 코드
		/*
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			
			fis = new FileInputStream("Windmill.mp4");   // 원본
			fos = new FileOutputStream("Windmill2.mp4"); // 복사본
			byte[] b = new byte[1024];  // 1024 : 1KB
			while (true) {
				int readByte = fis.read(b); //영상 저장은 b, 실제 읽은 바이트 수는 readByte
				if (readByte == -1) { break;}
				fos.write(b, 0, readByte);  // b배열의 전체 배열을 읽어들일 필요가 없다. => 
			}
			System.out.println("Windmill.mp4 파일이 복사되었습니다.");
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fos != null) {fos.close();}
				if (fis != null) {fis.close();}
			} catch (Exception e) {e.printStackTrace();}
		} 
		 */
		
		
	}
}
