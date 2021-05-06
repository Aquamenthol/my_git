package chapter15;
// 예외처리가 없는 경우의 예제
// 상황에 따라서 정상처리가 되며, 오류가 날수 있는 경우에 예외처리를 한다.
/*  예외발생 예상지점에서 "
 * try {	예외발생예상지점	}	catch (Exception e 예외처리클래스) {		} finally 	{ 최종마지막 처리문장 보편적으로 자원 반환	}
 * 
 * */
public class EX1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("매개변수로 받은 두 개의 값");
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		if (b == 0) {
			System.out.println("0으로 나눌 수 없습니다.");
			System.exit(0);	// 프로그램 종료문
		}
		
		System.out.println("A=" +a+ " B=" +b);
		System.out.println("a를 b로 나눈 몫 = " +(a/b));
		System.out.println("나눗셈이 원활히 수행되었습니다.");
		
	}

}
