package chapter17;

public class StringConvert2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s1 = new StringBuffer("새 천년");
		
		System.out.println(s1);
		System.out.println("s1 해쉬코드 : " +  s1.hashCode());
		System.out.println("================================================");
		
		s1.append("대한 민국");
		System.out.println(s1);
		System.out.println("s1 해쉬 코드 : " + s1.hashCode());

	}

}

