package chapter5;

public class EvenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int sum  = 0;
		int sum = 0, sub = 0, mul = 1;
		double div = 1;
		for (int i = 1; i<= 10; i++)
			if ((i % 2) == 0) { // 2로 나눈 나머지가 0이 되는 숫자
				sum += i; // sum = sum + i;
				sub -= i; // sub = sub - i;
				mul *= i; // mul = mul * i;
				div /= i; // div = div / i;
			}
		System.out.println("1 부터 10 까지 짝수의 합 : " + sum);
		System.out.println("1 부터 10 까지 짝수의 뻄셈 : " + sub);
		System.out.println("1 부터 10 까지 짝수의 곱 : " + mul);
		System.out.println("1 부터 10 까지 짝수의 나눗셈 : " + div);
		}	

}
