package testjava;

import java.text.DecimalFormat;
import java.util.*;

class button {
	DecimalFormat comma = new DecimalFormat("###,##0");

	public void add(int x, int y) { // 더하기
		int c = x + y;
		System.out.println("x + y = " + comma.format(c));
	}

	public void sub(int x, int y) { // 빼기
		int c = x - y;
		System.out.println("x - y = " + comma.format(c));
	}

	public void mul(int x, int y) { // 곱하기
		int c = x * y;
		System.out.println("x * y = " + comma.format(c));
	}

	public void div(int x,int y){  // 나누기
        int c = x / y;
        System.out.println("x / y = "+ comma.format(c));
    }
}

public class ClacTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정수값만 계산하는 계산기
		Scanner sc = new Scanner(System.in);

		System.out.println("x의 정수를 입력해주세요");
		int x = sc.nextInt();

		System.out.println("계산한 연산을 입력해주세요");
		String boho = sc.next();

		System.out.println("y의 정수를 입력해주세요");
		int y = sc.nextInt();

		button bt = new button();

		// 연산 +-*/ 이 눌려진것을 확인하여 switch문으로 들어간다.
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
