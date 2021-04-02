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
			
			byte[] byteIp = ia.getAddress();
			short[] ip = new short[byteIp.length];
			for (int i = 0; i<byteIp.length; i++) {
				ip[i] = (short)(byteIp[i] < 0 ? byteIp[i]+256 : byteIp[i]);
			}
			
			System.out.println(Arrays.toString(byteIp));
			System.out.println(Arrays.toString(ip));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
