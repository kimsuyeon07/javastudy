package quiz03;

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
			
	// method : staffInfo() : 회사 직원들 개인마다의 정보
	public void staffInfo() {
		for (Staff staff : staffList) {
			if(staff != null ) {
				staff.info();
			} //if문 종료
		} //for문 종료
		System.out.println("SalaryMan의 급여총액 : " + getSalaryManTotalPay());
	} //staffInfo() 메서드 종료
	
	
	
	
	// SalaryMan들에게 지급된 급여총액
	public int getSalaryManTotalPay() {
		// Staff[ ] staffList; => 직원명단 : 저장된 객체들이 SalaryMan인지 검사해봐야 한다.
		int salaryManTotalPay = 0;
		for(Staff staff : staffList) {
			if (staff instanceof SalaryMan) {  // SalaryMan클래스에 SalesMan클래스가 포함되어있기 때문에
				if (!(staff instanceof SalesMan)) {  // 자식클래스를 분리하는 것이 필요.
					salaryManTotalPay += ((SalaryMan) staff).getPay();
				} // 내부  2번째 if문 종료
			}// 내부 1번째 if문 종료
		} //for문 종료
		return salaryManTotalPay;
	} // getSalaryManTotalPay() 메서드 종료
					
	
	
	
	
}
