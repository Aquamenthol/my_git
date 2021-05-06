package chapter19;

import java.util.Date;

public class DateExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date currentDate = new Date();
		System.out.println(currentDate);
		
		Date mybirthday = new Date(81, 0, 2);
		System.out.println("생년월일 : " + mybirthday);
		
		System.out.println("현재 날짜 기준");
		System.out.println("년 : " + currentDate.getYear());
		System.out.println("월 : " + (currentDate.getMonth() + 1));
		System.out.println("일 : " + currentDate.getDate());
		System.out.println("요일 : " + currentDate.getDay());
		
		System.out.println("날짜 : " + currentDate.toLocaleString());
		
	}

}
