package chapter17;

public class StringConvert1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "새 천년";
		String s2 = "대한 민국";
		
		System.out.println("s1 해쉬코드 : " + s1.hashCode());
		System.out.println("s2 해쉬코드 : " + s2.hashCode());
		System.out.println("====================================================");
		
		s1 += s2;
		System.out.println(s1);
		System.out.println("s1 해쉬코드 : " + s1.hashCode());
		System.out.println("s2 해쉬코드 : " + s2.hashCode());
	}

}
