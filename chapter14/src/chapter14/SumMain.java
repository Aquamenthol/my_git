package chapter14;

/*	추상클래스?
 * 	1. 추상메서드를 포함하고 있는 클래스 이다.
 *  추상메서드?
 *  	1) 선언만 있고 내용이 없는 메서드 이다.
 *  		원형(prototype) 있고, {	}가 없다.
 *  			ex) public int add (int a, int b); <---- {	} 가 없다.(크기가 없다, 크기를 몰라) 추상메서드
 *  		ㅣ
 *  	        상속
 *  		ㅣ
 *  		2) 추상메서드 상속받아서 전부 Overriding해서 사용한다.
 *  		Concrete class concrete = new 생성자();
 *  
 *  	// 추상 클래스는 자기 자신을 인스턴스로 생성 불가능
 *  		추상클래스 객체 = new 생성자(); 			---- 불가능
 *  		Concrete class 객체 = new 생성자(); 	----- 보통이걸 사용 
 *			Concrete class 객체 = new 생성자();		----- 가능
 *
 *	-----------------추상 클래스의 용도-----------------------
 *	벤치마킹, 설계도, 뼈대 역할을 하는 클래스를 추상 클래스로 만든다.
 *		
 *	추상클래스			--->	Concrete				
 *	---자동차---				---K5---
 *	바퀴						바퀴 : 14in
 *	엔진						엔진 : 2000cc
 *	의자						의자 : 인조가죽
 *	----등등 있어야할것들을 		
 *		추상적으로 명기			
 *		추상클래스는 가장기본이 되는 		Concrete
 *		변수를 설계						---마티즈---
 *								바퀴, 엔진, 의자
 * 
 * 	// 추상클래스에는 "abstract class" 라고 넣는다.
 */
abstract class Sum {
	public abstract String toString();
	
	public String sum(int i, int k) {
		int sum = i + k;
		return " " + sum;
	}
}

class Sum_s1 extends Sum {
	public String toString() {
		return "class Sum_1 s1 extends Sum";
	}
}

class Sum_s2 extends Sum {
	public String toString() {
		return "class Sum_2 s2 extends Sum";
	}
}
public class SumMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sum_s1 s1 = new Sum_s1();
		System.out.println(s1.sum(10, 20));
		System.out.println(s1.toString());
		
		Sum_s2 s2 = new Sum_s2();
		System.out.println(s2.sum(100, 200));
		System.out.println(s2.toString());
	}

}
