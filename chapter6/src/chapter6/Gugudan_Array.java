package chapter6;

public class Gugudan_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] aa = new int[10][10];
		int i, j;

		for (i = 1; i <= 9; i++) {
			//System.out.print(i + "��\t");
			
			for(j = 1; j <= 9; j++) {
				aa[i][j] = i * j;
				//System.out.printf("%d * %d = %d\n", i, j, aa[i][j]);
				System.out.print(i + " * " + j + " = " + aa[i][j] + "\t");
			}
			System.out.println("");
		}
		System.out.println("\n �迭�� �� (���ι���) : " + aa.length);
		System.out.println("\n �迭�� �� (���ι���) : " + aa[0].length);
	}
}

			//System.out.println(i + " * " + k + " = " + val);

