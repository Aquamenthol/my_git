package chapter9;

// Ŭ���� ������ �⺻ �����ڰ� ���°�� main������ ȣ���ϸ� "�ڵ����� �⺻�����ڰ� ����"�� �ȴ�.
// Ŭ������ ���ڰ� �ִ� �����ڰ� �����ϸ�, �⺻�����ڴ� �ڵ����� ����� ���� �ʴ´�.

class School2 {
	int kuk, eng, tot = 0;
	
	// public School2(){	}	�⺻ �������� ����
	
	public int hap() {
		tot = kuk + eng;
		return tot;
	}
}
public class SchoolMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		School2 sc2 = new School2();
		sc2.kuk = 90;
		sc2.eng = 100;
		
		System.out.println("hap : " + sc2.hap());

	}

}
