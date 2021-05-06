package chapter11;
// call by reference 호출인자와 수신인자는 동일한 hashocde 값을 가진다
// 수신인자를 변경하면 호출인자도 같이 변경된다. (변수의값) (수신인자와 호출인자는 동일한 메모리, 객체1를 가르킨다)

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
		System.out.println("Pay1 생성자 comm : " + comm);
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
		String name = "아로미";
		int pay = 1500000;
		int comm = 200000;
		
		System.out.println("comm변수의 초기값 : " + comm);
		Pay1 p = new Pay1(name, pay, comm);	// call by value
		System.out.println("main 메소드 : " + comm);
	}

}
