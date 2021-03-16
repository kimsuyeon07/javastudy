package ex02_string;

public class Quiz03 {

	public static void main(String[] args) {
 
		// 3. 파일명과 확장자명을 분리하기
		
		String fullname = "2021-03-10.jpg";
		
		// "." 가 있는 인덱스 번호 : lastIndexOf(".") 
		int conma = fullname.lastIndexOf(".");
		
		String filename = fullname.substring(0, conma); //"2021-03-10"
		String extname = fullname.substring(conma+1);  //"jpg"
		
		System.out.println("파일명 : " + filename);
		System.out.println("확장자명 : " + extname);
		
		
		
		
		
	}
}
