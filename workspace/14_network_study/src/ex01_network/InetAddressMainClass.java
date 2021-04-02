package ex01_network;

import java.net.InetAddress;
import java.util.Arrays;

public class InetAddressMainClass {

	public static void main(String[] args) {

		String host = "www.naver.com";
		InetAddress ia = null;
		
		try {
			ia = InetAddress.getByName(host);
			System.out.println(ia);
			
			System.out.println(ia.getHostAddress());
			System.out.println(ia.getHostName());
			
			InetAddress[] ias = InetAddress.getAllByName(host);
			for (InetAddress i : ias) {
				System.out.println(i.getHostName() + "의 ip 주소 : " + i.getHostAddress());
			}
			// ↓ { -33, -126, -61, -56}
			byte[] byteIp = ia.getAddress();        // byte가 담을 수 있는 숫자값을 넘어서
			short[] ip = new short[byteIp.length];  // short배열을 생성한 뒤 byte[]을 넘겨준다.
			for (int i = 0; i<byteIp.length; i++) { // 숫자 한개씩 확인(for문)해서 원하던 숫자(+256) 출력.
				ip[i] = (short)(byteIp[i] < 0 ? byteIp[i]+256 : byteIp[i]);
			}
			
			System.out.println(Arrays.toString(byteIp));
			System.out.println(Arrays.toString(ip));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
