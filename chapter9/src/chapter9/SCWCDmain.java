package chapter9;

class SCWCD {
	int t1 = 0;
	int t2 = 0;
	int t3 = 0;
	int t4 = 0;
	int tot, avg = 0;
	static int BONUS = 100;	// 모든 클래스에서 참조가능
	
	public SCWCD() {	}
	
	public SCWCD(int t1, int t2, int t3, int t4) {
		this.t1 = t1;
		this.t2 = t2;
		this.t3 = t3;
		this.t4 = t4;
	}
	
	public String pass() {
		String msg = null;
		if (t1 >= 40 && t2 >= 40 && t3 >= 40 && t4 >= 40 ) {
			msg = "축하합니다. 합격입니다.";
		}else {
			msg = "평균점수 불합격입니다.";
		}
		return msg;
		
	}
	
	public static void prLine(String pass) {
		System.out.println(""+ pass);
//		System.out.println("************");
//		System.out.println("************");
//		System.out.println("************");
	}
}

public class SCWCDmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SCWCD sc = new SCWCD(65, 49, 40, 80);
		sc.prLine(sc.pass());
	}

}
