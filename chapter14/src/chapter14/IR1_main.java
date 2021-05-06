package chapter14;
/* 인터페이스 : 모든 메서드가 추상메서드로 구성됨
 * 			변수는 -----> 상수형태로 존재함
 * 			영역정보가 전혀없다.
 *	  ㅣ
 *   ㅣ
 *   적용			immplements 라고 다중적용 가능
 *   ㅣ
 *   구현클래스
 *   	적용한 모든 메서드를 재정의
 *   
 *   구현클래스 객체 = new 구생(); --- 가능
 *   인터페이스 객체 = new 구생(); ----가능 (거의 이런형식으로 사용된다.) */
interface A {
	void display(String s);
}

class C1 implements A {
	public void display(String s) {
		System.out.println("클래스 C1 객체 이용 : " + s);
	}
}

class C2 implements A {
	public void display(String s) {
		System.out.println("클래스 C2 객체 이용 : " + s);
	}
}

class C3 implements A {
	public void display(String s) {
		System.out.println("클래스 C3 객체 이용 : " + s);
	}
	public int getInt() {
		return 1000;
	}
}

public class IR1_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A memo;
		
		memo = new C1();
		memo.display("경기도 - 북한산");
		memo = new C2();
		memo.display("강원도 - 설악산");
		memo = new C3();
		memo.display("강화도 - 마니산");
	}

}
