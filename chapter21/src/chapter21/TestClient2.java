package chapter21;

import java.io.*;
import java.net.*;

public class TestClient2 {
	public static void main(String[] args) {
		System.out.println("Ŭ���̾�Ʈ ���α׷� �۵�....");

		Socket socket = null;
		String line;
		int cnt = 0;

		try {
			socket = new Socket(args[0], 2006);

			System.out.println(args[0] + "�� ������ ���� �Ǿ����ϴ�....");

			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			while (true) {
				line = reader.readLine();
				if (line == null)
					break;
				System.out.println(line);
			}
		} catch (IOException ioe) {
			System.err.println("Exception generated...");
		} finally {
			try {
				socket.close();
				System.out.println("�������� ������ �����մϴ�.");
			} catch (Exception ignored) {
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
