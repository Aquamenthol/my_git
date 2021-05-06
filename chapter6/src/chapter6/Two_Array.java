package chapter6;

public class Two_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]m = {{1,2}, {3,4}, {5,6}, {7, 8}, {9,10}};
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[0].length; j++) {
				System.out.println("m["+i+"] n ["+j+"] = "+m[i][j]);
			}
		}
	}

}
