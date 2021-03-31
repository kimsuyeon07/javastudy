package ex03_socket;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class ClientMainClass {

	public static void main(String[] args) {

		Socket client = null;
		Scanner sc = null;
//		OutputStream os = null;
		BufferedOutputStream bos = null;
		BufferedInputStream bis = null;
		
		try {
			
			// 1. 서버에 접속하기
			// 클라이언트 생성
			client = new Socket(); 
			// -
			// 클라이언트 서버 접속 : connect
			client.connect(new InetSocketAddress("localhost", 4966)); 
//			client.connect(endpoint);
//			client.connect(new InetSocketAddress(hostname, port));
			
			System.out.println("서버에 접속 되었습니다.");
			// -------------------------------------------------------
			
			// 2. 서버에 메시지 보내기
			// (클라이언트) 메시지 입력
			sc = new Scanner(System.in);
			System.out.print("서버에 인사말을 건네보세요 >>> ");
			String message = sc.nextLine();
			// -
			// 서버로 전달  (클라이언트 >> 서버와 연결된 객체) 
			// client  ---->  server  
			// (클라이언트에 출력 스트림이 필요)  (getOutputStream() : Reader(X) : 텍스트형태로 전달하지않고 '바이트'기반으로 전달할 것이다.)
			bos = new BufferedOutputStream ( client.getOutputStream( ) ) ;
			bos.write(message.getBytes("UTF-8"));
//			bos.write(byte[]);
//			bos.write(message.getBytes(charsetName : 한글문서가 깨지지 않도록 사용.));
				// .getBytes() : byte타입으로 강제 형변환시키겠다.
			bos.flush();  // 남아있는 데이터를 강제로 보내기
			
			
			// 3. 서버가 보낸 메시지 받기
			bis = new BufferedInputStream(client.getInputStream());
			byte[] b = new byte[1024];  // 읽어들일 공간 생성 (배열 생성)
			int length = bis.read(b);
			String answer = new String(b, 0, length, "UTF-8");
			System.out.println(answer);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (bis != null) bis.close();
				if (bos != null) bos.close();
				if (!client.isClosed()) client.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
