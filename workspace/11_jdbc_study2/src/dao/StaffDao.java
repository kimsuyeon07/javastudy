package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import dto.StaffDto;

public class StaffDao {

	// field
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	private int result;
	private String sql;
	
	// constructor
	private StaffDao () {}
	private static StaffDao staffDao = new StaffDao();
	public static StaffDao getInstance() {
		return staffDao;
	}
	
	
	// 접속 : getConnection()
	public Connection getConnection() throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "spring";
		String password = "1111";
		return DriverManager.getConnection(url, user, password);
	}
	
	// 접속해제 : close()
	public void close(Connection con, PreparedStatement ps, ResultSet rs) {
		try {
			if (rs != null) rs.close();
			if (ps != null) ps.close();
			if (con != null) con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	// selectMaxNo()
	public int selectMaxNo() {
		int no = 0;
		try {
			con = getConnection() ;
			sql = "SELECT MAX(no) FROM staff";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			if (rs.next()) {
				no = rs.getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, ps, rs);
		}
		return no;
		
	}
	
	
	// insertStaff() : int
	public int insertStaff(StaffDto staffDto) {
		try {
			con = getConnection();
			sql = "INSERT INTO staff (no, name, department, hireDate) VALUES (?,?,?,SYSDATE)";
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
	
	
	// updateStaff()
	public int updateStaff(StaffDto staffDto) {
		try {
			con = getConnection() ;
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
	
	// deleteStaff()
	public int deleteStaff(StaffDto staffDto) {
		try {
			con = getConnection();
			sql = "DELETE FROM staff WHERE no=?";
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
	
	
	// selectOneByNo()
	public StaffDto selectOneByNo(int no) {
		StaffDto staffDto = null;
		try {
			con = getConnection() ;
			sql = "SELECT no, name, department, hireDate FROM staff WHERE no =?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, no);
			
			rs = ps.executeQuery();
			if (rs.next()) {
				staffDto = new StaffDto();
				staffDto.setNo(rs.getInt(1));
				staffDto.setName(rs.getString(2));
				staffDto.setDepartment(rs.getString(3));
				staffDto.setHireDate(rs.getDate(4));
			}
		} catch (Exception e) {
			 e.printStackTrace();
		} finally {
			close(con, ps, rs);
		}
		return staffDto;
	}
	
	
	// selectList()
	public List<StaffDto> selectList() {
		List<StaffDto> staffList = new ArrayList<StaffDto>();
		try {
			con = getConnection() ;
			sql = "SELECT no, name, department, hireDate FROM staff";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				StaffDto staffDto = new StaffDto();
				staffDto.setNo(rs.getInt(1));
				staffDto.setName(rs.getString(2));
				staffDto.setDepartment(rs.getString(3));
				staffDto.setHireDate(rs.getDate(4));
				
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
