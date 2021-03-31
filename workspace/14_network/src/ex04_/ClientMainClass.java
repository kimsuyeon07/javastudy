package ex04_;

import java.io.BufferedInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class ClientMainClass {

	public static void main(String[] args) {

		Scanner sc = null;
		Socket client = null;
		File dir = null;
		File file = null;
		DataOutputStream dos = null;
		BufferedInputStream bis = null;
		
		try {
			// <서버에 접속> : java.net
			client = new Socket();
			client.connect(new InetSocketAddress("localhost", 4966));
			
			// C:\MyClient 디렉터리 내부의 파일 중 하나의 이름을 입력 받아서 해당 파일을 전송합니다. 
			sc = new Scanner(System.in);
			System.out.print("전송할 파일명 입력 >>> ");
			String filename = sc.nextLine();
			
			// File : java.io
			dir = new File("C:\\MyClient");  // 경로 지정
			file = new File(dir, filename);  // 디렉토리 지정, 파일이름 지정
			
			// <서버로 파일명 보내기>
			// 파일 명을 String으로 전달. (DataOutputStream 사용 => 타입에 따라 알아서 전달해준다.)
			dos = new DataOutputStream(client.getOutputStream());
			dos.writeUTF(filename);  // dos.writeUTF(str); => String타입 데이터값을 전달받는다.
			
			
			// <파일 내용을 읽어서 서버로 파일내용 보내기>
			// 파일 내용을 읽기 위해 (필요) => FileInputStream
			// 성능을 높이기 위해 ==> BufferedInputStream 사용!
			bis = new BufferedInputStream(new FileInputStream(file));  
														   // file  =>  new File(dir, filename);
			byte[] b = new byte[1024];
			int length = 0;
			while ( (length = bis.read(b)) != -1 ) {
				dos.write(b, 0, length);
			}
			
			System.out.println(file.getAbsolutePath() + "파일을 서버로 전송했습니다.");
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (dos != null) dos.close();
				if (bis != null) bis.close();
				if (!client.isClosed()) client.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
			
			
			
			
		
			
		
		
		
		
		
		
		
		
		
		
	}
}
