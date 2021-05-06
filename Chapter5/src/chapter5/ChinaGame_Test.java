package chapter5;

public class ChinaGame_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 2; i <= 9; i++) {
			if ((i % 2) == 0) {	sum += i; }
		}
		
			System.out.println(""+ sum);
	}

}
