package chapter13;
class TV4 {
	public TV4() {
		System.out.println("TV4");
	}
}

class Movie4 {		// TV4와 상속관계가 아니다.
	String part = "";
	
	public Movie4() {	}
	
	public Movie4(String part) {
		this.part = part;
		System.out.print("\tMovie");
	}
}

class Comedy4 extends Movie4 {
	String time = "";
	String name = "";
	
	public Comedy4() {	}
	
	public Comedy4(String time, String name, String patr) {
		//super(part);
		this.time = time;
		this.name = name;
		System.out.print("\tComedy4");
	}
}
public class MovieTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Comedy4 com4 = new Comedy4("21:00", "Movie4", "한국영화");

	}

}
