package chapter11;

public class CallByValue {	// String 이때는 변수인가?

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person("wonwoo");
		System.out.println("p.name - " + p.name);
		System.out.print("\t" + p.hashCode());
		callByValue(p);
		
		System.out.println("\np.name - " + p.name);
		System.out.print("\t " + p.hashCode());
	}
	
	public static void callByValue(Person p) {
		p.name = "kevin";
	}
}

class Person {
	String name;
	
	public Person(String name) {
		this.name = name;
	}
}
