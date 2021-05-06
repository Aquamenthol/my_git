package chapter11;

// 문자열은 상수이기때문에 같은 문자열이면 해시코드는 언제나 동일하다.
// s1.equals(s2)
// StringBuffer나 StringBuilder

public class Test02_1 {
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = "world";
		String s4 = "A" + "B" + "C" + "D";
		String s5 = "AB"+"CD";
		String str2 = null;
		
		System.out.println("3 + 7 : " + 5 + 7 + (3 + 7)); // 문자 (괄호안에는 정수)
		str2 = s3 + s4 + s5; // 결론 4 문자열이 바뀌면 해쉬코드도 무조건 바뀐다.
		
		String str1 = new String ("Hello");	// heap 영역의 메모리
		
		System.out.println("str2 : "+ str2 + ", 해시코드 : " + str2.hashCode());
		System.out.println("문자열은  == 등치연산자로 비교 하지 말것");
		System.out.println("문자열을 == 비교할때에 메모리 해시코드만 비교 한다.\n");
		if (s1 == s2) 
			System.out.println("s1 == s2주소가 같다");	// 메모리 주소
		if (s3 == s4)
			System.out.println("s3 == s4주소가 같다");	// 메모리 주소
		if (s1 != str1)
			System.out.println("s1과 str1은 위치가 다르다");	// heap과 메모리
		if(s1.equals(str1))
			System.out.println("s1와같은 문자열입니다.(순수 문자만 비교)");
		else
			System.out.println("다르다");
		System.out.println("");
		
		System.out.println("s1 : " + s1 + ", hashCode : " + s1.hashCode());
		System.out.println("s2 : " + s2 + ", hashCode : " + s2.hashCode());
		System.out.println("str1 : " + str1 + ", hashcode : " + str1.hashCode());
		System.out.println("");
		System.out.println("s3 : "+ s3 + ", hashCode : " + s3.hashCode());
		System.out.println("s4 : "+ s4 + ", hashCode : " + s4.hashCode());
		System.out.println("s5 : "+ s5 + ", hashCode : " + s5.hashCode());
		
		if(s4.equals(s5))
			System.out.println("s4와 s5가 같네요");
	}
}
