package testjava;

import java.util.Scanner;

public class Problem_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		float a, b;
		float result;
		
		System.out.println("첫번째 값 입력 ==> ");
		a = s.nextFloat();
		System.out.println("두번째 값 입력 ==> ");
		b = s.nextFloat();
		
		
		result = a + b;
		System.out.printf("%5.2f + %5.2f = %5.2f \n", a, b, result);
		
		result = a - b;
		System.out.printf("%5.2f - %5.2f = %5.2f \n", a, b, result);
		
		result = a * b;
		System.out.printf("%5.2f * %5.2f = %5.2f \n", a, b, result);
		
		result = a / b;
		System.out.printf("%5.2f / %5.2f = %5.2f \n", a, b, result);
		//age = interger.parseint(scanner.nextLine());

	}

}
