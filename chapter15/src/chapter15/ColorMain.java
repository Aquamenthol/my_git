package chapter15;
// interface는 다중구현(다중상속)이 가능
// 다중구현을 하려면 구현클래스 객체 = new 생성자 (); 다형성으로 생성하지 않는다.

interface Green {	public String greenColor();	}

interface Red {		public String redColor();	}

class Greenmp implements Green {
	public String greenColor() {
		return "초록색입니다.★";
	}
}

class Redmp implements Red {
	public String redColor() {
		return "빨간색 입니다.★";
	}
}


// 다중상속 구현
class Color implements Green, Red {
	
	public String greenColor() {	return "초록색입니다.";		}
	public String redColor() {		return "빨간색입니다.";		}	

}

public class ColorMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Green g = new Greenmp();
		System.out.println(g.greenColor());
		
		Red r = new Redmp();
		System.out.println(r.redColor());
		
		Color c = new Color();
		System.out.println(c.greenColor());
		System.out.println(c.redColor());
	}
}
