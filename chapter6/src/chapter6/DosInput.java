package chapter6;

import java.text.DecimalFormat;

public class DosInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DecimalFormat comma = new DecimalFormat("###, ##0");
		String cs1;
		String cs2;
		
		String s1 = args[0];
		
		int i1 = Integer.parseInt(args[1]);
		cs1 = comma.format(i1);
		
		int i2 = Integer.parseInt(args[1]);
		cs2 = comma.format(i2);
		
		System.out.println("args.length : " + args.length);
		System.out.println("성명 : " + s1);
		System.out.println("급여 : " + cs1);
		System.out.println("세금 : " + cs2);
		System.out.println("실수령액 : " + comma.format(i1 - i2));

	}

}
