package chapter20;
import java.io.*;

public class BufferInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("BufferedReader in ��ü ����");
		System.out.print("������ �Է��� �ּ���");
		
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
