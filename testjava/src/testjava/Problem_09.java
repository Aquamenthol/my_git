package testjava;

import java.util.Scanner;

public class Problem_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int money, c500, c100, c50, c10;
		
		System.out.println("교환할 돈은???");
		money = s.nextInt();
		
		c500 = money / 500;
		money %= 500;
		
		c100 = money / 100;
		money %= 100;
		
		c50 = money / 50;
		money %= 50;
		
		c10 = money / 10;
		money %= 10;
		
		System.out.println("오백원짜리 동전" + c500);
		System.out.println("백원짜리 동전" + c100);
		System.out.println("오십원짜리 동전" + c50);
		System.out.println("십원짜리 동전" + c10);
		
		System.out.println("바꾸지 못한 돈 ====> " + money);
	}

}
