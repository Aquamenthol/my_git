package chapter5;

public class BreakTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i <= 2; i++)
			for (int j = 2; j >= 0; j--) {
				if (i == j) break; // i = j ������ �ϰ�� ��� ��������
									//break���� {} ����� 1���� ����������
				System.out.println("i == " + i + ", j == " + j);
			}

	}

}
