package chapter12;

class OverC {
	int show (int k) {
		return k;
	}
}

class SubOverC extends OverC {
	// �������̵��� float show (int i) ��ȯ�� ���� �Ұ���
	int show (int i) {
		return i * 100;
	}
}
public class OverrideExam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverC ob = new OverC();			//���� Ŭ����
		int i = ob.show(10);
		
		SubOverC over = new SubOverC();	// ���� Ŭ����
		float j = over.show(10);
		
		System.out.println("�θ� i : " + i);
		System.out.println("�ڽ� j : " + j);
		//System.out.println("�ڽ� k : " + z);

	}

}
