package quiz01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class MainClass {

	public static void main(String[] args) {

		// https://m.naver.com/ 의 소스코드를
		// C:\mnaver.html 파일로 저장하시오.

		
		URL url = null;
		HttpURLConnection con = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		StringBuilder sb = new StringBuilder();
		File file = null;
		
		
		try {
			
			// 네이버 모바일 페이지 소스코드 읽기
			url = new URL("https://m.naver.com/");
			con = (HttpURLConnection)url.openConnection();
			br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			// con.getInputStream() : 입력 통로
			// new InputStreamReader(con.getInputStream()) : 
			// ------------------------
			
			
			// 경로 지정 및 파일 생성, 파일에 데이터 보내기
			file = new File ("C://mnaver.html");
			bw = new BufferedWriter(new FileWriter(file));
			// ---------------
			
			
			// 소스코드를 line변수에 저장 
			String line = null;
			while ((line = br.readLine()) != null) {
				// mnaver.html파일에 소스코드 저장.
				bw.write(line + "\n");
			}
			// --------------------
			System.out.println(file.getAbsolutePath() + " 파일이 생성되었습니다.");
			// --------------------
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null) br.close();
				if (con != null) con.disconnect();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		// 파일이 존재하지 않다면 >> 파일 생성
		
		// https://m.naver.com/의 소스 {웹 크롤링}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
