package chapter6;

public class Gugudan_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] aa = new int[10][10];
		int i, j;

		for (i = 1; i <= 9; i++) {
			//System.out.print(i + "단\t");
			
			for(j = 1; j <= 9; j++) {
				aa[i][j] = i * j;
				//System.out.printf("%d * %d = %d\n", i, j, aa[i][j]);
				System.out.print(i + " * " + j + " = " + aa[i][j] + "\t");
			}
			System.out.println("");
		}
		System.out.println("\n 배열의 행 (가로방향) : " + aa.length);
		System.out.println("\n 배열의 열 (세로방향) : " + aa[0].length);
	}
}

			//System.out.println(i + " * " + k + " = " + val);

