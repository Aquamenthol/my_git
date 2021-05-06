package chapter20;
import java.io.*;

public class LineNumFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String buf;
		BufferedReader fisOrg = null;
		PrintWriter fosDst = null;
		BufferedReader in = null;
		BufferedReader out = null;
		int nlines;
		String fname = "";

		try {
			System.out.println("���ι�ȣ�� ���� ���ϸ��� �Է�");
			in = new BufferedReader(new InputStreamReader(System.in));
			fname = in.readLine();
			fisOrg = new BufferedReader(new FileReader(fname));
			
			System.out.println("������ ���ϸ��� �Է��ϼ���.");
			out = new BufferedReader(new InputStreamReader(System.in));
			fname = out.readLine();
			fosDst = new PrintWriter(new FileWriter(fname));
		}
		catch (Exception e) {
			
			System.out.println("Err : " + e.toString());
			System.exit(1);
		}
		int num = 1;
		
		while (true) {
			try {
				buf = fisOrg.readLine();
				if(buf == null)	break;
			}
			catch (IOException e) {
				System.out.println(e);
				break;
			}
			
			buf = num + ":" + buf;
			fosDst.println(buf);
			num++;
		}
		try {
			in.close();
			out.close();
			fisOrg.close();
			fosDst.close();
		}catch (IOException e) {
			System.out.println(e);
		}
	}
}