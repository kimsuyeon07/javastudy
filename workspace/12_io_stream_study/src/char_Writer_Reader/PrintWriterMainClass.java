package char_Writer_Reader;

import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterMainClass {

	public static void main(String[] args) {

		// FileWriter 클래스와 같은 목적으로 사용.
		// 지원되는 출력 메서드가 더 많음.
		// writer(), print(), println()
		
		
		PrintWriter out = null;
		
		try {
			out = new PrintWriter("index.html");
			out.println("<script>");
			out.println("alert('hello Java!");
			out.println("</script>");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (out != null) out.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
	}
}
