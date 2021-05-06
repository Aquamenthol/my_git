package chapter12;

// 상속의 다형성 부분
class OverD {
	void show (int k) {
		System.out.println("OVerD : " + (k * 10));
	}
	void prn (int i) {
		System.out.println("OverD : prn() " + i);
	}
}

class SubOverD extends OverD {
	void show (int i) {
		System.out.println("sub show : " + (i * 10000));
	}
	void prn (String s) {
		System.out.println("sub prn(String s) : " + s);
	}
	void scr() {
		System.out.println("sub scr() : ");
	}
}
public class OverrideExam4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		다형성
		OverD od = new SubOverD();	// new로 다른 객체를 생성 (heap메모리영역)
			// OverD od = new OverD();	// od는 SubOverD()가 되고 OverD가 된다.
		od.show(1);		// 부모클래스의 show(int k)에 들어갔다가 자식클래스의 show(int i)가 응답한다.
		od.prn(1);		 
//		 부모클래스의 prn(int i)에 들어갔다가 
//		자식클래스의 prn(String s)에 들어가서 변수가 다르니
//		부모클래스의 prn(int i)가 응답한다.
		
//		객체형 변환	(부모가 자식의 멤버를 부르기 위해서 한다.)
		SubOverD sod = (SubOverD)od;	// 28번 heap 영역과 같은영역에 SubOverD를 생성
		sod.show(1);
		sod.prn("s");
		sod.scr();
	}
	
//	기본 형변환 : 큰값을 작게 바꾸는 것
//	객체  형변환 : 상위객체(작은 면적)을 하위객체(크게)로 바꾸는 것이다.

}
