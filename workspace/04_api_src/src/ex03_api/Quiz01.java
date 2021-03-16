package ex03_api;

public class Quiz01 {

	public static void main(String[] args) {
 
		// 1. String과 StringBuilder의 성능 비교
		// 1) 1 ~ 100,000을 모두 연결합니다. (12345678910111213141516 ... 100000)
		// 2) 각 클래스별로 연결에 소요된 시간을 ns(나노초)단위로 출력합니다.
		
		String str = "";
		
		long start1 = System.nanoTime();
		
		for(int n = 1; n<=100000; n++) {
			str += n;
		}
		
		long end1 = System.nanoTime();
		
		System.out.println("String 경과 시간 : " + (end1 - start1) + "ns");
		System.out.println("String 경과 시간 : " + (end1 - start1)/1000000000.0 + "ns");
		
		
		// ----------------------------------
		
		StringBuffer sb = new StringBuffer();  // 비워있어도 된다.
		
		long start2 = System.nanoTime();
		
		for(int n = 1 ; n <= 100000 ; n++) {
			sb.append(n);
		}
		
		long end2 = System.nanoTime();
		
		System.out.println("StringBuffer 경과 시간 : " + (end2 - start2) + "ns");
		System.out.println("StringBuffer 경과 시간 : " + (end2 - start2)/1000000000.0 + "ns");
		
		
		
		
		
		
		
		
		
		
	}
}
