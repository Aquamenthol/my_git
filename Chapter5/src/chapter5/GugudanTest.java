package chapter5;

public class GugudanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 9; i+=3) {
			System.out.println(" "+i+"´Ü\t\t" + (i+1) + "´Ü\t\t" + (i+2) + "´Ü");
			System.out.println("-----------------------------------");
			for(int j = 1; j <= 9; j++) {
				System.out.print(i+" * "+j+" = "+i*j+"\t");
				System.out.print((1+i)+" * " +j+" = " +(i+1)*j+" \t ");
				System.out.print((i+2)+" * " +j+" = " +(i+2)*j);
				System.out.println("");
			}
			System.out.println("");
		}
		int a = 0;
		a = 2^8;
		System.out.println("2ÀÇ 8½Â" + a);
	}

}
