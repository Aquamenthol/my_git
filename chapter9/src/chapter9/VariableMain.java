package chapter9;

// class 변수 <=== 다른 클래스에서도 사용가능
// 멤버 변수 (전역변수) <==== 전역변수로서 클래스 내부의 모든 함수에서 사용 호출 참조 가능
// 지역 <--- 함수 내부에서 선언되며, 밖으로(함수, 메소드) 나가지 못 한다.

/* ----------------------------------------------------- */

// 기본형 변수 : 8가지 int, doublue
// 객체형 변수 : 크기가 언제나 4byte
// 배열 변수 : (동일한 크기가 반복, 기본형변수의 조합?)
// 객체 배열 변수 : (

public class VariableMain {
	
	String movie = "트로이";
	
	public void show() {	
		System.out.println("show 메소드 영역 : " + movie);
	}
	
	public void title() {
		String movie = "바람의 전설";
		System.out.println("title 메소드 영역 : " + movie);
		System.out.println("title 메소드 영역  (this.movie) : " + this.movie);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		VariableMain v = new VariableMain();
		v.show();
		v.title();
	}

}
