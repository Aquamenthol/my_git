package chapter5;

public class StatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("----------------1 단일 반복문 줄바꿈");
		for(int i = 0; i < 5; i++)
			System.out.println("★"); // 1번 예제
		
		System.out.println("----------------2 단일 반복문 연속적");
		for(int i = 0; i < 5; i++)
			System.out.print("★"); // 1번 예제
			System.out.println("");
		
		System.out.println("----------------3 이중 반복문");
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print("★");
			}
			System.out.println("");
			
		}
		
		System.out.println("----------------4 이중 반복문");
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("★");
			}
			System.out.println("");
		}
		
		System.out.println("----------------5 이중 반복문");
		for(int i = 0; i < 5; i++) {
			for(int j = i; j < 5; j++) 
				System.out.print("★");
			System.out.println("");
		}
		
		System.out.println("----------------6 이중 반복문");
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++)
				if (j >= i)	System.out.print("★");
				else System.out.print("☆");
			System.out.println("");
		}
		
		System.out.println("----------------7 이중 반복문");
		for(int i = 5; i >= 1 ; i--) {
			for(int j = 1; j < 6; j++)
				if (j >= i)	System.out.print("★");
				else System.out.print("☆");
			System.out.println("");
		}
		

	}

}
