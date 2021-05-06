package chapter21;

import java.io.*;
import java.net.*;

public class TestServer {

	public static void main(String[] args) {
		System.out.println("�մ��� ���� ���α׷� �۵���");

		ServerSocket server = null;
		try {
			server = new ServerSocket(2006);
			while (true) {
				System.out.println("Ŭ���̾�Ʈ ������ ������Դϴ�.");
				Socket client = server.accept();

				InetAddress ia = client.getInetAddress();
				String name = ia.getHostName() + "\n";
				String ip = ia.getHostAddress() + "\n";

				System.out.println("Ŭ���̾�Ʈ ���ӵ�..." + "name:" + name + "ip:" + ip);
				
//				��� ����
				BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));

				writer.write("����������~");	// ���۵� ����
				writer.flush();				// flush�� Ŭ���̾�Ʈ�� ����

				try {
					client.close();
				} catch (IOException e) {
					System.out.println("Socket�� �ݴ��� ������ �����ϴ�." + e.toString());
				}
			}
		} catch (IOException e) {
			System.err.println("Exception generated...");
		} finally {
			try {
				server.close();
				System.out.println("���� �۵��� �����մϴ�.");
			} catch (IOException e) {
				System.out.println("ServerSocket�� �ݴ��� ������ �����ϴ�." + e.toString());
			}
		}
		InputStream is = System.in;
		try {
			is.read();
		} catch (Exception e) {
		}
		System.out.println("���� ���α׷� ������ �����մϴ�.");
	}
}
