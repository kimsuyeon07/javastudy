package connection;

import java.sql.Connection;

public class TestMainClass {

	public static void main(String[] args) {

		// 접속 테스트
		// DBConnection 클래스의 getConnection() 메서드를 호출합니다.
		// getConnection() throws Exeception 이므로 try - catch 처리합니다.
		
		// try{ } catch (Exception e) {} ;
		
		try {
			// Connection은 new를 하지 않는게 좋다. : new를 하겠다는 것은 여러개를 만들겠다는 의미.
			/*
			DBConnection connection = new DBConnection(); => 인스턴스변수 connection을 생성
			Connection con = connection.getConnection();  => 인스턴스변수를 통해서 getConnection()메서드를 호출하는 방법
			*/
			// ====== 클래스 메서드 getConnection() ======
			// 클래스 메서드 처리는 static으로 합니다  : 이객체가 가지고 있는 값은 변하지 않을 것이다.
			// 클래스 이름으로 호출해서 사용한다.
			
			Connection con = DBConnection.getConnection();
			
			System.out.println("DB에 접속되었습니다.");
			con.close();
			System.out.println("DB접속이 해제되었습니다.");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
