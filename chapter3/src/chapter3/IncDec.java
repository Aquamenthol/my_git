package chapter3;

public class IncDec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 1;
		int y = x++; // ����������
		// y =
		// x = x + 1
		
		System.out.println("x �� ���� " + x); //2
		System.out.println("y �� ���� " + y); //1
		
		x = 1;
		int z = ++x; // ����������
		//x = x +
		//z = x
		
		System.out.println("x �� ���� " + x); //2
		System.out.println("z �� ���� " + z); //2
		x = 1;
		x++; //++x;
		z = x;
		System.out.println("-------------------");
		System.out.println("x �� ���� " + x); //2
		System.out.println("z �� ���� " + z); //2
		}

}
