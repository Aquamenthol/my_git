package testjava;

public class Ex_03_06 {
		//   "\" 역슬래쉬 탈출문자에 대해 알아보자.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 5.123456789;
		System.out.printf("\n줄바꾸기 연습\n");
		System.out.printf("탭키(들여쓰기)\t 연습\n");
		System.out.printf("이것을\r덮어씁니다\n");
		System.out.printf("글자가 \"강조\"되는 효과 \n");
		System.out.printf("\\\\\\ 역슬래시 3개 출력 \n");
		
		System.out.printf("%f\n", a); 		// %f 소수점 6자리까지 출력한다.
		
		System.out.printf("%7.1f\n", a); 	// %7.1f 소수점 아래첫째자리만 출력
											// 소수점 아래 둘째 자리에서 반올림
		
		System.out.printf("%7.3f\n", a);	// %7.3f 소수점 아래 셋째 자리까지 출력
											// 만약 최하위 자릿수가 없을경우에는 0으로 채운다.

	}

}
