package ex01_network;

import java.net.URL;

public class URLMainClass {

	public static void main(String[] args) {

		URL url1 = null;
		URL url2 = null;
		
		try {
			url1 = new URL("https://www.naver.com/webtoon/webtoon.rhn?query=java&page=3");
			System.out.println(url1.getHost());  // 호스트
			System.out.println(url1.getDefaultPort()); // 포트
			System.out.println(url1.getProtocol());    // 프로토콜 : https
			System.out.println(url1.getQuery());       // 쿼리       : query=java&page=3
			System.out.println(url1.getFile());        // 파일 경로: webtoon/webtoon.rhn?query=java&page=3
			
			url2 = new URL("https://www.naver.com/webtoon/webtoon.jsp");
			System.out.println(url2.getFile());
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
	}
}
