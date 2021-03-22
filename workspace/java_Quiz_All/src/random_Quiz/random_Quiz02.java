package random_Quiz;

public class random_Quiz02 {

	public static void main(String[] args) {

		// 2. 윳놀이
		// '도' = 1칸 이동한다
		// '개' = 2칸 이동한다
		// '걸' = 3칸 이동한다
		// '윷', '개' = 4+2칸 이동한다
		// '모', '모', '도' = 5+5+1칸 이동한다
		
		
		String[] yut = {
				"도","개","걸","윷","모"
		}; //   [0] [1] [2] [3] [4]
		
		// 이동 횟수 : 초기화
		int move = 0;
		
		// 무한 반복문
		while (true) {
			// 랜덤으로 윷을 던진다. (인덱스 번호 지정) :출력까지
			int yutIdx = (int)(Math.random() * 5) +0; 
			System.out.print("\""+ yut[yutIdx] +"\"");
			
			// 칸 이동 : 인덱스번호 사용
			move += yutIdx+1;
			
			// 도,개,걸  끝낸다.
			if (yutIdx < 3) {
				System.out.println(", "+ move +"칸 이동한다.");
				break;
			} else {
				System.out.print(", ");
			}
		}
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
