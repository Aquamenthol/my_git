package chapter8;

public class MethodTest6 {
	
	int kuk, eng, tot = 0;
	float avg = 0.0f;
	
 	public MethodTest6(int kuk, int eng) {
 		this.kuk = kuk;
 		this.eng = eng;
 	}
 	
 	public int getTot()		{ return tot; }
 	public float getAvg() 	{ return avg; }
 	
 	public void calcTot()	{ tot = kuk + eng;	}
 	public void calcAvg() 	{ avg = tot / 2.0f;	}
 	
 	public void prn() {
 		System.out.println("???? : " + kuk);
 		System.out.println("???? : " + eng);
 		System.out.println("???? : " + tot);
 		System.out.println("???? : " + avg);
 	}

}
