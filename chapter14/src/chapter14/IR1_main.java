package chapter14;
/* �������̽� : ��� �޼��尡 �߻�޼���� ������
 * 			������ -----> ������·� ������
 * 			���������� ��������.
 *	  ��
 *   ��
 *   ����			immplements ��� �������� ����
 *   ��
 *   ����Ŭ����
 *   	������ ��� �޼��带 ������
 *   
 *   ����Ŭ���� ��ü = new ����(); --- ����
 *   �������̽� ��ü = new ����(); ----���� (���� �̷��������� ���ȴ�.) */
interface A {
	void display(String s);
}

class C1 implements A {
	public void display(String s) {
		System.out.println("Ŭ���� C1 ��ü �̿� : " + s);
	}
}

class C2 implements A {
	public void display(String s) {
		System.out.println("Ŭ���� C2 ��ü �̿� : " + s);
	}
}

class C3 implements A {
	public void display(String s) {
		System.out.println("Ŭ���� C3 ��ü �̿� : " + s);
	}
	public int getInt() {
		return 1000;
	}
}

public class IR1_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A memo;
		
		memo = new C1();
		memo.display("��⵵ - ���ѻ�");
		memo = new C2();
		memo.display("������ - ���ǻ�");
		memo = new C3();
		memo.display("��ȭ�� - ���ϻ�");
	}

}
