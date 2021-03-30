package ex02_socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientMainClass {

	public static void main(String[] args) {

		
		// Socket : 클라이언트
		Socket client = null;
		
		try {
			// 클라이언트 생성 : 접속이나 다른 작동은 없는 상태
			client = new Socket();
			
			System.out.println("클라이언트가 서버에 접속을 시도했습니다.");
			
			// 클라이언트가 서버에 접속을 시도
			// socket.connect(endpoint : 서버주소);
			// socket.connect(new InetSocketAddress(hostname , port : (포트번호)아무도 안쓰는 번호로 지정));
			// 방법 1.
			client.connect(new InetSocketAddress("localhost", 4966));
			// 방법 2.
			// socket.connect(new InetSocketAddress(InetAddress.getByName("localhost"), 4966));
			
			// ↓
			// 오류가 나지 않으면 
			// 접속 성공
			System.out.println( "클라이언트가 서버에 접속되었습니다.");
			// 서버 클래스를 만들어줘야 에러가 나지 않는다.
			
			
			// 웰컴 메시지 받기
			InputStream is = client.getInputStream();
			byte[] b = new byte[50]; // "Welcome to My Server!"를 저장할 수 있는 정도의 크기
			int length = is.read(b); // 읽은 내용은 b에 저장, '실제로 읽은 바이트 수'는 length에 저장
			// new String(bytes : 배열 명 , offset : 시작 인덱스 번호 , length : 실제로 읽은 바이트 개수 , charsetName)
			String message = new String(b, 0, length, "UTF-8");
			System.out.println(message);
			
		
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// 열려있으면 닫아라!
				if (!client.isClosed()) client.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
