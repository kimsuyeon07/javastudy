package ex01_network;

import java.net.URL;
import java.net.URLConnection;

public class RULConnectionMainClass {

	public static void main(String[] args) {

		// Connection 만든다. 정도의 의미
		URL url = null;
		URLConnection con = null;
		
		try {
			url = new URL("https://www.naver.com");
			con = url.openConnection();
			System.out.println(con.getContent());
			System.out.println(con.getURL());         // https://www.naver.com
			System.out.println(con.getContentType()); // 외우는게 좋다. // 컨텍트타입 : text/html; charset=UTF-8
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

		
	}
}
