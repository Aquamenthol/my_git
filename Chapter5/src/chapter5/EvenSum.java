package chapter5;

public class EvenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int sum  = 0;
		int sum = 0, sub = 0, mul = 1;
		double div = 1;
		for (int i = 1; i<= 10; i++)
			if ((i % 2) == 0) { // 2�� ���� �������� 0�� �Ǵ� ����
				sum += i; // sum = sum + i;
				sub -= i; // sub = sub - i;
				mul *= i; // mul = mul * i;
				div /= i; // div = div / i;
			}
		System.out.println("1 ���� 10 ���� ¦���� �� : " + sum);
		System.out.println("1 ���� 10 ���� ¦���� �M�� : " + sub);
		System.out.println("1 ���� 10 ���� ¦���� �� : " + mul);
		System.out.println("1 ���� 10 ���� ¦���� ������ : " + div);
		}	

}
