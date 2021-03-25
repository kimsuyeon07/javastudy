package ex02_ddl;

import java.sql.Connection;
import java.sql.PreparedStatement;

import connection.DBConnection;

public class DropTableMainClass {

	public static void main(String[] args) {

		// try{} 블록과 finally {} 블록에서 모두 사용하기 위해서 main()메서드(try 바깥)에 선언한다.
		Connection con = null;
		PreparedStatement ps = null;
		// try안에서 Connection을 선언하게 되면 try에서만 사용할 수 있기 때문에
		// "finally"에서 con.close()를 해주기 위해서 밖에서 선언하는 것이 좋다.
		try {
			con = DBConnection.getConnection();
			String sql = "DROP TABLE staff";
			
			ps = con.prepareStatement(sql);
			ps.executeUpdate();
			System.out.println("staff 테이블이 삭제되었습니다.");
			
			// ps.close();   // 현재 위치는 추천하지 않는다.
			// con.close();  // try을 실행하던 catch영역으로 넘어가든 해줘야하는 코드.
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {  // finally에도 try문이 필요하다.
			
			try {
				if (ps != null) ps.close();   // 또한 예외처리가 필요하다. < con, ps 변수가 예외처리가 필요하기 때문에 >
				if (con != null) con.close(); // NullPointerException이 발생하지 않도록
                                              // (접속에서 오류가 나면 'ps = null' 이기 때문에)
					
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
