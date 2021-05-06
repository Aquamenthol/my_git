package chapter15;

class Throw_Test {
	// 1. ȣ���� �ʿ��� ���ܸ� ó���ϵ��� ��
	public void add (int a, int b) throws Exception {
		if (b == 0) throw new Exception("add () �װ� ó����");
		System.out.println(a + b);
	}
	
	// 2. ������ ���ܸ� ó���Ѵ�.
	public void sub(int a, int b) {
		try {
			if (b == 0) throw new Exception();
			System.out.println(a - b);
		}
		catch (Exception e) {
			System.out.println("throw�� �ɷȳ� ���� ó����" + e.toString());
		}
	}
	
//	3 throw�� try ~ catch ���� �ִ� ��� try�� �켱���� ���´�. throws�� ����
//	3 �Ѵ� ó���ϵ��� �Ϸ��� catch ������ throw�� �����ϸ� ȣ���ʿ����� �����ܸ� ������.
	public void mul(int a, int b) throws Exception {
		try {
			if (b == 0) throw new Exception(" mul() ���⼭ ���� �߻�");
			System.out.println(a * b);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("try�� �켱���� �����´�." + e.toString());
			// ȣ���ʿ��� ���ܸ� ������
			throw e;
		}
	}
}
public class ThrowsTest {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		int a = 100;
		int b = 0; // 0�� ��� ���� �߻�
		Throw_Test tt = new Throw_Test();
		try {
			//tt.add(a, b);
			//tt.sub(a, b);
			tt.mul(a, b);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("���� Ŭ������ ����ó��");
			System.out.println(e.toString());
		}
	}

}
