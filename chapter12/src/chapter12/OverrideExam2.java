package chapter12;

class OverB {
	void show(String str) {
		System.out.println("�θ� Ŭ������ �޼ҵ� show() ���� : " + str);
	}
}

class SubOverB extends OverB {
	void show(String str) {	//�޼���������̵� : ����Ŭ������ �޼��带 ������ �Ѵ�.
		System.out.println("�ڽ� Ŭ������ �޼ҵ� show() ���� : " + str);
	}
}
public class OverrideExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverB ob = new OverB();
		ob.show("Korea");
		
		SubOverB over = new SubOverB();
		over.show("Republic of");
		over.show("����ô׷��Ӹ����Ӥ�����");

	}

}
