package chapter8;

public class MethodTest4 {

	int kuk, eng, tot = 0;
	float avg = 0.0f;
	
	public MethodTest4(int kuk, int eng) {
		this.kuk = kuk;
		this.eng = eng;
	}
	
	public void calcTot() {	tot = kuk + eng;	}
	public void calcAvg() {	avg = tot / 2.0f;	}
	
	public void prn() {
		System.out.println("국어 : " +  kuk);
		System.out.println("영어 : " +  eng);
		System.out.println("총점 : " +  tot);
		System.out.println("평균 : " +  avg);
	}
	
	public static void main(String []args) {
		
		MethodTest4 mt = new MethodTest4(100, 90);
		
		mt.calcTot();	// 총합 함수  호출
		mt.calcAvg();	// 평균 함수 호출
		
		mt.prn();		// 출력함수 호출
	}
}