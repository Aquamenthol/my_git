package chapter4;

public class IfApp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k =1002;
		
		//논리 연산자 or 의 사용
		/* && (AND) : 는 둘다 참일때 참이다.
		 * 앞쪽 조건식이 false(거짓)이면 전체가 false(거짓)이 되므로 앞에만 확인
		 *  반대로
		 * || (OR) : 는 둘다 참 일때 참이다. 
		 * 앞쪽 조건식이 true(참)이면 전체가 true(참)이 되므로 앞에만 확인*/
		if((k % 3 == 0) || (k % 5 == 0))
			System.out.println("k 의 값은 : " + k + " : 3 의 배수이거나 5 의 배수입니다");
		else	System.out.println("k 의 값은 3 의 배수이거나 5 의 배수가 아닙니다.");
		
	}
}
		
		
		
		
		
