package chapter9;

import java.util.Scanner;

public class BlockMain {
	String block = "바람의 전설";
	
	public static void main(String[] args) {
		String block = "트로이";
		System.out.println("Move : " + block);
		
		int i = 0;
		
		{	// block start
			String block2 = "달콤한 인생";
			System.out.println("Move : " + block2);
			
			
			for (int j = 0; j < 5; j++) {
				String movie;
				Scanner scan = new Scanner(System.in);
				System.out.println("영화 이름 입력 : ");
				movie = scan.nextLine();
				System.out.println("" + movie);
			}
			
			for (i = 0; i < 5; i++) {
				
			}
			
			System.out.println("" + i);
		}	// block end
	}

}
