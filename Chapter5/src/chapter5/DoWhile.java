package chapter5;
// ������ ���� ���ȿ� ����ǰ�
// while������ �ٸ���, ������ ó������ �����̾ 
// ó���ѹ��� ������ �����ϰ� �ȴ�.
public class DoWhile {
	public static void main(String[] args) {
		int j = 1; // �ʱⰪ�� ���ǿ� ���� (j<0) �Ǵ��� �ѹ��� ������ ����
		
		do { // do�κ��� �ϴ� �ѹ��� �����ؾ��Ѵ�. �ݺ��� ���๮ i++; ����ġ
			System.out.println("��ȣ : " + j); //1
			j++; //2
			if (j == 5) break;
		}
		while(j < 0);
		System.out.println("-------END-------");
		System.out.println("do while �� �������� j �� �� : " + j);
	}

}
