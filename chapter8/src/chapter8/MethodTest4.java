package chapter8;

public class MethodTest4 {

	int kuk, eng, tot = 0;
	float avg = 0.0f;
	
	public MethodTest4(int kuk, int eng) {
		this.kuk = kuk;
		this.eng = eng;
	}
	
	public void calcTot() {	tot = kuk + eng;	}
	public void calcAvg() {	avg = tot / 2.0f;	}
	
	public void prn() {
		System.out.println("���� : " +  kuk);
		System.out.println("���� : " +  eng);
		System.out.println("���� : " +  tot);
		System.out.println("��� : " +  avg);
	}
	
	public static void main(String []args) {
		
		MethodTest4 mt = new MethodTest4(100, 90);
		
		mt.calcTot();	// ���� �Լ�  ȣ��
		mt.calcAvg();	// ��� �Լ� ȣ��
		
		mt.prn();		// ����Լ� ȣ��
	}
}