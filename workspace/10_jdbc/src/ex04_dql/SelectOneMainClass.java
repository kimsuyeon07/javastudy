package ex04_dql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;
import java.sql.Date;

import connection.DBConnection;

public class SelectOneMainClass {

	public static void main(String[] args) {

		// 검색결과가 1개 경우
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;  // SELECT문의 결과 행(Row)을 저장합니다.
		
		try {
			con = DBConnection.getConnection();
			String sql = "SELECT no, name, department, hireDate FROM staff WHERE no = 1";
			// PRIMARY KEY(UNIQUE) 칼럼을 조건식으로 사용하면 검색결과가 1개임을 보증할 수 있다.
			ps = con.prepareStatement(sql);
			
			// 실행 결과는 rs에서 나타난다.
			rs = ps.executeQuery(); // SELECT문의 실행은  excuteQuery() 메서드입니다.
			// rs에 저장된 데이터는 "반드시" next() 메서드를 호출해서 꺼냅니다. (그냥은 나오지 않는다.)
			// next()메서드 : 
			// 1. 결과 행에서 순서대로 한 행씩 꺼냅니다. 
			//    => : 검색결과가 여러 개일 경우 → next()메서드를 반복문 안에 넣어서 반복실행되게 한다.
			// 2. 꺼낼 결과 행이 존재하면 true를 반환하고, 엾으면 false를 반환한다.
			
			// rs = 테이블의 한 줄을 의미
			// 행 안의 특정 칼럼을 꺼낼때는 .get 메서드를 사용
			
			if (rs.next()) {  // true OR false
				
				int no = rs.getInt(1);  // OR rs.getInt("no");
				String name = rs.getString(2);  // OR rs.getString("name");
				String department = rs.getString(3);  // OR rs.getString("department");
				Date hireDate = rs.getDate(4);   // OR rs.getDate("hireDate"); // hireDate가 연산이 되는 날짜냐
				
				// <HashMap>으로 해보기
				Map<String, Object> staff = new HashMap<String, Object>();
				// key값 : 다른 이름으로 만드는것 안좋음. (칼럼의 이름으로 만들어라!)
				// 칼럼의 이름이 변수이름, key명 등으로 계속 사용해라
				staff.put("no", rs.getInt("no")); 
				staff.put("name", rs.getString("name"));
				staff.put("department", rs.getString("department"));
				staff.put("hireDate", rs.getDate("hireDate"));
				System.out.println("no=" + staff.get("no")+"name=" + staff.get("name")+"department=" + staff.get("department")+"hireDate=" + staff.get("hireDate"));
				
				
				
				
				System.out.println("no=" + no + ", name="+name+", department="+department+", hireDate="+hireDate);
				
				
			} else {
				System.out.println("해당 staff가 없습니다.");
			}
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) rs.close();  // 생성 역순으로 .close() 해준다.
				if (ps != null) ps.close();
				if (con != null) con.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
