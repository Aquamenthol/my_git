package chapter5;
// 조건이 참인 동안에 실행되고
// while문과는 다르게, 조건이 처음부터 거짓이어도 
// 처음한번은 무조껀 실행하게 된다.
public class DoWhile {
	public static void main(String[] args) {
		int j = 1; // 초기값이 조건에 위배 (j<0) 되더라도 한번은 무조건 실행
		
		do { // do부분은 일단 한번은 실행해야한다. 반복블럭 실행문 i++; 증감치
			System.out.println("번호 : " + j); //1
			j++; //2
			if (j == 5) break;
		}
		while(j < 0);
		System.out.println("-------END-------");
		System.out.println("do while 문 종료후의 j 의 값 : " + j);
	}

}
