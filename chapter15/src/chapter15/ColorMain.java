package chapter15;
// interface�� ���߱���(���߻��)�� ����
// ���߱����� �Ϸ��� ����Ŭ���� ��ü = new ������ (); ���������� �������� �ʴ´�.

interface Green {	public String greenColor();	}

interface Red {		public String redColor();	}

class Greenmp implements Green {
	public String greenColor() {
		return "�ʷϻ��Դϴ�.��";
	}
}

class Redmp implements Red {
	public String redColor() {
		return "������ �Դϴ�.��";
	}
}


// ���߻�� ����
class Color implements Green, Red {
	
	public String greenColor() {	return "�ʷϻ��Դϴ�.";		}
	public String redColor() {		return "�������Դϴ�.";		}	

}

public class ColorMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Green g = new Greenmp();
		System.out.println(g.greenColor());
		
		Red r = new Redmp();
		System.out.println(r.redColor());
		
		Color c = new Color();
		System.out.println(c.greenColor());
		System.out.println(c.redColor());
	}
}
