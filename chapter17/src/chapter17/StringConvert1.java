package chapter17;

public class StringConvert1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "�� õ��";
		String s2 = "���� �α�";
		
		System.out.println("s1 �ؽ��ڵ� : " + s1.hashCode());
		System.out.println("s2 �ؽ��ڵ� : " + s2.hashCode());
		System.out.println("====================================================");
		
		s1 += s2;
		System.out.println(s1);
		System.out.println("s1 �ؽ��ڵ� : " + s1.hashCode());
		System.out.println("s2 �ؽ��ڵ� : " + s2.hashCode());
	}

}
