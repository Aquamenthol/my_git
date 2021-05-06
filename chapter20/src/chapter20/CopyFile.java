package chapter20;
import java.io.*;

public class CopyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		if(args.length != 2) {
			System.out.println("========에러=========");
			System.out.println("usage : java CopyFile <원본파일명><대상파일명>");
			
			System.exit(1);
		}
		
		File inputFile = new File(args[0]);
		File outputFile = new File(args[1]);
		
		FileReader in = new FileReader(inputFile);
		FileWriter out = new FileWriter(outputFile);
		
		int c;
		
		while ((c = in.read()) != -1) {
			out.write(c);
		}
		
		System.out.println("복사 완료");
		
		in.close();
		out.close();

	}

}
