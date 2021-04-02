package char_Writer_Reader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter_ReaderMainClass {

	public static void main(String[] args) {

		BufferedWriter bw = null;
		
		
		// Writer
		try {
			bw = new BufferedWriter(new FileWriter("text2.txt"));
			bw.write("안녕하세요. \n");
			bw.write("반갑습니다.");
			
			
		} catch (IOException e) {
			 e.printStackTrace();
		}  finally {
			try {
				if (bw != null) bw.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
		// Reader
		try (BufferedReader br = new BufferedReader(new FileReader("text2.txt"))) {

			
			StringBuilder sb = new StringBuilder();
			char[] cbuf = new char[5];
			
			int readCharCount = 0;
			while( (readCharCount = br.read(cbuf) ) != -1 ) {
				sb.append(cbuf, 0, readCharCount);
			}
			System.out.println(sb.toString());
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		
		
		
		
		
		
		
		
	}
}
