package chapter8;

public class Calc {
	public void add(int kuk, int eng) {
		// 함수에서 프린트 할꺼면 void 
		System.out.println("합계" + (kuk + eng));
	}
	
	public int sub(int kuk, int eng) {
		// 함수에서 출력하지 않고 return 하면 변수 (int, String,등등등)
		return kuk - eng;
	}
	
	public int mul (int kuk, int eng) {
		return kuk * eng;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub'
		Calc c = new Calc();
		int a = 200;
		int b = 200;
		
		c.add(100, 200);
		
		System.out.println("뺀값" + c.sub(a, b));
		System.out.println("곱한값" + c.mul(a, b));
		
	}

}
