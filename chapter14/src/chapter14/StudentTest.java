package chapter14;

interface Student {
	public String getName();
	public void setName(String name);
	public int getRank();
	public void setRank(int rank);
	public String prnName();
}

class StudentCon implements Student {
	String name = null;
	int rank =0;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	
	public String prnName() {
		String s= " ";
		s = " �١١� ";
		s = s + name + s;	// 31���� ���� 
		//s = "�١١�";
		
		return s;
	}
	
}
public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s = new StudentCon();
		
		s.setName("�մ���");
		System.out.println("�̸� : " + s.getName());
		s.setRank(1);
		System.out.println("��� : " + s.getRank());
		
		System.out.println(s.prnName());
	}

}
