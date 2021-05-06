package chapter13;
/*	* super 	: ����Ŭ������ �ν��Ͻ�
 * 	* super() 	: ����Ŭ������ ������
 *  * super(����)	: ����Ŭ������ ���ڰ� �ִ� ������
 *  
 *  this 	: ���� Ŭ������ �ν��Ͻ�
 *  this()	: ����Ŭ������ ������
 *  this(����) : ����Ŭ������ ���ڰ� �ִ� ������ 
 *  
 *  ��Ӱ��迡���� ���� Ŭ������ �ν��Ͻ��� �����Ҷ�, ���� Ŭ������ �����ڰ� ���� �۵��Ѵ�. ����� ȣ���Ͽ� ���� �Ҽ��� �ְ�,
 *  ���� �����ڸ� ȣ������ ������ �⺻�����ڰ� �ڵ����� ȣ��ȴ�.
 *  
 *  ���� �ν��Ͻ��� �����Ҷ� ,�ʱ�ȭ �Ϸ��� ������
 *  ��������� ��������� �������� �ִ� ��� �ݵ�� ���� ����� ���� �ʱ�ȭ �ϰ� 
 *  ���߿� ������ ����� �ʱ�ȭ �Ѵ�.
 *  	���� super(����)
 *  	���� this.��� = ����	*/
class TV{
	public TV() {
		System.out.print("TV");
	}
}

class Movie extends TV {
	String part = "";
	
	public Movie() {	}
	
	public Movie(String part) {
		this.part = part;
		System.out.print("\tMovie");
	}
}

class Comedy extends Movie {
	String time = "";
	String name = "";
	
	public Comedy() {	}
	public Comedy(String time, String name, String part) {
		super(part);
		this.time = time;
		this.name = name;
		System.out.print("\tComedy");
	}
}
public class MovieTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comedy com = new Comedy("21:00", "���ĵ�", "�ѱ���ȭ");
		System.out.print("\n" + com.time);
		System.out.print("\t" + com.name);
		System.out.print("\t" + com.part);
		System.out.println("");
		
		Comedy com2 = new Comedy();
		com2.time = "17:00";
		com2.name = "������ ����";
		com2.part = "�ѱ� ��ȭ";
		System.out.print("\n" + com2.time);
		System.out.print("\t" + com2.name);
		System.out.print("\t" + com2.part);
		
	}

}
