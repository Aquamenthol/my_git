package chapter5;

public class ForTest {
// break ; �ݺ��� �ȿ��� ����� ���� ��ų���� �� ������ �ݺ��� �����ϱ� ���� �����ؾ� �Ѵ�. -- ��������
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
//			//System.out.println("i�� �� : " + a);
//		}
//		a *= 2;
//		System.out.println("a�� �� : " + a);
		
//		int i;
//		for(i = 1; i < 10; i++)
//			System.out.printf("%d + %d = %d \n", i, i, i + i);
		
		int i = 0; 
		int hap = 0;
//		int even_hap = 0;
//		
//		for(i = 1; i <= 100; i++) {
//			if(i % 2 == 0) // 2�� ������������ 0 = ¦��
//				even_hap = even_hap + i;
//			else
//				odd_hap = odd_hap + i;
//		}
//		System.out.printf("Ȧ���� �� : %d \n", odd_hap);
//		System.out.printf("¦���� �� : %d \n", even_hap);
//		
		for(i = 1; i <= 1000; i++) {                          
			if (i % 3 == 0 || i % 7 == 0)
				hap += i;
			}
		System.out.printf("3�� ��� �Ǵ� 7�� ����� �� : %d \n", hap);
		
	}

}

