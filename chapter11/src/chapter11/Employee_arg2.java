package chapter11;

class Pay2 {
	String name = ""; int pay, comm, tax = 0;
	
	public Pay2(String name, int pay, int comm) {
		this.name = name;
		this.pay = pay;
		this.comm = comm;
	}
	
	public int tax() {
		tax = (int)(pay * 0.03);
		return tax;
	}
	public int earn() {
		int total = (pay + comm) - tax;
		return total;
	}
}

class PrintPay2 {
	public static void printPay(Pay2 pay) {	// 객체를 가인자로 사용
		System.out.println("-----------------");
		System.out.println("성명 : " + pay.name);
		System.out.println("본봉 : " + pay.pay);
		System.out.println("보너스 : " + pay.comm);
		System.out.println("세금 : " + pay.tax);
		System.out.println("실 수령액 : " + pay.earn());
		pay.name = "아로미";	pay.pay = 1500000; pay.comm = 100000;
		pay.tax = 5000;
		System.out.println("-----------------");
		System.out.println("해쉬 코드() " + pay.hashCode());
	}
}

public class Employee_arg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pay2 p = new Pay2("왕눈이", 10000, 1000);
		
		p.tax();
		p.name = "나다"; p.pay = 2500000; p.comm = 2100000;
		
		PrintPay2.printPay(p);	// call by reference
		PrintPay2.printPay(p);	// 30번줄 세금 5000원
		System.out.println("해쉬 코드() " + p.hashCode());
	}

}
