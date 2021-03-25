package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import dto.StaffDto;
import lombok.Data;

// DAO : Database Access Object
// DB의 CRUD를 처리하는 메서드를 포함하고 있습니다.


public class StaffDao {

	// field : 기본  null
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	private int result;
	private String sql;
	
	// constructor (singleton pattern)
	// 1. 하나의 StaffDao만 생성할 수 있습니다. (2개 이상의 Dao가 만들어질 수 없습니다.) : 동시성 문제때문에.
	
	// 2. 원리
	//	  1) 외부에서는 new StaffDao()가 불가능하도록 설계합니다. ==> private
	//	  2) 내부에서 new StaffDao()를 실행하고 생성된 1개의 인스턴스를 반환하는 메서드를 만듭니다.
	
	// 3. getInstance() 메서드 호출 방법
	//    1) 객체(인스턴스) 
	// 		 : private StaffDao(){} 때문에 객체 생성이 불가능합니다.
	//    2) 클래스 
	// 		 : static 처리를 해야합니다. (클래스 메소드로 바꿔야합니다)
	//         static 메서드는 static 필드만을 사용할 수 있습니다.
	

	private StaffDao() {}
	private static StaffDao staffDao = new StaffDao();  // new => run Time에 작업된다. (제일 마지막 과정에서 진행된다.)
	public static StaffDao getInstance() { // 외부에서 staffDao()를 전달할 수 있는 구멍을 뚫어두었다 (정도의 의미)
		return staffDao;
	}
	
	
	
	// method : 접속/접속해제/

	/***** 1. 접속  ******/ // throws 처리 : 접속 이후의 진행 순서의 메서드는 다 try문,예외처리/
	public Connection getConnection() throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "spring";
		String password = "1111";
		return DriverManager.getConnection(url, user, password);
	}
		
	/***** 2. 접속해제  ******/	
	public void close(Connection con, PreparedStatement ps, ResultSet rs) {
		try {
			if (rs != null) rs.close();
			if (ps != null) ps.close();
			if (con != null) con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	/***** 3. 가장 최근에 추가된 staff의 no 알아내기   ******/
	public int selectMaxNo() {
		int no = 0;
		try {
			con = getConnection();
			sql = "SELECT MAX(no) FROM staff";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			if (rs.next()) {
				no = rs.getInt(1);  // 가장 최근 칼럼의 no를 저장한다. 
			} 
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, ps, rs);
		}
		return no;
	}
				
	
	/***** 4. [INSERT] staff 추가하기   ******/
	// => StaffDto staffDto == int no, String name, String department, Date hireDate
	public int insertStaff(StaffDto staffDto) {  // 삽입하고자 하는 스텝의 정보는 받아올 것
		try {
			con = getConnection(); // 접속은 메서드마다 열고 닫는 것이 제일 좋습니다. // ↓ SYSDATE : (자동) 현재 날짜 데이터
			sql = "INSERT INTO staff (no, name, department, hireDate) VALUES (?, ?, ?, SYSDATE)";  
			ps = con.prepareStatement(sql);
			ps.setInt(1, staffDto.getNo());
			ps.setString(2, staffDto.getName());
			ps.setString(3, staffDto.getDepartment());
			result = ps.executeUpdate(); // excuteUpdate() : INSERT, UPDATE, DELETE 에서 사용합니다.
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, ps, null); // rs는 사용하지 않았기 때문에 'null'처리해줍니다.
		}
		return result;  // 삽입되면 result는 1, 실패하면 result는 0을 반환합니다.
	}
	
	
	/***** 5. [UPDATE] staff 수정하기   ******/
	public int updateStaff(StaffDto staffDto) {
		try {
			con = getConnection();
			sql = "UPDATE staff SET name = ?, department = ? WHERE no = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, staffDto.getName());
			ps.setString(2, staffDto.getDepartment());
			ps.setInt(3, staffDto.getNo());
			result = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally { close(con, ps, null); }
		return result;
	}
	
	
	/***** 6. [DELETE] staff 삭제하기   ******/
	public int deleteStaff(StaffDto staffDto) {
		try {
			con = getConnection();
			sql = "DELETE FROM staff WHERE no= ?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, staffDto.getNo());
			result = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {close(con, ps, null);}
		return result;
	}
	
	
	/***** 7. [SELECT] staff 조회하기   ******/
	public StaffDto selectOneByNo(int no) {

		StaffDto staffDto = null;
		try {
			con = getConnection();
			sql = "SELECT no, name, department, hireDate FROM staff WHERE no = ?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, no);
			rs = ps.executeQuery();  // executeQuery() : SELECT
			if (rs.next()) { // 내용이 추가됬는지 확인. 
				staffDto = new StaffDto();
				staffDto.setNo(rs.getInt(1));
				staffDto.setName(rs.getString(2));
				staffDto.setDepartment(rs.getString(3));
				staffDto.setHireDate(rs.getDate(4));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally { close(con, ps, rs); }
		return staffDto; // 경우에 따라서 null도 리턴받을 수 있다를 의미
	}
		
		
		
	/***** 8. [SELECT] staff 전체 조회하기   ******/
	public List<StaffDto> selectList() {
		List<StaffDto> staffList = new ArrayList<StaffDto>();
		try {
			con = getConnection();
			sql = "SELECT no, name, department, hireDate FROM staff";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) { // 전달받을 내용이 있는만큼 반복하겠다.
				StaffDto staffDto = new StaffDto();      
				staffDto.setNo(rs.getInt(1));             // rs.getInt("no")
				staffDto.setName(rs.getString(2));        // rs.getString("name")
				staffDto.setDepartment(rs.getString(3));  // rs.getString("department")
				staffDto.setHireDate(rs.getDate(4));      // rs.getDate("hireDate")
				// List인터페이스에 저장하겠다.
				staffList.add(staffDto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally { 
			close(con, ps, rs); 
		}
		return staffList;
	}
	
	
	
	
	
	
	
	
	
	
}
