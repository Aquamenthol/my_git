package testjava;

public class Ex_03_06 {
		//   "\" �������� Ż�⹮�ڿ� ���� �˾ƺ���.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 5.123456789;
		System.out.printf("\n�ٹٲٱ� ����\n");
		System.out.printf("��Ű(�鿩����)\t ����\n");
		System.out.printf("�̰���\r����ϴ�\n");
		System.out.printf("���ڰ� \"����\"�Ǵ� ȿ�� \n");
		System.out.printf("\\\\\\ �������� 3�� ��� \n");
		
		System.out.printf("%f\n", a); 		// %f �Ҽ��� 6�ڸ����� ����Ѵ�.
		
		System.out.printf("%7.1f\n", a); 	// %7.1f �Ҽ��� �Ʒ�ù°�ڸ��� ���
											// �Ҽ��� �Ʒ� ��° �ڸ����� �ݿø�
		
		System.out.printf("%7.3f\n", a);	// %7.3f �Ҽ��� �Ʒ� ��° �ڸ����� ���
											// ���� ������ �ڸ����� ������쿡�� 0���� ä���.

	}

}