package quiz01;

public class MainClass {

	public static void main(String[] args) {

		// 월급쟁이  : SalaryMan
		SalaryMan staff1 = new SalaryMan("james", 300);
		System.out.println(staff1.getName());
		System.out.println(staff1.getPay());
		
		// 판매직 : SalesMan
		SalesMan staff2 = new SalesMan("alice", 100);
		staff2.setSalesAmount(2000); // 판매수당 (필수 : 꼭 적어주어야하는 메서드)
		System.out.println(staff2.getName());
		System.out.println(staff2.getPay());
		
		// 알바생
		Alba staff3 = new Alba("brown");
		staff3.setPayHour(1);
		staff3.setTimes(200);
		System.out.println(staff3.getName());
		System.out.println(staff3.getPay());
		
		
		
		
		
		
	}
}
