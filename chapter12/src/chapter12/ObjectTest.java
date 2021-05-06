package chapter12;

/*	1. 상위객체 = 상위생성자 ()	-----------	가능 / 기본적인 객체 생성법
 *	2. 하위객체 = 하위생성자 ()	-----------	가능 / 상속 받은 자원 활용 가능
 *	3. 상위객체 = 하위생성자 ()	-----------	가능 	/ 다형성으로 활용하고자 할때 / 오버라이딩된 하위자원 호출가능
 *	4. 하위객체 = 상위생성자 ()	-----------	불가능 / 무조건 오류
 *	
 *	5. 하위객체 = (하위객체)상위객체 	-------	상위객체가 1번 출신이면 : 불가능하다.
 *		-------------------------------	상위객체가 3번 출신이면 : 가능 / 객체형변환/
 */

public class ObjectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ObjectTest ot = new ObjectTest();
			
			System.out.println(ot.hashCode());
			System.out.println(ot.toString());
	}

}
