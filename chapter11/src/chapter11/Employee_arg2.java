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
	public static void printPay(Pay2 pay) {	// ��ü�� �����ڷ� ���
		System.out.println("-----------------");
		System.out.println("���� : " + pay.name);
		System.out.println("���� : " + pay.pay);
		System.out.println("���ʽ� : " + pay.comm);
		System.out.println("���� : " + pay.tax);
		System.out.println("�� ���ɾ� : " + pay.earn());
		pay.name = "�Ʒι�";	pay.pay = 1500000; pay.comm = 100000;
		pay.tax = 5000;
		System.out.println("-----------------");
		System.out.println("�ؽ� �ڵ�() " + pay.hashCode());
	}
}

public class Employee_arg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pay2 p = new Pay2("�մ���", 10000, 1000);
		
		p.tax();
		p.name = "����"; p.pay = 2500000; p.comm = 2100000;
		
		PrintPay2.printPay(p);	// call by reference
		PrintPay2.printPay(p);	// 30���� ���� 5000��
		System.out.println("�ؽ� �ڵ�() " + p.hashCode());
	}

}
