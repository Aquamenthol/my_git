package chapter20;

import java.io.*;

public class FileWriterDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String source = "JAVA\t" + "JSP\t" + "EJB\t" + "OJT\t";
		String fname = "";
		
		try {
			System.out.print("������ ���ϸ��� �Է��ϼ��� : ");
			BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
			fname = in.readLine();
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Err : " + e.toString());
		}
		
		FileWriter fw = new FileWriter(fname);
		
		fw.write(source);
		System.out.println("������ ���� �߽��ϴ�.");
		
		fw.close();
		
		

	}

}
