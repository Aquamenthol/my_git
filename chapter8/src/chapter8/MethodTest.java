package chapter8;

public class MethodTest {
	String name = "";
	int kuk, eng, tot = 0;
	float avg = 0.0f;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodTest mt = new MethodTest();
		
		mt.kuk = 100;
		mt.eng = 90;
		
		mt.tot = mt.kuk + mt.eng;
		mt.avg = mt.tot / 2;
		
		System.out.println("???? : " +mt.kuk);
		System.out.println("???? : " +mt.eng);
		System.out.println("???? : " +mt.tot);
		System.out.println("???? : " +mt.avg);

	}

}
