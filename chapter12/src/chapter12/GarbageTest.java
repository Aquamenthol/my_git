package chapter12;

public class GarbageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Garbage [] ga = new Garbage[10];	// 객체 배열 변수
		
		for(int i = 0; i < ga.length; i++)
			ga[i] = new Garbage(i);			// 객체의 생성
		for(int i = 0; i < ga.length; i++)
			ga[i] = null;					// 메모리 참조 삭제
		
		System.gc();	// finalize 자동호출
	}
}

class Garbage {
	int objNo;
	
	public Garbage(int n) {
		objNo = n;
		System.out.println("Garbage class " + objNo + "이 만들어 졌습니다." );
	}
	protected void finalize() throws Throwable {
		System.out.println("Garbage class" + objNo + "에서 쓰이던 메모리가 수집되었습니다.");
		super.finalize();	// callback method 
	}
}
