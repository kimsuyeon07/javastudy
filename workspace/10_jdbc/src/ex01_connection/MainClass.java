package ex01_connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class MainClass {

	public static void main(String[] args) {

		try {
			// 1. oracle.jdbc.driver.OracleDriver 클래스를 메모리에 올립니다.
			Class.forName("oracle.jdbc.driver.OracleDriver");  // 작성해둔 클래스가 없으면 오류. 
			// ClassNotFoundException 오류 발생 가능
			
			// 2. 접속 정보
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe"; // Oracle 11g Express Edition 용. 
			                            // : Express Edition => thin driver(가벼운 데이터베이스 라고 한다.)
										// 127.0.0.1(==localhost) : 각자의 ip 주소 : DB서버주소
										// 최종개발작업 단계에서 DB주소를 바꿔주는 방식
			String user = "spring"; //대소문자 구분 없음.
			String password = "1111";
			
			// 3. 접속
			// DriverManager 클래스가 접속을 담당하고, 
			// 접속 결과는 Connection 인터페이스에 저장합니다.
			Connection con = DriverManager.getConnection(url, user, password);  // SQLException 발생 가능
			
			// 4. 접속이 성공하면 여기로 도착
			System.out.println("DB에 접속되었습니다.");
			
			// 5. 접속 종료
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
			
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
