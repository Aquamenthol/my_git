package testjava;

import java.text.DecimalFormat;
import java.util.*;

class button {
	DecimalFormat comma = new DecimalFormat("###,##0");

	public void add(int x, int y) { // ���ϱ�
		int c = x + y;
		System.out.println("x + y = " + comma.format(c));
	}

	public void sub(int x, int y) { // ����
		int c = x - y;
		System.out.println("x - y = " + comma.format(c));
	}

	public void mul(int x, int y) { // ���ϱ�
		int c = x * y;
		System.out.println("x * y = " + comma.format(c));
	}

	public void div(int x,int y){  // ������
        int c = x / y;
        System.out.println("x / y = "+ comma.format(c));
    }
}

public class ClacTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �������� ����ϴ� ����
		Scanner sc = new Scanner(System.in);

		System.out.println("x�� ������ �Է����ּ���");
		int x = sc.nextInt();

		System.out.println("����� ������ �Է����ּ���");
		String boho = sc.next();

		System.out.println("y�� ������ �Է����ּ���");
		int y = sc.nextInt();

		button bt = new button();

		// ���� +-*/ �� ���������� Ȯ���Ͽ� switch������ ����.
		switch (boho) {
		case "+":
			bt.add(x, y);
			break;

		case "-":
			bt.sub(x, y);
			break;

		case "*":
			bt.mul(x, y);
			break;

		case "/":
			bt.div(x, y);
			break;
		}

	}

}