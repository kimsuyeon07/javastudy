package ex07_exception_class;

@SuppressWarnings("serial")  // DepositException(마우스 가져다 대고) Add @sup.. (클릭)
public class DepositException extends Exception {

	
	private int errorCode;
	
	
	public DepositException(String message, int errorCode) {
		super(message);
		this.errorCode = errorCode;
	}


	public int getErrorCode() {
		return errorCode;
	}


	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	
	
	
	
	
	
	
	
	
	
	
}
