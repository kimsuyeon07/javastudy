package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	// method
	// 1. 결과타입 : Connection
	// 2. 메소드명 : getConnection
	// 3. 매개변수 : 없음
	// 4. 예외처리 : 2가지 발생 : ClassNotFoundException, SQLException
	
	
	// throws 의미
	// getConnection() 메서드에서는 예외처리를 하지 않고,
	// getConnection() 메서드를 호출하는 곳으로 예외를 던져서 처리하겠다.
	
//	public Connection getConnection() throws Exception { => 구체적으로 예외발생이 어떤것이 생길지 모르면 "Exception"
	// 클래스 메서드로 생성한다 : "static"을 붙여준다. : 클래스 이름으로 호출하겠다는 의미
	// : 이객체가 가지고 있는 값은 변하지 않을 것이다.
	// 호출 방법 : DBConnection.getConnection();
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");  // 오라클드라이버라는 클래스파일을 실행하겠다.
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "spring";
		String password = "1111";
		
		Connection con = DriverManager.getConnection(url, user, password);
		return con;
	}
	
	
	
	
	
	
	
	
	
	
	
}
