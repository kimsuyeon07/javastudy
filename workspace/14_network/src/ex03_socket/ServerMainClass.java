package ex03_socket;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerMainClass {

	public static void main(String[] args) {

		
		ServerSocket server = null;
		Socket client = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		Scanner sc= null;
		
		
		try {
			
			// 1. 서버 생성
			server = new ServerSocket();
			server.bind(new InetSocketAddress("localhost", 4966));
//			server.bind(endpoint:호스트 주소 생성);
//				==> 호스트 주소 생성 : new InetSocketAddress(hostname, port)
//			server.bind(new InetSocketAddress( hostname:주소값 , port:포트값  ));
			
			while (true) {
				
				// 2. 클라이언트 접속
				System.out.println("===서버가 동작하고 있습니다===");
				client = server.accept();  // 클라이언트 받아줄 준비 (접속 시도 대기 중),
				InetSocketAddress isa = (InetSocketAddress)client.getRemoteSocketAddress();
				System.out.println("접속 클라이언트 : [ " + isa.getHostName() + " ]");
				
				// 3. 클라이언트가 보낸 메시지 받기
				// server  ----->  
				bis = new BufferedInputStream ( client.getInputStream() );  // 스트림 생성 (InputStream)
				byte[] b = new byte[1024];
				int length = bis.read(b);  // 메시지:b, 메시지글자수:length
				// 받은 메시지
				String message = new String(b, 0, length, "UTF-8");
//				new String(bytes:배열명, offset:시작인덱스번호, length:메시지글자수, charsetName:한글파일도열리도록)
//				bis.read(b, off:시작인덱스번호, len:읽은수만큼의길이)
				System.out.println(message);
				
				
				// 4. 클라이언트에게 답변 보내기
				sc = new Scanner(System.in);
				bos = new BufferedOutputStream(client.getOutputStream());
				System.out.print("클라이언트에게 답변을 보내보세요 >>> ");
				String answer = sc.nextLine();
				bos.write(answer.getBytes("UTF-8"));
				bos.flush();
				
				
				
				
				
			}
			
		
		}  catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (bos != null) bos.close();
				if (bis != null) bis.close();
				if (!server.isClosed()) server.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
	}
}
