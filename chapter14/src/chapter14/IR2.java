package chapter14;

//interface B {
//	void display (String s);
//}

class D1 implements A {
	String str = "";
	public void display(String s) {
		str = s;
		System.out.println("클래스 D1 객체  이용 : " +s);
	}
}

class D2 implements A {
	String str = "";
	public void display(String s) {
		str = s;
		System.out.println("클래스 D2 객체  이용 : " +s);
	}
}
public class IR2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A memo;
		
		// IR1 꺼
		memo = new C1();
		memo.display("경기도 - 북한산");
		memo = new C2();
		memo.display("강원도 - 설악산");
		memo = new C3();
		memo.display("강화도 - 마니산");
		
		// IR2 꺼
		memo = new D1();
		memo.display("석모도");
		
		D1 d1 = (D1)memo;			// 하위클래스 멤버 str을 호출 객체형변환
		System.out.println(d1.str);
		
		memo = new D2();
		memo.display("강화도");
		
		D2 d2 = (D2)memo;
		System.out.println(d2.str);
		
		
	}

}
