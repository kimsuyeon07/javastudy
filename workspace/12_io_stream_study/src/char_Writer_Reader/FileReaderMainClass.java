package char_Writer_Reader;

import java.io.FileReader;

public class FileReaderMainClass {

	public static void main(String[] args) {

		try (FileReader fr = new FileReader("text1.txt")){
			
//			int ch = 0;
//			while ( (ch = fr.read()) != -1 ) {
//				System.out.print((char)ch);
//			}
			
			
			while (true) {
				char[] cbuf = new char[10];
				int readCharCount = fr.read(cbuf);
				
				if (readCharCount == -1) {
					break;
				}
				System.out.println(cbuf);
			}
				
			
			
			
			
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
	}
}
