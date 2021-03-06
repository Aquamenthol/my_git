package chapter20;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

public class FileInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("파일 이름을 입력해주세요 : ");
		String name = "";
		
		try {
			BufferedReader in =  new BufferedReader(new InputStreamReader(System.in));
			name = in.readLine();
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("ERR : " + e.toString());
			
			File file = new File(name);
			if(file.exists()) {
				System.out.println("파일 이름 : " + file.getName());
				System.out.println("상대 패스 : " + file.getPath());
				System.out.println("절대 패스 : " + file.getAbsolutePath());
				System.out.println("쓰기 가능 : " + file.canWrite());
				System.out.println("읽기 가능 : " + file.canRead());
				System.out.println("파일 길이 : " + file.length() + "바이트");
			}
		}
	}

}
