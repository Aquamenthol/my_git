package chapter9;

// class ���� <=== �ٸ� Ŭ���������� ��밡��
// ��� ���� (��������) <==== ���������μ� Ŭ���� ������ ��� �Լ����� ��� ȣ�� ���� ����
// ���� <--- �Լ� ���ο��� ����Ǹ�, ������(�Լ�, �޼ҵ�) ������ �� �Ѵ�.

/* ----------------------------------------------------- */

// �⺻�� ���� : 8���� int, doublue
// ��ü�� ���� : ũ�Ⱑ ������ 4byte
// �迭 ���� : (������ ũ�Ⱑ �ݺ�, �⺻�������� ����?)
// ��ü �迭 ���� : (

public class VariableMain {
	
	String movie = "Ʈ����";
	
	public void show() {	
		System.out.println("show �޼ҵ� ���� : " + movie);
	}
	
	public void title() {
		String movie = "�ٶ��� ����";
		System.out.println("title �޼ҵ� ���� : " + movie);
		System.out.println("title �޼ҵ� ����  (this.movie) : " + this.movie);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		VariableMain v = new VariableMain();
		v.show();
		v.title();
	}

}
