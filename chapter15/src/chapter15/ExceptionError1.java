package chapter15;

public class ExceptionError1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {	// 정상처리
			System.out.println("매개변수로 받은 두 개 의 값");
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			System.out.println("a = " + a + "\tb = " + b);
			System.out.println("a를 b로 나눈 몫 = " +(a / b));
			System.out.println("a를 b로 나눈 나머지 = " +(a % b));
		}
		catch (ArithmeticException e) {
			// 수학적인 계산의 과정에서 발생하는 예외
			System.out.println("============================");
			//System.out.println("ArithmeticException 처리 루틴");
			System.out.println(e);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			// 배열인덱스 수량이 맞는가 예외
			System.out.println("============================");
			//System.out.println("ArrayIndexOutOfBoundsException 처리 루틴");
			System.out.println(e);
		}
		catch (NumberFormatException e) {
			// 넘버형식?
			System.out.println("============================");
			//System.out.println("NumberFormatException 처리 루틴");
			System.out.println(e);
		}
		catch(Exception e) {
			// 모든 그 외
			System.out.println("============================");
			System.out.println("알수없는 문제가 발생하였습니다.");
		}
		finally {
			System.out.println("============================");
			System.out.println("예외 처리를 끝내고 finally 블럭을 수행합니다");
		}
		System.out.println("나머지 모듈 정상 작동!!!");
	}
}
