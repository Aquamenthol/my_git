package chapter15;

class Throw_Test {
	// 1. 호출한 쪽에서 예외를 처리하도록 함
	public void add (int a, int b) throws Exception {
		if (b == 0) throw new Exception("add () 네가 처리해");
		System.out.println(a + b);
	}
	
	// 2. 스스로 예외를 처리한다.
	public void sub(int a, int b) {
		try {
			if (b == 0) throw new Exception();
			System.out.println(a - b);
		}
		catch (Exception e) {
			System.out.println("throw에 걸렸네 내가 처리함" + e.toString());
		}
	}
	
//	3 throw와 try ~ catch 같이 있는 경우 try가 우선권을 갖는다. throws는 무시
//	3 둘다 처리하도록 하려면 catch 블럭에서 throw를 설정하면 호출쪽에서도 ㅇ예외를 던진다.
	public void mul(int a, int b) throws Exception {
		try {
			if (b == 0) throw new Exception(" mul() 여기서 예외 발생");
			System.out.println(a * b);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("try가 우선권을 ㄹ같는다." + e.toString());
			// 호출쪽에도 예외를 던진다
			throw e;
		}
	}
}
public class ThrowsTest {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		int a = 100;
		int b = 0; // 0인 경우 예외 발생
		Throw_Test tt = new Throw_Test();
		try {
			//tt.add(a, b);
			//tt.sub(a, b);
			tt.mul(a, b);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("메인 클래스가 예외처리");
			System.out.println(e.toString());
		}
	}

}
