package testjava;

import java.util.Scanner;

public class Problem_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		float a, b;
		float result;
		
		System.out.println("ù��° �� �Է� ==> ");
		a = s.nextFloat();
		System.out.println("�ι�° �� �Է� ==> ");
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
