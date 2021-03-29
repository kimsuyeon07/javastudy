package ex02_byte;


import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// DataOutputStream 클래스
// 1. 자바의 데이터 타입 그대로 출력하는 클래스입니다.
// 2. 출력 메서드
//    writeByte(), writeInt(), writeLong(), writeDouble() 등 : 타입별로 처리할 수 있습니다.

//dat파일 => 메모장처럼 읽을 용도로 사용되지 않는다.
//dat파일은 읽어내는 방법 알아두어야한다. : 여는 방법이 따로 존재.


public class DataOutputStreamMainClass {

	public static void main(String[] args) {

		DataOutputStream dos = null;
		
		try {
			dos = new DataOutputStream(new FileOutputStream("byte3.dat"));
			int age = 44;
			double weight = 70.5;
			String name = "민경태";
			
			dos.writeInt(age);
			dos.writeDouble(weight);
			dos.writeUTF(name);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (dos != null) { dos.close(); }
			} catch (Exception e) { e.printStackTrace(); }
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
