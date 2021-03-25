package ex03_dml;

import java.sql.Connection;
import java.sql.PreparedStatement;

import connection.DBConnection;

public class InsertQuiz {

	public static void main(String[] args) {

		// 임의의 3명의 staff을 삽입하세요.
		// 반복문과 배열을 사용하세요.
		int[] noList = {3, 4, 5};
		String[] nameList = {"david", "james","jack"};
		String[] departList = {"총무","영업", "고객"};
		String[] hireDateList = { "21/03/08","21/03/15","21/03/20"};
		
		
		
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con = DBConnection.getConnection();
//			String sql = "INSERT INTO staff (no, name, department, hireDate) VALUES (?,?,?,?)";
			String sql = "INSERT INTO staff VALUES (?,?,?,?)";  // (칼럼) 생략 가능
			ps = con.prepareStatement(sql);

			int result = 0;
			for (int i = 0; i<noList.length ; i++) {
				ps.setInt(1, noList[i]);
				ps.setString(2, nameList[i]);
				ps.setString(3, departList[i]);
				ps.setString(4, hireDateList[i]);  // 배열의 타입을 맞춰주어야 한다.
				result += ps.executeUpdate(); // (정상 실행 시) result += 1; |  (실패 시) result += 0;
			}
			System.out.println("총 " + result + "명의 staff이 삽입되었습니다.");
			
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
