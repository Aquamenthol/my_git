package chapter5;

public class StatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("----------------1 ���� �ݺ��� �ٹٲ�");
		for(int i = 0; i < 5; i++)
			System.out.println("��"); // 1�� ����
		
		System.out.println("----------------2 ���� �ݺ��� ������");
		for(int i = 0; i < 5; i++)
			System.out.print("��"); // 1�� ����
			System.out.println("");
		
		System.out.println("----------------3 ���� �ݺ���");
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print("��");
			}
			System.out.println("");
			
		}
		
		System.out.println("----------------4 ���� �ݺ���");
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("��");
			}
			System.out.println("");
		}
		
		System.out.println("----------------5 ���� �ݺ���");
		for(int i = 0; i < 5; i++) {
			for(int j = i; j < 5; j++) 
				System.out.print("��");
			System.out.println("");
		}
		
		System.out.println("----------------6 ���� �ݺ���");
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++)
				if (j >= i)	System.out.print("��");
				else System.out.print("��");
			System.out.println("");
		}
		
		System.out.println("----------------7 ���� �ݺ���");
		for(int i = 5; i >= 1 ; i--) {
			for(int j = 1; j < 6; j++)
				if (j >= i)	System.out.print("��");
				else System.out.print("��");
			System.out.println("");
		}
		

	}

}
