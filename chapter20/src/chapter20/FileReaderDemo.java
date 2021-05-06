package chapter20;

import java.io.*;

public class FileReaderDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String fname = "";
		try {
			System.out.println("읽어올 파일명을 입력하세요 : ");
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			fname = in.readLine();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Err : " + e.toString());
		}
		
		FileReader fr = new FileReader(fname);
		
		int i;
		
		while((i = fr.read()) != -1) {
			System.out.println((char)i);
		}
		fr.close();
		
	}
	
}
