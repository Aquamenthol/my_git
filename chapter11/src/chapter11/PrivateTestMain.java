package chapter11;

class PrivateTest {
	public int kuk, eng, sum = 0;
	
	private void sum() {
		sum = kuk + eng;
		if (sum > 200) {
			System.out.println("점수가 200점을 초과하였습니다.");
			sum = 0;
		} else {	System.out.println("합계가 정상적으로 처리 되었습니다.");	}
	}
	public void call_sum() { sum();	}
}
public class PrivateTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrivateTest pt = new PrivateTest();
		pt.kuk = 90;
		pt.eng = 95;
		
		pt.call_sum();
		System.out.println("pt.sum() : " + pt.sum);
	}
}
