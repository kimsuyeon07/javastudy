package ex01_network;

import java.net.URL;

public class URLMainClass {

	public static void main(String[] args) {

		// URL : Uniform Resource Locator
		// import java.net(패키지)
		// 형식이 정해져 있는 자원의 표기방법
		// 프로토콜://호스트:포트?파라미터
		
		URL url1 = null;
		URL url2 = null;
		
		try {
			url1 = new URL("https://www.naver.com/webtoon/webtoon.rhn?query=java&page=3");  // "?" => 네이버쪽으로 데이터를 보내는 변수 값 (요청) <? 뒷부분의 문장>
			System.out.println(url1.getHost());          // Host     : www.naver.com
			System.out.println(url1.getDefaultPort());   //            443
			System.out.println(url1.getProtocol());      // Protocol : https 
			System.out.println(url1.getQuery());         //            query=java&page=3
			System.out.println(url1.getFile());          // 파일 경로     : /webtoon/webtoon.rhn?query=java&page=3
			
			url2 = new URL("https://www.naver.com/webtoon/webtoon.jsp");
			System.out.println(url2.getFile());          // 파일 경로     : /webtoon/webtoon.jsp
			
		} catch (Exception e) {
			e.printStackTrace();
		}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
 	}
}
