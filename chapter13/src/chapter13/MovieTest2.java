package chapter13;

class TV2 {
	public TV2() {
		System.out.print("TV2");
	}
}

class Movie2 extends TV2 {
	String part = "한국 영화";
	public Movie2() {
		System.out.print("\tMovie2");
	}
}

class Action2 extends Movie2 {
	String name = "";
	public Action2() {
		System.out.print("\tAction2\n");
	}
}

public class MovieTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Action2 act = new Action2();
		act.name = "마파도";
		System.out.println(act.name);
		System.out.println();
	}

}
