package testjava;

import java.util.Scanner;

public class Problem_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int year;
		
		System.out.println("������ �Է��ϼ��� : ");
		year = s.nextInt();
		
		if(((year % 4 ==0) && (year % 100 != 0)) || (year % 400 == 0)) {
			//������ ������ 4�� ������ �������� 100���� ������ �������� �ʾƾ� �ϸ� �Ǵ� 400���� ������ ��������.
			System.out.println(year + "���� �����Դϴ�.");
		}
		else
			System.out.println(year + "���� ������ �ƴմϴ�.");

	}

}

/* line.separator ���� �ڵ��ٹٲ� (����ӽ�)*/
