package chapter11;

// 문자열은 상수이므로 메모리상에 동일 데이터는 1개만 존재한다.

class GenClass {
	private String name;
	private int num;
	// String을 인자로 사용하게 되는 경우
	public GenClass (String a, int b) {
		name = a;
		num = b;
	}
	
	public void rename(String a) {
		String str = a;
		Person ar = new Person("wonwoo");
		System.out.println("\nrename()--------------------");
		System.out.println("rename() : " + ar);
		System.out.println("rename() a.해시코드 : " + ar.hashCode());
		
		str = "★" + str;
		System.out.println("\nrename() 문자열 변경----------------------");
		System.out.println("rename() " + str);
		System.out.println("rename() a.해시코드 : " + str.hashCode());
	}
}
public class NonThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenClass t1 = new GenClass("first", 1);
		
		String sc= "대~한~민국";
		System.out.println("\nmain()-----------------");
		System.out.println("main() sc : " + sc);
		System.out.println("main() sc.해시코드 : " + sc.hashCode());
		
		t1.rename(sc);
		System.out.println("\nmain() rename(sc)후-----------------");
		System.out.println("main() sc : " + sc);
		System.out.println("main() sc.해시코드 : " + sc.hashCode());
		

	}

}
