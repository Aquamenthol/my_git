package chapter4;

import java.util.Scanner;

public class SwitchTest {
	// ������ ��ɾ� �߿��� �ϳ��� ���� �Ͽ� ���� �Ҷ� ���
	// ��Ģ : �ܼ� �� ��
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// break�� �ڽ��� ���ΰ� �ִ� ���� ���������� break; �Ѵ�.
		int num = 0;
		System.out.println("���ڸ� �Է����ּ��� : ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		switch(num) {
		case 1 : System.out.println("1 �Դϴ�."); break; 											
		case 2 : System.out.println("2 �Դϴ�."); break;
		case 3 : System.out.println("3 �Դϴ�."); break;
		case 4 : System.out.println("4 �Դϴ�."); break;
		default : System.out.println("1���� 4���� �Է��ؾ� �մϴ�.");
		}

	}

}
