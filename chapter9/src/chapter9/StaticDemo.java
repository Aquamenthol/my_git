package chapter9;

class Box {
	// ó�� �Լ�
	int cnt = 0;
	static long boxID = 0; // Ŭ���� ����
	
	public Box() { // ������
		//long count = 0; // �����ϰ� �ִ� ����
		System.out.println("cnt	: " + ++cnt);
		System.out.println("BoxID	: " + ++boxID);
		//System.out.println();
	}
}
public class StaticDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box mybox1 = new Box();
		Box mybox2 = new Box();
		Box mybox3 = new Box();
		Box mybox4 = new Box();
	}

}
