package ex03_dml;

//import java.sql.Connection;
//import java.sql.PreparedStatement;
import java.sql.*;  // => java.sql 패키지에 있는 모든  클래스를 import합니다.

import connection.DBConnection;

public class InsertMainClass {

	public static void main(String[] args) {

		
		Connection con = null;
		PreparedStatement ps = null;
		
		// CREATE TABLE staff (... 가 실행 된 후 실행.
		try {
			con = DBConnection.getConnection();
			String sql = "INSERT INTO staff (no, name, department, hireDate) VALUES (1, 'alice', '총무', '21/03/22')";
			// no : PRIMARY KEY ( : Not Null + Unique) 'Unique'떄문에 최초 실행은 되지만 중복으로 실행은 되지 않는다.
			ps = con.prepareStatement(sql);
			// 실행
			int result = ps.executeUpdate();
			// executeUpdate() 메서드 반환 값
			// 변화가 생긴 행(Row)의 개수가 반환됩니다.
			// 실패하면 값은 '0'이 반환되고, 성공하면 INSERT(삽입)된 행(Row)의 개수가 반환됩니다.
			if (result == 0) {
				System.out.println("행이 추가되지 않았습니다.");
			} else {
				System.out.println("정상적으로 행이 추가되었습니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			try {
				if (ps != null) ps.close();
				if (con != null) con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
