package chapter13;
/*	* super 	: 상위클래스의 인스턴스
 * 	* super() 	: 상위클래스의 생성자
 *  * super(인자)	: 상위클래스의 인자가 있는 생성자
 *  
 *  this 	: 현재 클래스의 인스턴스
 *  this()	: 현재클래스의 생성자
 *  this(인자) : 현재클래스의 인자가 있는 생성자 
 *  
 *  상속관계에서는 하위 클래스의 인스턴스를 생성할때, 상위 클르새의 생성자가 먼저 작동한다. 명시적 호출하여 생성 할수도 있고,
 *  상위 생성자를 호출하지 않으면 기본생성자가 자동으로 호출된다.
 *  
 *  하위 인스턴스를 생성할때 ,초기화 하려는 변수가
 *  상위멤버와 하위멤버로 나누어져 있는 경우 반드시 상위 멤버를 먼저 초기화 하고 
 *  나중에 낮ㄴ의 멤버를 초기화 한다.
 *  	선행 super(인자)
 *  	후행 this.멤버 = 인자	*/
class TV{
	public TV() {
		System.out.print("TV");
	}
}

class Movie extends TV {
	String part = "";
	
	public Movie() {	}
	
	public Movie(String part) {
		this.part = part;
		System.out.print("\tMovie");
	}
}

class Comedy extends Movie {
	String time = "";
	String name = "";
	
	public Comedy() {	}
	public Comedy(String time, String name, String part) {
		super(part);
		this.time = time;
		this.name = name;
		System.out.print("\tComedy");
	}
}
public class MovieTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comedy com = new Comedy("21:00", "마파도", "한국영화");
		System.out.print("\n" + com.time);
		System.out.print("\t" + com.name);
		System.out.print("\t" + com.part);
		System.out.println("");
		
		Comedy com2 = new Comedy();
		com2.time = "17:00";
		com2.name = "가문의 영광";
		com2.part = "한국 영화";
		System.out.print("\n" + com2.time);
		System.out.print("\t" + com2.name);
		System.out.print("\t" + com2.part);
		
	}

}
