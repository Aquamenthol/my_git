package chapter9;

// 클래스안에 생성자가 2개이상 정의 되어 있을경우 생성자 오버로딩 이라고한다.
// 생성자 오버로딩
// 생성자가 다중 있다는것은 인스턴스를 생성하는 방법이 여러가지 이다.
class ScjpPass {
	
	int t1 = 0;
	int t2 = 0;
	int t3 = 0;
	int t4 = 0;
	double t5, t6 = 0;
	static int BONUS = 100;
	
	public ScjpPass(double t5, double t6) {
		this.t5 = t5;
		this.t6 = t6;
	}
	
	public ScjpPass(int t1, int t2, int t3, int t4) {
		this.t1 = t1;
		this.t2 = t2;
		this.t3 = t3;
		this.t4 = t4;
	}
	
}
public class Scjp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ScjpPass.BONUS : " + ScjpPass.BONUS);
		ScjpPass sp = new ScjpPass(85, 90, 80, 70);
		ScjpPass sp1 = new ScjpPass(80, 20);
		System.out.println("sp.t1 : " + sp.t1);
		System.out.println("sp1.t5 : " + sp1.t5);
	}

}
