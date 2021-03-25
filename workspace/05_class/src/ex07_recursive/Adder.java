package ex07_recursive;

public class Adder {
	
	private int total;  // 초기화 : 0 <알아서 되어있음>

	// method
	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
	
	// calculate 메서드
	public void calculate(int n) {
		
		if (n == 0) {
			return; // : 메서드 종료 { 결과타입이 void인 경우에만, " return; " 을 사용 }
		}
		total += n;
		calculate(n-1);
	}

	
			
		
	
	

}
