package ex04_;

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.Socket;

public class FileUploadThread extends Thread {

	// field
	private Socket client;
	
	// Getter and Setter
	public Socket getClient() {
		return client;
	}
	public void setClient(Socket client) {
		this.client = client;
	}
	
	
	// run()
	@Override
	public void run() {
		
		// client가 보낸 파일을 저장할 디렉터리
		File dir = new File("C:\\MyServer");
		if (!dir.exists()) {
			dir.mkdirs();
		}
	
		DataInputStream dis = null;
		File file = null;
		BufferedOutputStream bos = null;
		
		try {
			// client가 파일명 + 파일내용을 보내고 있습니다.
			// client가 DateOutputStream으로 데이터를 보내고 있기 때문에,
			// DataInputStream을 사용해서 파일명 + 파일내용을 읽습니다.
			dis = new DataInputStream(client.getInputStream());
			String filename = dis.readUTF();  // client가 파일명을 writeUTF로 보냈기 때문에
				// 파일이름이 바이트화 되어 전달되어졌다.
			
			// client가 보낸 파일내용을 C:\MyServer 디렉터리에 저장합니다.
			// 파일을 저장하기 위해서 FileOutputStream이 필요하고,
			// 성능을 위해서 BufferedOuputStream 이 필요하다.
			file = new File(dir, filename);
			bos = new BufferedOutputStream(new FileOutputStream(file));
			byte[] b = new byte[1024];
			int length = 0;
			while ( (length = dis.read(b)) != -1 ) {
				bos.write(b, 0, length);
			}
			System.out.println(file.getAbsolutePath() + " 파일이 서버에 저장되었습니다.");
			
			
			
			
		} catch (Exception e) {
			 e.printStackTrace();
		} finally {
			try {
				if (dis != null) dis.close();
				if (bos != null) bos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
	
	
	
	




	
}
