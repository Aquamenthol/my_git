package chapter4;

import java.util.Scanner;

public class SwitchTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 아스키코드 7bit컴퓨터 제어 문자 : 정수로 표현 되는 문자.
		String num;
		System.out.println("숫자를 입력해주세요 : ");
		Scanner sc = new Scanner(System.in);
		num = sc.next();
		
		switch (67) { // 아스키코드에서 65 = 'A'
		case 'A' : System.out.println("입력된 코드는 A 입니다."); break;
		case 'B' : System.out.println("입력된 코드는 B 입니다."); break;
		case 'C' : System.out.println("입력된 코드는 C 입니다."); break;
		case 'D' : System.out.println("입력된 코드는 D 입니다."); break;
		default: System.out.println("코드는 A부터 D까지 입력해야 합니다.");
		}
//		System.out.println("5 + 2 = " + 3 + 4);
//		System.out.println("5 + 2 = " + (3 + 4));
//		System.out.println("5 + 2 = " + 1 + 4);
//		System.out.println("5 + 2 = " + (1 + 4));
	}

}
