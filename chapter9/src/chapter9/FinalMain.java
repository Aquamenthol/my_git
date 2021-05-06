package chapter9;

import java.text.DecimalFormat;

// final 변수 : 값을 변경 할수 없다.  ---- 절대 불변 변수 (1분 1시간 1일 1주일 1개월 1년 이라고 생각)
// final 메서드 : 오버라이딩 불가능
// final 클래스 : 상속 불가능

class Final {
	int money = 20000;
	final int day = 7, week = 4, month = 12;	// 절대 불변
	
	public Final() {
		
	}
}
public class FinalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Final fi = new Final();
		DecimalFormat comma = new DecimalFormat("###,###");
		fi.money = 30000;
		System.out.println("1주일 용돈 : " + comma.format(fi.money * fi.day));

	}

}
