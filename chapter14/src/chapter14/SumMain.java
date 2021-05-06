package chapter14;

/*	�߻�Ŭ����?
 * 	1. �߻�޼��带 �����ϰ� �ִ� Ŭ���� �̴�.
 *  �߻�޼���?
 *  	1) ���� �ְ� ������ ���� �޼��� �̴�.
 *  		����(prototype) �ְ�, {	}�� ����.
 *  			ex) public int add (int a, int b); <---- {	} �� ����.(ũ�Ⱑ ����, ũ�⸦ ����) �߻�޼���
 *  		��
 *  	        ���
 *  		��
 *  		2) �߻�޼��� ��ӹ޾Ƽ� ���� Overriding�ؼ� ����Ѵ�.
 *  		Concrete class concrete = new ������();
 *  
 *  	// �߻� Ŭ������ �ڱ� �ڽ��� �ν��Ͻ��� ���� �Ұ���
 *  		�߻�Ŭ���� ��ü = new ������(); 			---- �Ұ���
 *  		Concrete class ��ü = new ������(); 	----- �����̰� ��� 
 *			Concrete class ��ü = new ������();		----- ����
 *
 *	-----------------�߻� Ŭ������ �뵵-----------------------
 *	��ġ��ŷ, ���赵, ���� ������ �ϴ� Ŭ������ �߻� Ŭ������ �����.
 *		
 *	�߻�Ŭ����			--->	Concrete				
 *	---�ڵ���---				---K5---
 *	����						���� : 14in
 *	����						���� : 2000cc
 *	����						���� : ��������
 *	----��� �־���Ұ͵��� 		
 *		�߻������� ���			
 *		�߻�Ŭ������ ����⺻�� �Ǵ� 		Concrete
 *		������ ����						---��Ƽ��---
 *								����, ����, ����
 * 
 * 	// �߻�Ŭ�������� "abstract class" ��� �ִ´�.
 */
abstract class Sum {
	public abstract String toString();
	
	public String sum(int i, int k) {
		int sum = i + k;
		return " " + sum;
	}
}

class Sum_s1 extends Sum {
	public String toString() {
		return "class Sum_1 s1 extends Sum";
	}
}

class Sum_s2 extends Sum {
	public String toString() {
		return "class Sum_2 s2 extends Sum";
	}
}
public class SumMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sum_s1 s1 = new Sum_s1();
		System.out.println(s1.sum(10, 20));
		System.out.println(s1.toString());
		
		Sum_s2 s2 = new Sum_s2();
		System.out.println(s2.sum(100, 200));
		System.out.println(s2.toString());
	}

}
