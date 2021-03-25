package ex15_interface_extends;

public class MainClass {

	public static void main(String[] args) {

		
		// SmartPhone : extends Phone, implements Computable 받고 있는 상황.
		// -
		// sendCall() : in Phone클래스  ,	palyApp() : in Computable클래스 
		
		
		
		// 1. Phone타입의 SmartPhone
		Phone phone1 = new SmartPhone();
		phone1.sendCall();
		// .playApp() 호출 방법 : 캐스팅(casting)
		((Computable)phone1).playApp();
		
		// 2. Computable타입의 SmartPhone
		Computable phone2 = new SmartPhone();
		// .sendCall() 호출 방법 : 캐스팅(casting)
		((Phone)phone2).sendCall();
		phone2.playApp();
		
		// 3. SmartPhone타입의 SmartPhone
		SmartPhone phone3 = new SmartPhone();
		phone3.sendCall();
		phone3.playApp();
		
		
		
		
		
		
		
	}
}
