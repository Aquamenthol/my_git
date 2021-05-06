package chapter3;

public class Bitwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2;
		int b = 5;
		
		int c = a|b; //2 진수 bit or
		
		// ....8421
		// 00000010
		//+00000101
		
		// 00000111 ----> 7
		
		int d = a&b; //and
		
		// 00000010
		//+00000101
		
		// 00000000 ----> 0
		
		int e = a^b; //Exclusive or
		
		// 00000010
		//+00000101
		
		// 00000111 ----> 7
		
		int i; int j;
		i = a << 2; // 좌 shift 연산
		//....8421
		//00000010
		//00001000 ----> 8
		
		j = b >> 2; // 우 shift 연산
		//....8421
		//00000101
		//00000001 ---->1
		
		System.out.println(" a = " + a);
		System.out.println(" b = " + b);System.out.println(" b = " + b);
		System.out.println(" a|b = " + c);System.out.println(" a|b = " + c);
		System.out.println(" a&b = " + d);System.out.println(" a&b = " + d);
		System.out.println(" a^b = " + e);System.out.println(" a^b = " + e);
		System.out.println(" a<<2 = " + i);System.out.println(" a<<2 = " + i);
		System.out.println(" b>>2 = " + j);System.out.println(" b>>2 = " + j);
		}
}
