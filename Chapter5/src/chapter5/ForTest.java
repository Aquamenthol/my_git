package chapter5;

public class ForTest {
// break ; 반복문 안에서 어떤값을 누적 시킬려면 그 변수는 반복문 시작하기 전에 선언해야 한다. -- 누적변수
	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
///*		for(int i = 0; i <= 5; ++i)
//			System.out.println("num : " + i);
//
//		
//		System.out.println("---------------------------");
//		for(int j = 0; j <= 5; j++)
//			System.out.println("num : " + j);*/
//			int a = 0;
//		for (int i = 2; i < 10 ; i++) {
//			a += i;
//			//System.out.println("i의 값 : " + a);
//		}
//		a *= 2;
//		System.out.println("a의 값 : " + a);
		
//		int i;
//		for(i = 1; i < 10; i++)
//			System.out.printf("%d + %d = %d \n", i, i, i + i);
		
		int i = 0; 
		int hap = 0;
//		int even_hap = 0;
//		
//		for(i = 1; i <= 100; i++) {
//			if(i % 2 == 0) // 2로 나눈나머지가 0 = 짝수
//				even_hap = even_hap + i;
//			else
//				odd_hap = odd_hap + i;
//		}
//		System.out.printf("홀수의 합 : %d \n", odd_hap);
//		System.out.printf("짝수의 합 : %d \n", even_hap);
//		
		for(i = 1; i <= 1000; i++) {                          
			if (i % 3 == 0 || i % 7 == 0)
				hap += i;
			}
		System.out.printf("3의 배수 또는 7의 배수의 합 : %d \n", hap);
		
	}

}

