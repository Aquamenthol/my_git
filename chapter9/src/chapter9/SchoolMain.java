package chapter9;
class School {
	int kuk, eng, mat = 0;
	
	public School() {}
	public School(int kuk) {	
		this.kuk = kuk;	
	}
	
	public School(int kuk, int eng) {
		this.kuk = kuk;
		//new School(kuk);
		this.eng = eng;
	}
	
	public School(int kuk, int eng, int mat) {
		this.kuk = kuk;
		this.eng = eng;
		//new School(kuk, eng);
		this.mat = mat;
	}
	public int hap() {
		int tot = kuk + eng + mat;
		return tot;
	}
}
public class SchoolMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		School sc1 = new School(90);
		System.out.println("hap : " + sc1.hap());
		
		School sc2 = new School(90, 80);
		System.out.println("hap : " + sc2.hap());
		
		School sc3 = new School(90, 80, 100); 
		System.out.println("hap : " + sc3.hap());
	}

}
