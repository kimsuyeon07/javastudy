package char_Writer_Reader;

import java.io.FileWriter;

public class FileWriterMainClass {

	public static void main(String[] args) {

		FileWriter fw = null;
		
		try {
			fw = new FileWriter("text1.txt");
			char[] cbuf = {'h','e','l','l','o'};
			String str = "Java";
			int ch = '!';
			String str2 = "Nice to meet you!";
			
			
//			fw.write(cbuf);
			fw.write(cbuf, 0, 1); // 0번 인덱스 ~ 1개보내라.
			fw.write(cbuf, 0, cbuf.length);
			fw.write(str);
			fw.write(ch);
			fw.write('\n');
			fw.write(str2);
			System.out.println("text1.txt 파일이 생성되었습니다.");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (fw != null) fw.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
	}
}
