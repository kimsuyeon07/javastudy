package ex01_network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WebCrawling {

	public static void main(String[] args) {

		// https://www.daum.net/
		URL url = null;
		HttpURLConnection con = null;
		BufferedReader br = null;  // 읽어들인다.
		BufferedWriter bw = null;  // 읽어 들인 내용을 작성? 내용 삽입? 정도의미
		
		try {
			
			url = new URL("https://www.daum.net/");
			con = (HttpURLConnection)url.openConnection();
			br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			
			String line = null;
			while ((line = br.readLine()) != null ) {
				// line : <a href = " ........  </a>
				// 이와 같이  class = "link_favorsch" 만 포함된 line이 필요하다.
				if (line.contains("link_favorsch @")) {
//					System.out.println(line);
//					String[] temps = line.split(">");
//					System.out.println(temps[1]);
					// line.split(">")[1] : 윤세아 출연확정</a
					// line.split(">")[1].split("<") : {"윤세아 출연확정", "/a" }
					// * line.split(">")[1].split("<")[0] : "윤세아 출연확정"
					// ↓↓↓
					System.out.println(line.split(">")[1].split("<")[0]);
					
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try { if (br != null) br.close(); if (con != null) con.disconnect(); } 
			catch (Exception e) { e.printStackTrace(); }
		}
		
		
		
		
		
		
		
		
		
	}
}
