package chapter9;

class HashCodeTest {
	int kuk = 1;	
	int eng = 1;

	public void prn() {
		System.out.println("kuk : " + kuk);
	}
}

class HashCodeTest2 {
	int kuk = 2;	
	int eng = 1;
	
	public void prn() {
		System.out.println("kuk : " + kuk);
	}
}
public class HashCodeTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��ü�� �����ϴ� ��Ҵ� ��ᰡ �ƴ϶� ���� �޸��̴�. new�� ���δ� ���ο� ��ü
		
		HashCodeTest hct1 = new HashCodeTest();
		HashCodeTest hct2 = new HashCodeTest();
		HashCodeTest2 hct3 = new HashCodeTest2();
		
		// hashcode()
		System.out.println("hct1.hashcode : " + hct1.hashCode());
		System.out.println("hct2.hashcode : " + hct2.hashCode());
		System.out.println("hct3.hashcode : " + hct3.hashCode());
	}

}
