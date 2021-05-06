package chapter12;

class OverC {
	int show (int k) {
		return k;
	}
}

class SubOverC extends OverC {
	// 오버라이딩시 float show (int i) 반환형 변경 불가능
	int show (int i) {
		return i * 100;
	}
}
public class OverrideExam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverC ob = new OverC();			//상위 클래스
		int i = ob.show(10);
		
		SubOverC over = new SubOverC();	// 하위 클래스
		float j = over.show(10);
		
		System.out.println("부모 i : " + i);
		System.out.println("자식 j : " + j);
		//System.out.println("자식 k : " + z);

	}

}
