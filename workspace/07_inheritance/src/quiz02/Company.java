package quiz02;

public class Company {

	// field
	private Staff[] staffList;
	private int idx;
	
	// constructor
	public Company(int staffCount) {
		staffList = new Staff[staffCount];  // staffList배열의 길이 지정
	}
	
	// method : hireStaff()
	public void hireStaff(Staff staff) {
		if (idx == staffList.length) {
			System.out.println("직원을 모두 고용했습니다.");
			return;
		}
		staffList[idx++] = staff;
	}
			
	// method : staffInfo()
	public void staffInfo() {
		for (Staff staff : staffList) {
			if(staff != null ) {
				staff.info();
			} //if문 종료
		} //for문 종료
	} //staffInfo() 메서드 종료
	
	
	
	
	
}
