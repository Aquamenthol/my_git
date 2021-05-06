package chapter21;

import java.io.*;
import java.net.*;

public class TestServer {

	public static void main(String[] args) {
		System.out.println("왕눈이 서버 프로그램 작동됨");

		ServerSocket server = null;
		try {
			server = new ServerSocket(2006);
			while (true) {
				System.out.println("클라이언트 접속을 대기중입니다.");
				Socket client = server.accept();

				InetAddress ia = client.getInetAddress();
				String name = ia.getHostName() + "\n";
				String ip = ia.getHostAddress() + "\n";

				System.out.println("클라이언트 접속됨..." + "name:" + name + "ip:" + ip);
				
//				출력 버퍼
				BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));

				writer.write("어서오세요오오~");	// 전송될 내역
				writer.flush();				// flush가 클라이언트로 전송

				try {
					client.close();
				} catch (IOException e) {
					System.out.println("Socket을 닫는중 에러가 났습니다." + e.toString());
				}
			}
		} catch (IOException e) {
			System.err.println("Exception generated...");
		} finally {
			try {
				server.close();
				System.out.println("서버 작동을 종료합니다.");
			} catch (IOException e) {
				System.out.println("ServerSocket을 닫는중 에러가 났습니다." + e.toString());
			}
		}
		InputStream is = System.in;
		try {
			is.read();
		} catch (Exception e) {
		}
		System.out.println("서버 프로그램 실행을 종료합니다.");
	}
}
