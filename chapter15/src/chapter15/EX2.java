package chapter15;

public class EX2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("매가변수로 받은 두 개의 값");
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		System.out.println("a = " + a + " b = " + b);
		
		try {	// 분모가 0일때에만 예외처리 되어있다.
			System.out.println("a를 b로 나눈 몫 = " + (a / b));
		}catch (Exception e) {
			System.out.println("[경고] 예외발생 : " + e.toString());
		}finally {
			System.out.println("나눗셈 연산이 종료 되었습니다.");
		}
		
		System.out.println("나머지 루틴을 정상 실행합니다.");
	}

}
