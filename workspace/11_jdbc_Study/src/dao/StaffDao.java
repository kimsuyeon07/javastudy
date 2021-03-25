package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import dto.StaffDto;

public class StaffDao {

	// DAO : Database Access Object : 데이터베이스와 직접 통신하는 영역
	
	// field
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	private int result;
	private String sql;
	
	// constructor : 디폴트 생성자 : static 처리
	// (생성자는 내부에서만 호출할 수 있도록 private 처리)
	private StaffDao() {}
	private static StaffDao staffDao = new StaffDao();
	public static StaffDao getInstance() {
		return staffDao;
	}
	
	// method : getConnection() : 접속
	public Connection getConnection() throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "spring";
		String password = "1111";
		return DriverManager.getConnection(url, user, password);
	}
	
	// method : close() : 접속해제
	public void close(Connection con, PreparedStatement ps, ResultSet rs) {
		try {
			if(rs != null) rs.close();
			if(ps != null) ps.close();
			if(con != null) con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// method : 가장 최근에 추가된 staff의 no 구하기
	public int selectMaxNo() {
		int no = 0;
		try {
			con = getConnection();
			sql = "SELECT MAX(no) FROM staff";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			if (rs.next()) {
				no = rs.getInt(1);  // rs.getInt("no");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally { close(con, ps, rs); }
		return no;
	}
	
	// ============ [INSERT] staff 추가하기 ============== //
	public int insertStaff(StaffDto staffDto) {
		try {
			con = getConnection();
			sql = "INSERT INTO staff (no, name, department, hireDate) VALUES (?, ?, ?, SYSDATE)";
			ps = con.prepareStatement(sql);
			ps.setInt(1, staffDto.getNo());
			ps.setString(2, staffDto.getName());
			ps.setString(3, staffDto.getDepartment());
			result = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, ps, null);
		}
		return result;
	}
	
	
	// ============ [UPDATE] staff 수정하기 ============== //
	public int updateStaff(StaffDto staffDto) {
		try {
			con = getConnection();
			sql = "UPDATE staff SET name=?, department=? WHERE no=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, staffDto.getName());
			ps.setString(2, staffDto.getDepartment());
			ps.setInt(3, staffDto.getNo());
			result = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, ps, null);
		}
		return result;
	}
	
	
	
	// ============ [DELETE] staff 삭제하기 ============== //
	public int deleteStaff(StaffDto staffDto) {
		try {
			con = getConnection();
			sql = "DELETE FROM staff  WHERE no=?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, staffDto.getNo());
			result = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, ps, null);
		} 
		return result;
	}
	
	
	
	// ============ [SELECT] staff 검색 조회하기 ============== //
	public StaffDto selectOneByNo(int no) {
		StaffDto staffDto = null;
		try {
			con = getConnection();
			sql = "SELECT no, name, department, hireDate FROM staff WHTER no=?";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			if (rs.next()) {
				staffDto = new StaffDto();
				staffDto.setNo(rs.getInt(1));
				staffDto.setName(rs.getString(2));
				staffDto.setDepartment(rs.getString(3));
				staffDto.setHireDate(rs.getDate(4));
			}
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, ps, rs);
		}
		return staffDto;
	}
	
	
	
	// ============ [INSERT] staff 추가하기 ============== //
	
	
	
	
	
	
	
	
	
	
}
