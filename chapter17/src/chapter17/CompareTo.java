package chapter17;

public class CompareTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "가길동";
		String s2 = "가길동";
		
		System.out.println(s1.compareTo(s2));
		
		if(s1.compareTo(s2) < 0)	System.out.println("s1이 작은 문자열 입니다.");
		if(s1.compareTo(s2) == 0)	System.out.println("두 문자열은 같은 문자열 입니다.");
		if(s1.compareTo(s2) > 0)	System.out.println("s1이 큰 무자열입니다.");
	}

}
