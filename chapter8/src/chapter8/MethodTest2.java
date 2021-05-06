package chapter8;

public class MethodTest2 {
	// 처리메서드 코드
	String name = "";
	int kuk, eng, tot = 0;
	float avg = 0.0f;
	
	public void calcTot() {
		tot = kuk + eng;
	}
	
	public void calcAvg() {
		avg = tot / 2.0f;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodTest2 mt = new MethodTest2();
		
		mt.kuk = 100;
		mt.eng = 90;
		mt.calcTot();
		mt.calcAvg();
		
		System.out.println("국어 : "+mt.kuk);
		System.out.println("영어 : "+mt.eng);
		System.out.println("총점 : "+mt.tot);
		System.out.println("평균 : "+mt.avg);

	}

}
