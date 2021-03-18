package quiz02;

public class MainClass {

	public static void main(String[] args) {
		// Staff[ ] 로 만든다.

		// 월급쟁이  : SalaryMan
		SalaryMan staff1 = new SalaryMan("james", 300);
//		System.out.println(staff1.getName());
//		System.out.println(staff1.getPay());
		
		// 판매직 : SalesMan
		SalesMan staff2 = new SalesMan("alice", 100);
		staff2.setSalesAmount(2000); // 판매수당 (필수 : 꼭 적어주어야하는 메서드)
//		System.out.println(staff2.getName());
//		System.out.println(staff2.getPay());
		
		// 알바생
		Alba staff3 = new Alba("brown");
		staff3.setPayHour(1);
		staff3.setTimes(200);
//		System.out.println(staff3.getName());
//		System.out.println(staff3.getPay());
		
		
		
		// -----------------------------------------------------------
		
		// 회사
		Company company = new Company(10);
		company.hireStaff(staff1);  // upcasting 진행. => ( Staff staff = new SalaryMan() )으로 본다.
		company.hireStaff(staff2);
		company.hireStaff(staff3);
		// -
		company.staffInfo();
		// Staff IN info();
		// 	-SalayMan IN info();  -Alba IN info();
		// --SalesMan IN info();
		// ↓
		// 예시)
		// Staff s = new Alba(); 
		// s.info();  ==>  Alba IN info(); 를 찾아간다.
		
		
		
		
	}
}
