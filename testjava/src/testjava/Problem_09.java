package testjava;

import java.util.Scanner;

public class Problem_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int money, c500, c100, c50, c10;
		
		System.out.println("��ȯ�� ����???");
		money = s.nextInt();
		
		c500 = money / 500;
		money %= 500;
		
		c100 = money / 100;
		money %= 100;
		
		c50 = money / 50;
		money %= 50;
		
		c10 = money / 10;
		money %= 10;
		
		System.out.println("�����¥�� ����" + c500);
		System.out.println("���¥�� ����" + c100);
		System.out.println("���ʿ�¥�� ����" + c50);
		System.out.println("�ʿ�¥�� ����" + c10);
		
		System.out.println("�ٲ��� ���� �� ====> " + money);
	}

}
