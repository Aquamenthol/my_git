package chapter5;

public class ForTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outer: for(int i = 0; i <= 2; i++) {
			for (int j = 2; j >= 0; j--) {
				if (i == j) break outer;
				System.out.println("i == " + i + ", j == " + j);
			} //for
		}
	}

}
