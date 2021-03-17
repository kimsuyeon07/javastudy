package ex03_api;

public class Ex01_System {

	public static void main(String[] args) {
 
		// System 클래스
		
		// 1. 시스템 종료
		// System.exit(0);
		
		// 2. 현재 시간(타임 스탬프) 알아내기
		// timestaem : 1970-01-01 0:00:00 부터 현재까지 경과한 시간 의미 (단위 밀리초)
		long timesteam = System.currentTimeMillis();
		System.out.println(timesteam);
		
		// 3. 현재 시간 알아내기
		// 자바가 마음대로 결정한 기준일로 부터 경과한 시간 (단위 : 나노초)
		// 경과된 시간을 측정하는 용도 (2개를 써서 차이를 보여주고자 하는 목적으로 사용된다.)
		long something = System.nanoTime();
		System.out.println(something);
		
		// 4. 배열 복사 하기
		int[] a = { 1, 2, 3,4, 5};
		int [] b = new int[10];
		
		System.arraycopy(a, 0, b, 0, a.length);
//		System.arraycopy(src, srcPos, dest, destPos, length);
		// a[0]에서 b[0]로 복사한다.
		// a.length만큼 복사 작업을 반복수행한다. : a.length = 5번 복사를 진행해라.
		for (int i = 0; i<b.length ; i++) {
			System.out.print(b[i] + " ");
		}
		
		
		
		
		
		
		
		
		
	}
}
