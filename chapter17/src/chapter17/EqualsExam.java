package chapter17;

public class EqualsExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a1 = "STUDY JAVA";
		String a2 = "Apple";
		String a3 = "APPLE";
		System.out.println("���ڿ� a1 : " + a1);
		System.out.println("���ڿ� a2 : " + a2);
		System.out.println("���ڿ� a3 : " + a3);
		System.out.println("a2.equals(a3) : " + a2.equals(a3));
		System.out.println("a2.equalsIgnoreCase(a3) : " + a2.equalsIgnoreCase(a3));
		
		if (a2 == "Apple") System.out.println("a2�� Apple�Դϴ�.");
		
		String objs = new String("�մ���");
		
		if (objs == "�մ���") System.out.println("objs�� �մ��� �Դϴ�.");
		else 				System.out.println("objs�� �մ��̰� �ƴմϴ�.");
		
		String objs2 = new String("�մ���");
		if (objs2.equals("�մ���")) System.out.println("equals obj2�� �մ��� �Դϴ�.");
	}

}
