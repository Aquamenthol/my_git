package chapter5;

public class ContinueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {
				if (i == j) continue; // i == j 가 같을때 아랫문장을 실행하지 않는다.
				System.out.println("i == " + i + ", j == " + j);
			}
		}
	}

}
