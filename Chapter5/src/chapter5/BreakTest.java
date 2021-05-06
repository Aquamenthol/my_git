package chapter5;

public class BreakTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i <= 2; i++)
			for (int j = 2; j >= 0; j--) {
				if (i == j) break; // i = j 같은수 일경우 출력 하지마라
									//break문은 {} 블록은 1개만 빠져나가라
				System.out.println("i == " + i + ", j == " + j);
			}

	}

}
