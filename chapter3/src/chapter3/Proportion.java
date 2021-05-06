package chapter3;

public class Proportion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 12, j = 27;
		
		System.out.println("i : " + i + ", j : " + j);
		System.out.println("----------------------------");
		
		i += j;
		System.out.println("i : " + i + ", j : " + j);
		System.out.println("i += j : " + i);
		System.out.println("----------------------------");
		
		i -=j;
		System.out.println("i : " + i + ", j : " + j);
		System.out.println("i -= j : " + i);
		System.out.println("----------------------------");
		
		i *= j;
		System.out.println("i : " + i + ", j : " + j);
		System.out.println("i *= j : " + i);
		System.out.println("----------------------------");
		
		i /= j;
		System.out.println("i : " + i + ", j : " + j);
		System.out.println("i /= j : " + i);
		System.out.println("----------------------------");
		
		i %= j;
		System.out.println("i : " + i + ", j : " + j);
		System.out.println("i %= j : " + i);

	}

}
