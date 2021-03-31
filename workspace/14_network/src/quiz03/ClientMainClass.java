package quiz03;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class ClientMainClass {

	public static void main(String[] args) {

		Socket client = null;
		Scanner sc = null;
		BufferedOutputStream bos = null;
		BufferedInputStream bis = null;
		String message = null;
		String messageServer = null;
		
		try {
			client = new Socket();
			client.connect(new InetSocketAddress("localhost", 4966));
			System.out.println("서버에 접속 되었습니다.");
			
			boolean exitString = true;
			while (exitString) {

				exitString = (message.equalsIgnoreCase("exit") || messageServer.equalsIgnoreCase("exit")) ? false : true;
				
				
				// 서버에 메시지 보내기
				sc = new Scanner(System.in);
				System.out.print("To Server : ");
				messageServer = sc.nextLine();
				bos = new BufferedOutputStream(client.getOutputStream());
				bos.write(messageServer.getBytes("UTF-8"));
				bos.flush();
				
				
				// 서버한테 메시지 전달받기
				bis = new BufferedInputStream(client.getInputStream());
				byte[] b = new byte[1024];
				int length = bis.read(b);
				message = new String(b, 0, length, "UTF-8");
				System.out.println("From Server" + message);
				
			}
			
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
