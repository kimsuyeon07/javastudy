package quiz03;

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
		Scanner sc = null;
		BufferedOutputStream bos = null;
		String message = null;
		String messageClient = null;
		
		
		try {
			server = new ServerSocket();
			server.bind(new InetSocketAddress("localhost", 4966));
			
			while (true) {
				System.out.println("===server 동작 중===");
				client = server.accept();
				InetSocketAddress isa = (InetSocketAddress)client.getRemoteSocketAddress();
				System.out.println("접속 클라이언트 : [ " + isa.getHostName() + " ]");
				
				
				// "exit"값을 받으면 종료
				
				boolean exitString = true;
				while (exitString) {
					// 클라이언트가 보낸 메시지 받기
					bis = new BufferedInputStream(client.getInputStream());
					byte[] b = new byte[1024];
					int length = bis.read(b);
					message = new String(b, 0, length, "UTF-8");
					System.out.println("From Client : " + message);
					
					// 클라이언트에게 메시지 보내기
					sc = new Scanner(System.in);
					bos = new BufferedOutputStream(client.getOutputStream());
					System.out.println("To Client : ");
					messageClient = sc.nextLine();
					bos.write(messageClient.getBytes("UTF-8"));
					bos.flush();
					 
					exitString = (message.equalsIgnoreCase("exit") || messageClient.equalsIgnoreCase("exit")) ? false : true; 
					
//					if (message == exit || messageClient == exit) { return;}
				}
				
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (bos != null) bos.close();
				if (bis != null) bis.close();
				if (!server.isClosed())server.close();
			} catch (Exception e) { e.printStackTrace(); }
		}
		
		
		
	
	
  }
}
