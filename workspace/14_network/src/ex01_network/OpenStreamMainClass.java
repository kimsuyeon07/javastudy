package ex01_network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class OpenStreamMainClass {

	public static void main(String[] args) {
 

		URL url = null;
		HttpURLConnection con = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		StringBuilder sb = new StringBuilder();

		
		// {웹 크롤링} 사용 이유 : 웹 상에서 필요한 내용을 긁어오기 위해서 사용. 
		try { 
			url = new URL("https://m.naver.com/");
			// 일반화
			con = (HttpURLConnection)url.openConnection();
			isr = new InputStreamReader(con.getInputStream());
			br = new BufferedReader(isr);  // 속도 향상 : Buffered
			
			while (true) {
				String line = br.readLine();
				// .readLine() : 한 줄씩 읽어들이는 것 >> 내용을 다 읽어들이면 null을 반환한다.
				if (line == null) {
					break;
				}
				sb.append(line).append("\n");
				
			} 
			System.out.println("글자 수 : " + sb.toString().length());
			
			// finally가 귀찮을 때
			// br.close();
			// con.disconnect();
			
		} catch (Exception e ) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null) br.close();
				if (con != null) con.disconnect();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
	}
}
