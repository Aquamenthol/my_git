package chapter4;

import java.util.Scanner;

public class SwitchTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ƽ�Ű�ڵ� 7bit��ǻ�� ���� ���� : ������ ǥ�� �Ǵ� ����.
		String num;
		System.out.println("���ڸ� �Է����ּ��� : ");
		Scanner sc = new Scanner(System.in);
		num = sc.next();
		
		switch (67) { // �ƽ�Ű�ڵ忡�� 65 = 'A'
		case 'A' : System.out.println("�Էµ� �ڵ�� A �Դϴ�."); break;
		case 'B' : System.out.println("�Էµ� �ڵ�� B �Դϴ�."); break;
		case 'C' : System.out.println("�Էµ� �ڵ�� C �Դϴ�."); break;
		case 'D' : System.out.println("�Էµ� �ڵ�� D �Դϴ�."); break;
		default: System.out.println("�ڵ�� A���� D���� �Է��ؾ� �մϴ�.");
		}
//		System.out.println("5 + 2 = " + 3 + 4);
//		System.out.println("5 + 2 = " + (3 + 4));
//		System.out.println("5 + 2 = " + 1 + 4);
//		System.out.println("5 + 2 = " + (1 + 4));
	}

}
