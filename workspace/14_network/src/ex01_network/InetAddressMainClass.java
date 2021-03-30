package ex01_network;

import java.net.InetAddress;
import java.util.Arrays;

public class InetAddressMainClass {

	public static void main(String[] args) {

		
		// 원격 호스트
		String host = "www.never.com";
		
		// 인터넷 주소를 처리하는 InetAddress
		// import java.net(패키지)
		InetAddress ia = null;
		
		try {
			ia = InetAddress.getByName(host);
			System.out.println(ia);
			// www.never.com/181.214.31.81
			System.out.println(ia.getHostName());     // => hostName : domain
			System.out.println(ia.getHostAddress());  // => hostAddress : ip
			
			InetAddress[] ias = InetAddress.getAllByName(host);
			for (InetAddress i : ias) {
				System.out.println(i.getHostName() + "의  ip 주소 : " + i.getHostAddress() );
			}
			
			byte[] byteIp = ia.getAddress();
			// byte < short 타입 배열을 생성 => 값을 옯겨준다.
			short[] ip = new short[byteIp.length];
			// 옮기는 과정 : 캐스팅(short) + 원래의 주소값이 나오도록 음수 값에(+256)처리
			for (int i = 0; i < byteIp.length; i++) {
				ip[i] = (short)(byteIp[i] < 0 ? byteIp[i]+256 : byteIp[i]);
			}
				
			System.out.println(Arrays.toString(byteIp));  // [-75, -42, 31, 81] : byte타입이 지닐 수 있는 숫자 한계 (-128 ~ 127)
			System.out.println(Arrays.toString(ip));
			
			
			
			
			
			
			
			
				
			
		} catch (Exception e) {
			e.printStackTrace();
		}
			
		// ex) (hostName)localhost_ hostAddress : 127.0.0.1
		
		
		
		
		
		
	}
}
