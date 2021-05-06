package chapter9;

class Box {
	// 처리 함수
	int cnt = 0;
	static long boxID = 0; // 클래스 변수
	
	public Box() { // 생성자
		//long count = 0; // 사용안하고 있는 변수
		System.out.println("cnt	: " + ++cnt);
		System.out.println("BoxID	: " + ++boxID);
		//System.out.println();
	}
}
public class StaticDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box mybox1 = new Box();
		Box mybox2 = new Box();
		Box mybox3 = new Box();
		Box mybox4 = new Box();
	}

}
