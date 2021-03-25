package dto;

import java.sql.Date;

public class StaffDto {

	// field
	private int no;
	private String name;
	private String department;
	private Date hireDate;

	// method : Getter and Setter
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	// method : toString() : Override
	@Override
	public String toString() {
		return "Staff2Dto [no=" + no + ", name=" + name + ", department=" + department + ", hireDate=" + hireDate + "]";
	}
	
	
	
	
	
	
	
}
