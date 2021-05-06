package chapter21;

import java.io.*;
import java.net.*;

public class TestServer2 {
	public static void main(String[] args) {
		System.out.println("왕눈이 서버 프로그램 작동됨");

		ServerSocket server = null;
		try {
			server = new ServerSocket(2006);
			while (true) {
				Socket client = server.accept();

				InetAddress ia = client.getInetAddress();
				String name = ia.getHostName() + "\n";
				String ip = ia.getHostAddress() + "\n";

				System.out.println("클라이언트 접속됨..." + "name:" + name + "ip:" + ip);

				BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
				// 여러줄 보내기
				writer.write("왕눈이 서버에 접속 하싞것을 홖영 합니다.");
				writer.newLine();
				writer.write("★선호하는 음식★");
				writer.newLine();
				writer.write("1. 광어, 우럭등 각종 홗어회");
				writer.newLine();
				writer.write("2. 감자탕, 매운탕, 보싞탕, 추어탕등 각종 탕류");
				writer.newLine();
				writer.write("3. 왕갈비, 삼겹살, 목살, 불고기등");
				writer.newLine();
				writer.write("4. 순대볶음, 짬뽕라면, 참치찌게, 고등어조림");
				writer.newLine();
				writer.write("☆즐겨 마시는 술☆");
				writer.newLine();
				writer.write("1. 포도주, 맥주, 동동주");
				writer.newLine();

				writer.flush();

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