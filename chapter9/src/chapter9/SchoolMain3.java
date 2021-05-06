package chapter9;

class School3 {
	int kuk, eng, tot = 0;
	
	public School3() {	// 기본생성자 정의
	}
	
	public int hap() {	tot = kuk + eng; return tot;}
}
public class SchoolMain3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		School3 sc3 = new School3();
		sc3.kuk = 90;
		sc3.eng = 100;
		System.out.println("hap : " + sc3.hap());
		
	}

}
