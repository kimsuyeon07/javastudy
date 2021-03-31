package ex04_;

import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMainClass {
	
	public static void main(String[] args) {
		
		// 클라이언트들이 파일을 전송합니다.
		// 파일 전송 작업은 '스레드'로 작성압니다.
		
		ServerSocket server = null;
		Socket client = null;
		
		try {
			server = new ServerSocket();
			server.bind(new InetSocketAddress("localhost", 4966));
			
			while (true) {
				
				// 클라이언트들의 접속 처리
				client = server.accept();
				
				// 클라이언트들의 파일 전송
				// 스레드 작업을 한다는 것은  => 파일전송을 담당하는 클래스가 존재해야 한다. (extends Thread)
				FileUploadThread upload = new FileUploadThread(); // 스레드 생성
				// 주입 : 스레드에게 클라이언트의 정보를 주입 => 1.생성자를 통한 전달  2.(일반적으로 많이 사용!)setter를 이용한 전달
				upload.setClient(client); // client를 통한 스트림 생성이 필요하므로 전달해 줍니다. 
				upload.start(); // 스레드 실행
				
				
			}
		
		
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (!server.isClosed()) server.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
	
		
		
		
		
		
	}		
}
