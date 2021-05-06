package chapter11;

// ���ڿ��� ����̱⶧���� ���� ���ڿ��̸� �ؽ��ڵ�� ������ �����ϴ�.
// s1.equals(s2)
// StringBuffer�� StringBuilder

public class Test02_1 {
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = "world";
		String s4 = "A" + "B" + "C" + "D";
		String s5 = "AB"+"CD";
		String str2 = null;
		
		System.out.println("3 + 7 : " + 5 + 7 + (3 + 7)); // ���� (��ȣ�ȿ��� ����)
		str2 = s3 + s4 + s5; // ��� 4 ���ڿ��� �ٲ�� �ؽ��ڵ嵵 ������ �ٲ��.
		
		String str1 = new String ("Hello");	// heap ������ �޸�
		
		System.out.println("str2 : "+ str2 + ", �ؽ��ڵ� : " + str2.hashCode());
		System.out.println("���ڿ���  == ��ġ�����ڷ� �� ���� ����");
		System.out.println("���ڿ��� == ���Ҷ��� �޸� �ؽ��ڵ常 �� �Ѵ�.\n");
		if (s1 == s2) 
			System.out.println("s1 == s2�ּҰ� ����");	// �޸� �ּ�
		if (s3 == s4)
			System.out.println("s3 == s4�ּҰ� ����");	// �޸� �ּ�
		if (s1 != str1)
			System.out.println("s1�� str1�� ��ġ�� �ٸ���");	// heap�� �޸�
		if(s1.equals(str1))
			System.out.println("s1�Ͱ��� ���ڿ��Դϴ�.(���� ���ڸ� ��)");
		else
			System.out.println("�ٸ���");
		System.out.println("");
		
		System.out.println("s1 : " + s1 + ", hashCode : " + s1.hashCode());
		System.out.println("s2 : " + s2 + ", hashCode : " + s2.hashCode());
		System.out.println("str1 : " + str1 + ", hashcode : " + str1.hashCode());
		System.out.println("");
		System.out.println("s3 : "+ s3 + ", hashCode : " + s3.hashCode());
		System.out.println("s4 : "+ s4 + ", hashCode : " + s4.hashCode());
		System.out.println("s5 : "+ s5 + ", hashCode : " + s5.hashCode());
		
		if(s4.equals(s5))
			System.out.println("s4�� s5�� ���׿�");
	}
}
