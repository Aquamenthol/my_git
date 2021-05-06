package chapter7;

import java.text.*;

class Pay {
	String name;
	int bonbong;
	int tex;
	int silsu;
}

public class PayCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DecimalFormat comma = new DecimalFormat("###,###");
//		int price1 = 100000;
//		int price2 = 100000000;
//		int price3 = 1000000000;
//		int price4 = 1000;
//		
//		System.out.println("1번 " + comma.format(price1));
//		System.out.println("2번 " + comma.format(price2));
//		System.out.println("3번 " + comma.format(price3));
//		System.out.println("4번 " + comma.format(price4));
		
		
		
		Pay p1 = new Pay();
		Pay p2 = new Pay();
		Pay p3 = new Pay();
		
		p1.bonbong = 2000000;
		p1.name = "왕눈이";
		p1.tex = (int)(p1.bonbong * 0.045 + 0.5);
		p1.silsu = p1.bonbong - p1.tex;
		
		p2.bonbong = 2500000;
		p2.name = "아로미";
		p2.tex = (int)(p2.bonbong * 0.045 + 0.5);
		p2.silsu = p2.bonbong - p2.tex;

		
		p3.bonbong = 1500000;
		p3.name = "왕눈이";
		p3.tex = (int)(p3.bonbong * 0.045 + 0.5);
		p3.silsu = p3.bonbong - p3.tex;
		
		System.out.println("-----------------------");
		System.out.println("-------12월 급여 내역-------");
		System.out.println("-----------------------");
		System.out.println("성명 : " + p1.name);
		System.out.println("본봉 : " + comma.format(p1.bonbong));
		System.out.println("세금 : " + comma.format(p1.tex));
		System.out.println("실수령액 : " + comma.format(p1.silsu));
		System.out.println("");
		
		System.out.println("-----------------------");
		System.out.println("-------12월 급여 내역-------");
		System.out.println("-----------------------");
		System.out.println("성명 : " + p2.name);
		System.out.println("본봉 : " + comma.format(p2.bonbong));
		System.out.println("세금 : " + comma.format(p2.tex));
		System.out.println("실수령액 : " + comma.format(p2.silsu));
		System.out.println("");
		
		System.out.println("-----------------------");
		System.out.println("-------12월 급여 내역-------");
		System.out.println("-----------------------");
		System.out.println("성명 : " + p3.name);
		System.out.println("본봉 : " + comma.format(p3.bonbong));
		System.out.println("세금 : " + comma.format(p3.tex));
		System.out.println("실수령액 : " + comma.format(p3.silsu));
		System.out.println("");
		}

}
