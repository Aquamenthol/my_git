package chapter3;

public class Float_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("실수형 상수 예제");
		System.out.println("양 실수 12.345 :" + 12.345);
		System.out.println("음 수형 상수 예제 :" + -12.345);
		
		// 12.34E3 == 12.34E+3 == 12.34 * 1000
		System.out.println("지수 표현 12.34E3:" + 12.34E3);
		
		// 12.34E-3 == 12.34E-3 == 12.34 / 1000
		System.out.println("지수 표현 12.34E-3:" + 12.34E-3);
		
		System.out.println(100 + 200 + "종로" + 100 + 200);
		System.out.println(100 + 200 + "종로" + (100 + 200));
		

	}

}
