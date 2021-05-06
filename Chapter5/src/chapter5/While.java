package chapter5;
//조건이 참인 동안에 실행되고,
//조건이 처음부터 거짓이면 한번도 실행되지 않을 수 있다.
public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j = -5;
		//j가 0보다 작을 동안 실행합니다.
		while (j <= 0 ) {
			System.out.println("번호 : " + j);
			j++;
			if (j == - 3) break;
		}
		
		System.out.println("------------END-------------");
		System.out.println("While 종료후의 j의 값" + j);

	}

}
