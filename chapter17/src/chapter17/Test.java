package chapter17;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String bin = Integer.toBinaryString(100);
		System.out.println("100의 2진수는 " + bin);
		
		Integer it = 10; // 오토밗싱
		System.out.println("값 출력 : " + it.intValue());
		
		int kuk = Integer.parseInt("100");
		System.out.println("숫자 kuk 값 출력 : " +kuk);

	}

}
