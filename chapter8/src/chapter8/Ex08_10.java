package chapter8;

import java.util.Scanner;

public class Ex08_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int row, col;
		
		System.out.println("행 개수 입력 : ");
		row = s.nextInt();
		System.out.println("열 개수 입력 : ");
		col = s.nextInt();
		
		int [][] aa = new int [row][col];
		
		int i, k;
		int val = 1;
		
		for (i = 0; i < row; i++) {
			for (k = 0; k < col; k++) {
				aa[i][k] = val;
				val++;
			}
		}
		
		System.out.printf("aa[0][0]부터 aa[%d][%d]까지 출력 \n", row, col);
		
		for (i = 0; i < row; i++) {
			for(k = 0; k < col; k++) {
				System.out.printf("%3d", aa[i][k]);
			}
			System.out.println("");
		}
	}

}