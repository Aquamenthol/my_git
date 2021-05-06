package testjava;

import java.util.Scanner;

public class Problem_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int year;
		
		System.out.println("연도를 입력하세요 : ");
		year = s.nextInt();
		
		if(((year % 4 ==0) && (year % 100 != 0)) || (year % 400 == 0)) {
			//윤년은 연도가 4로 나누어 떨어지고 100으로 나누어 떨어지지 않아야 하며 또는 400으로 나누어 떨어진다.
			System.out.println(year + "년은 윤년입니다.");
		}
		else
			System.out.println(year + "년은 윤년이 아닙니다.");

	}

}

/* line.separator 라인 자동줄바꿈 (가상머신)*/
