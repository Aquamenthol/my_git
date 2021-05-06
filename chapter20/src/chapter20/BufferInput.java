package chapter20;
import java.io.*;

public class BufferInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("BufferedReader in 객체 생성");
		System.out.print("문장을 입력해 주세요");
		
		String s = "";
		try {
			s = in.readLine(); 
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error : " + e.toString());
		}
		System.out.println(s);
		}
	}
