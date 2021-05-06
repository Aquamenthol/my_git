package chapter4;

import java.util.Scanner;

public class SwitchTest {
	// 여러개 명령어 중에서 하나를 선택 하여 실행 할때 사용
	// 원칙 : 단순 비교 일
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// break는 자신을 감싸고 있는 블럭을 빠져나간다 break; 한다.
		int num = 0;
		System.out.println("숫자를 입력해주세요 : ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		switch(num) {
		case 1 : System.out.println("1 입니다."); break; 											
		case 2 : System.out.println("2 입니다."); break;
		case 3 : System.out.println("3 입니다."); break;
		case 4 : System.out.println("4 입니다."); break;
		default : System.out.println("1부터 4까지 입력해야 합니다.");
		}

	}

}
