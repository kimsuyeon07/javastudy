package ex03_join;

// 해당 코드를 Thread로 바꾸게되면,
// 계산 값이 많아지게 되면 => 

public class Calculator extends Thread{

	// field
	private int result;
	private int from;
	private int to;
	
	
	// run() : 매개변수를 생성할 수 없다. 
	// ** 호출만 실행 (가능) **
	@Override
	public void run() {
		addition();
	}


	// method
	public void addition() {
		//from부터 to까지 모든 정수 더해서 result에 저장
		if(from > to) {  // 숫자 교환 (코드가 실행될 수 있도록)
			int temp = from;
			from = to;
			to = temp;
		}
		for (int n = from; n <= to; n++) {
			result += n;
		}
	}


	// Getter and Setter
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	public int getFrom() {
		return from;
	}
	public void setFrom(int from) {
		this.from = from;
	}
	public int getTo() {
		return to;
	}
	public void setTo(int to) {
		this.to = to;
	}
	




	
	
}
