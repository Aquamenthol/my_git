package chapter13;

class TV3 {
	public TV3() {
		System.out.print("TV3");
	}
}

class Movie3 extends TV3 {
	String part = "";
	
	public Movie3(String part) {
		this.part = part;
		System.out.print("\tMovie3");
	}
}

class Comedy3 extends Movie3 {
	String time = "";
	String name = "";
	
	public Comedy3(String time, String name, String part) {
		super(part);
		this.time = time;
		this.name = name;
		System.out.print("\tComedy");
	}
}
public class MovieTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comedy3 com3 = new Comedy3("21:00", "마파도", "한국영화");
		System.out.print("\n" + com3.time);
		System.out.print("\t" + com3.name);
		System.out.print("\t" + com3.part + "\n\n");
		
		//MovieTest에서의 생성자
		Comedy com = new Comedy("이거도", "됩니다.", "ㅋㅋㅋ");
		System.out.print("\n" + com.time);
		System.out.print("\t" + com.name);
		System.out.print("\t" + com.part);
		
		//이거도 되겠지. MovieTest2에서의 생성자
		Action2 act = new Action2();
		System.out.print("\n" + act.name);
	}

}
