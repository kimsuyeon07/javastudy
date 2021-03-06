package ex07_override;

public class GogumaPizza extends Pizza {

	// field
	private String goguma;

	
	// constructor
	public GogumaPizza(String dough, int cheese, String goguma) {
		super(dough, cheese);
		this.goguma = goguma;
	}
	
	
	// method
	// 고구마 정보의 출력을 위해서 Pizza의 info()를 다시 만들어야 한다.
	// ↓
	@Override
	public void info() {
		System.out.println("원산지 :" + goguma);
		super.info();  
		// super : Pizza 를 의미한다.(슈퍼클래스를 찾아간다.)
		// super.메서드() : Pizza클래스 안에 있는 info() 메서드를 가지고 온다. (GogumaPizza의 수정된 info()정보가 아니라!)
	}     
	
	
	
}
