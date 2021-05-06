package chapter20;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class LineNumFile2 {
	public static void addLineNum(File f) {
		String buf;
		BufferedReader fisOrg = null;
		PrintWriter fosDst = null;
		BufferedReader in = null;
		BufferedReader out = null;
		int nlines; // ���� ����
		String fname = f.toString();

		try {
//			int i = fname.lastIndexOf('/');
//			
//			fname = fname.substring(i + 1);
//			System.out.println(fname);
			
			System.out.println("���ι�ȣ�� ���� ���ϸ��� �Է�");
			in = new BufferedReader(new InputStreamReader(System.in));
			fname = in.readLine();
			fisOrg = new BufferedReader(new FileReader(fname));
			
			System.out.println("������ ���ϸ��� �Է��ϼ���.");
			out = new BufferedReader(new InputStreamReader(System.in));
			fname = out.readLine();
			fosDst = new PrintWriter(new FileWriter(fname + ".txt"));
			
		} catch (Exception e) {
			System.out.println("Err : " + e.toString());
			System.out.println(1);
		}

		int num = 1;

		while (true) {
			try {
				buf = fisOrg.readLine();
				if (buf == null)
					break;
			} catch (Exception e) {
				System.out.println(e);
				break;
			}

			// ��ȣ ���� �˰���
			if (num < 10)
				buf = "  " + num + " : " + buf;
			else if (num >= 10 && num <= 99)
				buf = " " + num + " : " + buf;
			else if (num >= 100 && num <= 999)
				buf = num + " : " + buf;

			fosDst.println(buf);
			num++;
		}
		try {
			fisOrg.close();
			fosDst.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("������ �����߽��ϴ�.");

	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		String directory = "C:/java_bigdata/mywork_java/chapter/src";
		File dir = new File(directory);

		if (dir.isDirectory()) {
			String s[] = dir.list();
			for (int i = 0; i < s.length; i++) {
				File f = new File(directory + "/" + s[i]);
				System.out.println(f);
				if (f.isFile() && f.toString().endsWith(".java"))
					LineNumFile2.addLineNum(f);
			}
		} else
			System.out.println("������" + directory + "�� ���丮�� �ƴմϴ�.");
	}

}
