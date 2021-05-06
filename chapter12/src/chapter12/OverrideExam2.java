package chapter12;

class OverB {
	void show(String str) {
		System.out.println("부모 클래스의 메소드 show() 수행 : " + str);
	}
}

class SubOverB extends OverB {
	void show(String str) {	//메서드오버라이딩 : 상위클래스의 메서드를 재정의 한다.
		System.out.println("자식 클래시의 메소드 show() 수행 : " + str);
	}
}
public class OverrideExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverB ob = new OverB();
		ob.show("Korea");
		
		SubOverB over = new SubOverB();
		over.show("Republic of");
		over.show("ㅇ라ㅓ닝러ㅣ망러ㅣㅁ러ㅣ");

	}

}
