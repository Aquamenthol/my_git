package chapter3;

public class IncDec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 1;
		int y = x++; // 후위연산자
		// y =
		// x = x + 1
		
		System.out.println("x 의 값은 " + x); //2
		System.out.println("y 의 값은 " + y); //1
		
		x = 1;
		int z = ++x; // 전위연산자
		//x = x +
		//z = x
		
		System.out.println("x 의 값은 " + x); //2
		System.out.println("z 의 값은 " + z); //2
		x = 1;
		x++; //++x;
		z = x;
		System.out.println("-------------------");
		System.out.println("x 의 값은 " + x); //2
		System.out.println("z 의 값은 " + z); //2
		}

}
