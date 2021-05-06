package chapter21;

import java.net.InetAddress;

public class LookupHost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arg_ip = "172.30.1.43";
		try {
			InetAddress inetAddr = InetAddress.getByName(arg_ip);
			String name = inetAddr.getHostName() + "\n";
			String ip = inetAddr.getHostAddress() + "\n";
			System.out.println("Host Name : " + name);
			System.out.println("IP Address : " + ip);
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}