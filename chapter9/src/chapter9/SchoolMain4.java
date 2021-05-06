package chapter9;
class School4 {
	int kuk, eng, tot = 0;
	
	public School4() {	// 기본 생성자가 반드시 필요한 경우 안에 인자가 있을경우이다.
	}
	
	public School4(int kuk, int eng) {
		this.kuk = kuk;
		this.eng = eng;
	}
	
	public int hap() {
		tot = kuk + eng;
		return tot;
	}
}
public class SchoolMain4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		School4 sc4 = new School4();
		sc4.kuk = 90;
		sc4.eng = 100;
		System.out.println("hap : " + sc4.hap());
		
		School4 sc = new School4(80, 95);
		System.out.println("hap : " + sc.hap());
	}

}
