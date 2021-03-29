package quiz01;
 
import java.io.DataOutputStream; 
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

// 사용자로부터 국, 영, 수 점수를 입력받은 뒤,
// int[] 배열에 저장
// score.dat 파일에 이름, 입력받은 점수, 평균을 저장하시오.
// MainClass2 => score.dat 파일을 읽어서 저장을 확인하시오.

public class MainClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String[] subject = {"국어","영어","수학"};
		int[] scores = new int[subject.length];
		
		// 학생 이름 입력
		System.out.print("학생 이름을 입력하세요 >>> ");
		String name = sc.next();
		
		// 성적 입력
		// 평균 구하기 : 점수의 총 합산
		int total = 0;
		double ave = 0;
		for (int i = 0 ; i<subject.length ; i++) {
			System.out.print(subject[i] + "의 점수를 입력하세요  >>> ");
			scores[i] = sc.nextInt();
			total += scores[i];
		}
		ave = total / (double)subject.length ;
			
		
		// score.dat파일 생성 및 저장
		DataOutputStream dos = null;
		try {
			dos = new DataOutputStream(new FileOutputStream("score.dat"));
			dos.writeUTF(name);
			for (int score : scores) {
				dos.writeInt(score);
			}
			dos.writeDouble(ave);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (dos != null) { dos.close(); }
			} catch (Exception e) {e.printStackTrace();}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
