package chapter5;

public class EvenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int sum  = 0;
		int sum = 0, sub = 0, mul = 1;
		double div = 1;
		for (int i = 1; i<= 10; i++)
			if ((i % 2) == 0) { // 2·Î ³ª´« ³ª¸ÓÁö°¡ 0ÀÌ µÇ´Â ¼ýÀÚ
				sum += i; // sum = sum + i;
				sub -= i; // sub = sub - i;
				mul *= i; // mul = mul * i;
				div /= i; // div = div / i;
			}
		System.out.println("1 ºÎÅÍ 10 ±îÁö Â¦¼öÀÇ ÇÕ : " + sum);
		System.out.println("1 ºÎÅÍ 10 ±îÁö Â¦¼öÀÇ –M¼À : " + sub);
		System.out.println("1 ºÎÅÍ 10 ±îÁö Â¦¼öÀÇ °ö : " + mul);
		System.out.println("1 ºÎÅÍ 10 ±îÁö Â¦¼öÀÇ ³ª´°¼À : " + div);
		}	

}
