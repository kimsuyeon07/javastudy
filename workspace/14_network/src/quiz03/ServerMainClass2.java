package quiz03;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerMainClass2 {

	public static void main(String[] args) {
		
		
		ServerSocket server = null;
		Socket client = null;
		
		Scanner sc = null;
		BufferedReader br = null;
		BufferedWriter bw = null;  // == PrintWriter out = null;
//		PrintWriter out = null;
		
		
		
		try {
			// 서버 생성
			server = new ServerSocket();
			server.bind(new InetSocketAddress(InetAddress.getLocalHost().getHostAddress(), 4966));
			
			// 클라이언트 접속 처리
			client = server.accept();
			InetSocketAddress isa = (InetSocketAddress)client.getRemoteSocketAddress();
			System.out.println("접속 클라이언트 : [ " + isa.getHostName() + " ]");
			
			// 바이트 기반 스트림을 문자 기반의 스트림으로 바꿔서 진행합니다.
			br = new BufferedReader(new InputStreamReader(client.getInputStream(), "UTF-8"));
			bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream(), "UTF-8"));
//				out = new PrintWriter(new OutputStreamWriter(client.getOutputStream(), "UTF-8"));
			sc = new Scanner(System.in);
				
				
			// "exit"값을 받으면 종료
			while (true) {
				
				// receive from client
				String fromClient = null;
				fromClient = sc.nextLine();  // "\n"을 읽을 때까지 read합니다.
				if (fromClient == null) {
					System.out.println("Disconnect By Client!");
					break;
				}
				System.out.println("From Client <<< " + fromClient);
				
				
				// send to client
				System.out.println("To client >>> ");
				String toClient = sc.nextLine();
				bw.write(toClient + "\n");
				bw.flush();
				
				
				
			}
				
						
				
				
				
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null) br.close();
				if (bw != null) bw.close();
				if (!server.isClosed())server.close();
			} catch (Exception e) { e.printStackTrace(); }
		}
		
		
		
	
	
  }
}
