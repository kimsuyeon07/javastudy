package ex05_synchronized;

// critical section
// 1. 임계 영역
// 2. 공유 자원을 관리하기 위해서 한 번에 한 스레드의 접근만 허용합니다.
//    => " thread safe 하다 "
// 3. synchronized 키워드로 추가합니다.
//    : 변수나 메서드 모두 사용할 수 있다.

public class Dyson {

	// synchronized
	// 한 스레드만 floorCleaning()나 homeCleaning()에 접근 할 수 있다.
	// 동시 접근이 안된다.
	// ↓
	
	
	// method : 1번째
	public synchronized void floorCleaning() {
		try {
			System.out.println("바닥 청소를 하고 있다.");
			Thread.sleep(1000);// 1000밀리초(1초) 일시중지 : 1초의 바닥청소 시간을 주었다.
			notify();  // 다른 스레드에게 floorClening()메소드가 끝났음을 '알린다'. (실행을 넘겨준다)
			           // => 한번 실행 후에 주도권을 다른 사람에게 준다.
			wait();    // (실행을 넘겨주고 ) 자기는 기다린다. : 다른 스레드가 ( notify() ) 알려줄 때까지  기다린다.
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
			

	// method : 2번째
	public synchronized void homeCleaning() {
		try {
			System.out.println("집안을 청소하고 있다.");
			Thread.sleep(1000);
			notify();
			wait();
		} catch (Exception e) {
			e.printStackTrace();
		}
			
	}
	
			
	
	
	
	
	
}
