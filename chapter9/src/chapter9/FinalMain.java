package chapter9;

import java.text.DecimalFormat;

// final ���� : ���� ���� �Ҽ� ����.  ---- ���� �Һ� ���� (1�� 1�ð� 1�� 1���� 1���� 1�� �̶�� ����)
// final �޼��� : �������̵� �Ұ���
// final Ŭ���� : ��� �Ұ���

class Final {
	int money = 20000;
	final int day = 7, week = 4, month = 12;	// ���� �Һ�
	
	public Final() {
		
	}
}
public class FinalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Final fi = new Final();
		DecimalFormat comma = new DecimalFormat("###,###");
		fi.money = 30000;
		System.out.println("1���� �뵷 : " + comma.format(fi.money * fi.day));

	}

}
