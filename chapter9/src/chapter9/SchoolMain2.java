package chapter9;

// 클래스 내부의 기본 생성자가 없는경우 main문에서 호출하면 "자동으로 기본생성자가 생성"이 된다.
// 클래스에 인자가 있는 생성자가 존재하면, 기본생성자는 자동으로 만들어 지지 않는다.

class School2 {
	int kuk, eng, tot = 0;
	
	// public School2(){	}	기본 생성자의 생략
	
	public int hap() {
		tot = kuk + eng;
		return tot;
	}
}
public class SchoolMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		School2 sc2 = new School2();
		sc2.kuk = 90;
		sc2.eng = 100;
		
		System.out.println("hap : " + sc2.hap());

	}

}
