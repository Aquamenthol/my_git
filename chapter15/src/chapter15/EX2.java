package chapter15;

public class EX2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("�Ű������� ���� �� ���� ��");
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		System.out.println("a = " + a + " b = " + b);
		
		try {	// �и� 0�϶����� ����ó�� �Ǿ��ִ�.
			System.out.println("a�� b�� ���� �� = " + (a / b));
		}catch (Exception e) {
			System.out.println("[���] ���ܹ߻� : " + e.toString());
		}finally {
			System.out.println("������ ������ ���� �Ǿ����ϴ�.");
		}
		
		System.out.println("������ ��ƾ�� ���� �����մϴ�.");
	}

}
