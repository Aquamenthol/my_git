package chapter19;

import java.util.Vector;

/*		Vector
 * 			1.	ũ�Ⱑ ���� : �������� <---- Array�� ������ ���� : ��������
 * 			2.	����(Index)�� �ʿ��� ���� ���
 * 			3. ��ü�� �Է°��� int x integer O
 * 			4. ��ü�� �Է°����ϴ� 
 */
public class SearchDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name[] = {"�մ���", "�Ʒι�", "����"};	
		
		Vector v = new Vector();
		String s = "�մ���";
		
		for (int i = 0; i < name.length; i ++) v.addElement(name[i]);
		if(v.contains(s)) {
			int i  = v.indexOf(s);
			System.out.println("�ش� ��ü�� �ε����� �ֽ��ϴ�.");
		}
		else System.out.println("�ش� ��ü�� �����ϴ�.");
		
		v.removeElementAt(0);
		
		System.out.println("=====����� �� �Ŀ���======");
		
		for(int j = 0; j <v.size(); j++) {
			s = (String)v.elementAt(j);
			System.out.println("���� " + j + "��° ��Ҵ� " + s);
		}
	}

}
