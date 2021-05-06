package chapter12;

public class GarbageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Garbage [] ga = new Garbage[10];	// ��ü �迭 ����
		
		for(int i = 0; i < ga.length; i++)
			ga[i] = new Garbage(i);			// ��ü�� ����
		for(int i = 0; i < ga.length; i++)
			ga[i] = null;					// �޸� ���� ����
		
		System.gc();	// finalize �ڵ�ȣ��
	}
}

class Garbage {
	int objNo;
	
	public Garbage(int n) {
		objNo = n;
		System.out.println("Garbage class " + objNo + "�� ����� �����ϴ�." );
	}
	protected void finalize() throws Throwable {
		System.out.println("Garbage class" + objNo + "���� ���̴� �޸𸮰� �����Ǿ����ϴ�.");
		super.finalize();	// callback method 
	}
}