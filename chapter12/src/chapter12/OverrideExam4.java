package chapter12;

// ����� ������ �κ�
class OverD {
	void show (int k) {
		System.out.println("OVerD : " + (k * 10));
	}
	void prn (int i) {
		System.out.println("OverD : prn() " + i);
	}
}

class SubOverD extends OverD {
	void show (int i) {
		System.out.println("sub show : " + (i * 10000));
	}
	void prn (String s) {
		System.out.println("sub prn(String s) : " + s);
	}
	void scr() {
		System.out.println("sub scr() : ");
	}
}
public class OverrideExam4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		������
		OverD od = new SubOverD();	// new�� �ٸ� ��ü�� ���� (heap�޸𸮿���)
			// OverD od = new OverD();	// od�� SubOverD()�� �ǰ� OverD�� �ȴ�.
		od.show(1);		// �θ�Ŭ������ show(int k)�� ���ٰ� �ڽ�Ŭ������ show(int i)�� �����Ѵ�.
		od.prn(1);		 
//		 �θ�Ŭ������ prn(int i)�� ���ٰ� 
//		�ڽ�Ŭ������ prn(String s)�� ���� ������ �ٸ���
//		�θ�Ŭ������ prn(int i)�� �����Ѵ�.
		
//		��ü�� ��ȯ	(�θ� �ڽ��� ����� �θ��� ���ؼ� �Ѵ�.)
		SubOverD sod = (SubOverD)od;	// 28�� heap ������ ���������� SubOverD�� ����
		sod.show(1);
		sod.prn("s");
		sod.scr();
	}
	
//	�⺻ ����ȯ : ū���� �۰� �ٲٴ� ��
//	��ü  ����ȯ : ������ü(���� ����)�� ������ü(ũ��)�� �ٲٴ� ���̴�.

}
