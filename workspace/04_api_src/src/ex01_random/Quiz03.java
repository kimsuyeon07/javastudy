package ex01_random;

public class Quiz03 {

	public static void main(String[] args) {
 
		// 3. 윳놀이
		// '도' = 1칸 이동한다
		// '개' = 2칸 이동한다
		// '걸' = 3칸 이동한다
		// '윷', '개' = 4+2칸 이동한다
		// '모', '모', '도' = 5+5+1칸 이동한다
		
		
		// 윷놀이 배열
		String[] yut = {
				"도", "개", "걸", "윷", "모"
		};   //  [0]  [1]  [2]  [3]  [4]
		// 이동횟수
		int move = 0;
		
		// 반복문 :윷놀이
		while (true) {
			
			// 윷을 프로그램이 던진다.
			int idx = (int)(Math.random() * 5) + 0;
			System.out.print("\"" + yut[idx] + "\"");
			
			// 이동 횟수 (인덱스를 이동횟수로 보고 사용!)
			move += (idx + 1);
			
			
			// 도, 개, 걸은 끝냅니다.
			if(idx < 3) {
				System.out.print(", "+ move +"칸 이동한다.");
				break;
			} else {
				System.out.print(", ");
			}
			
		}
		
		
		
		
		
		
		
	}
}
