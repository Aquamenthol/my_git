package chapter11;

// ���ڿ��� ����̹Ƿ� �޸𸮻� ���� �����ʹ� 1���� �����Ѵ�.

class GenClass {
	private String name;
	private int num;
	// String�� ���ڷ� ����ϰ� �Ǵ� ���
	public GenClass (String a, int b) {
		name = a;
		num = b;
	}
	
	public void rename(String a) {
		String str = a;
		Person ar = new Person("wonwoo");
		System.out.println("\nrename()--------------------");
		System.out.println("rename() : " + ar);
		System.out.println("rename() a.�ؽ��ڵ� : " + ar.hashCode());
		
		str = "��" + str;
		System.out.println("\nrename() ���ڿ� ����----------------------");
		System.out.println("rename() " + str);
		System.out.println("rename() a.�ؽ��ڵ� : " + str.hashCode());
	}
}
public class NonThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenClass t1 = new GenClass("first", 1);
		
		String sc= "��~��~�α�";
		System.out.println("\nmain()-----------------");
		System.out.println("main() sc : " + sc);
		System.out.println("main() sc.�ؽ��ڵ� : " + sc.hashCode());
		
		t1.rename(sc);
		System.out.println("\nmain() rename(sc)��-----------------");
		System.out.println("main() sc : " + sc);
		System.out.println("main() sc.�ؽ��ڵ� : " + sc.hashCode());
		

	}

}
