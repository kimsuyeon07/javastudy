package ex03_dml;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.time.Period;

import connection.DBConnection;

public class UpdateMainClass {

	public static void main(String[] args) {

		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			// 접속
			con = DBConnection.getConnection();
			// 쿼리문 작성
			String sql = "UPDATE staff SET department = ? WHERE no = ? ";
			//                                      "대입"        "같다 =="  <다른 의미로 사용된다.>
			// ↓ preparedStatement :
			// 데이터베이스(DBMS)에서 동일하거나 비슷한 데이터베이스 문을 높은 효율성으로 반복적으로 실행하기 위해 사용되는 기능
			ps = con.prepareStatement(sql);
			ps.setString(1, "영업");  // 첫번째 ? : String타입  내용 삽입.
			ps.setInt(2, 3);          // 두번째 ? : Int타입 내용삽입.
			// 
			int result = ps.executeUpdate();
			if (result == 0) {
				System.out.println("정보가 수정되지 않았습니다.");
			} else {
				System.out.println("정상적으로 정보가 수정되었습니다.");
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
