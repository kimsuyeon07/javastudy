package quiz03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class ClientMainClass2 {

	public static void main(String[] args) {

		Socket client = null;
		
		Scanner sc = null;
		BufferedWriter bw = null;
		BufferedReader br = null;
		
		
		try {
			client = new Socket();
			client.connect(new InetSocketAddress("localhost", 4966));
			System.out.println("서버에 접속 되었습니다.");
			
			br = new BufferedReader(new InputStreamReader(client.getInputStream(), "UTF-8"));
			bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream(),"UTF-8"));
			sc = new Scanner(System.in);


			while (true) {

				// send to server
				System.out.println("To Server >>> ");
				String toServer = sc.nextLine();
				if (toServer.equalsIgnoreCase("exit")) {
					System.out.println("Terminate client. Good Bye!");
					break;
				}
				bw.write(toServer + "\n");
				bw.flush();
				
				
				// receive from server
				String fromServer = br.readLine();
				System.out.println("From Server <<< " + fromServer);
				
				
				
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null) br.close();
				if (bw != null) bw.close();
				if (!client.isClosed()) client.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		

		
		
	}
}
