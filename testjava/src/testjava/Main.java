package testjava;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int[] aa = new int[10];
		Scanner sc = new Scanner(System.in);
		int gugu = sc.nextInt();
		sc.close();
		for (int i = 1; i <= 9; i++) {
				aa[i] = gugu * i;
				System.out.println(gugu + " * " + i + " = " + aa[i]);
			
		}
	}
}