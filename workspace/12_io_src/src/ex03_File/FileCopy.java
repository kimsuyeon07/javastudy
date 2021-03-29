package ex03_File;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {
 
		// 원본 Windmill.mp4
		// FileInputStream을 통해서 읽습니다.
		// 속도를 높이기 위해서 BufferedInputStream을 사용합니다.
		
//		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		// 복사본 C:\\MyTemp\\Windmill.mp4
		// 경로 지정을 위해서 File 클래스를 사용하고,
		// FileOutputStream을 통해서 만듭니다.
		File cpy = new File("C:\\MyTemp", "Windmill.mp4");
		
		// 속도를 높이기 위해서 BufferedOutputStream을 사용합니다.
//		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		
		// 속도를 높이기 위해서 BufferedInputStream을 사용합니다.
		try {
			
//			fis = new FileInputStream("Windmill.mp4"); // 현재 디렉터리의 Windmill.mp4
//			fos = new FileOutputStream(cpy); // C:\\MyTemp 디렉터리의 Windmill.mp4
			
			bis = new BufferedInputStream(new FileInputStream("Windmill.mp4"));
			bos = new BufferedOutputStream(new FileOutputStream(cpy));
			
			
			// 복사 시작 시간
			long start = System.currentTimeMillis();
			byte[] b = new byte[1241];
			int length = 0; // (읽어들인 byte의 수) : 현재는초기화상태
			while ( (length = bis.read(b)) != -1 ) {
				bos.write(b, 0, length);  // 실제로 읽어들인 길이만큼.
			}  // 복사 끝 -
			long end = System.currentTimeMillis();
			
			System.out.println(cpy.getAbsolutePath() + "파일이 복사되었습니다.");
			System.out.println("복사 소요시간 : " + ((end - start) *0.001) + "초");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bos != null) bos.close();
				if (bis != null) bis.close();
			} catch (Exception e) {
				e.printStackTrace();
			} 
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
