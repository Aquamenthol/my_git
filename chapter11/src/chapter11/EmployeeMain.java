package chapter11;
// call by reference ȣ�����ڿ� �������ڴ� ������ hashocde ���� ������
// �������ڸ� �����ϸ� ȣ�����ڵ� ���� ����ȴ�. (�����ǰ�) (�������ڿ� ȣ�����ڴ� ������ �޸�, ��ü1�� ����Ų��)

import java.text.DecimalFormat;

class Pay1{
	String name="";
	int pay = 0;
	int comm = 0;
	int tax = 0;
	//DecimalFormat comma = new DecimalFormat("###,###");
	
	public Pay1(String name, int pay, int comm) {
		this.name = name;
		this.pay = pay;
		this.comm = comm;
		comm = 100000;
		System.out.println("Pay1 ������ comm : " + comm);
	}
	
	public void tax() {		tax = (int)(pay * 0.05);	}
	public int earn() {
		int total = (pay + comm) - tax;
		return total;
	}
}
public class EmployeeMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat comma = new DecimalFormat("###,###");
		String name = "�Ʒι�";
		int pay = 1500000;
		int comm = 200000;
		
		System.out.println("comm������ �ʱⰪ : " + comm);
		Pay1 p = new Pay1(name, pay, comm);	// call by value
		System.out.println("main �޼ҵ� : " + comm);
	}

}
