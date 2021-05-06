package chapter11;

class Data {
	private String name = null;
	private String season = null;
	private int year = 0;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setSeason(String season) {
		this.season = season;
	}
	public void setYear(int year) {
		if (year >= 20 && year <= 30 && year > 0)
				this.year = year;
		else 
			System.out.println("�Է� �� �� �ִ� ���̴� 20 ~ 30�� �����Դϴ�.");
	}
	public String getName() {
		return name;
	}
	public String getSeason() {
		return season;
	}
	public int getYear() {
		return year;
	}
}

public class DataAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data d = new Data();
		d.setName("�մ���");
		d.setSeason("�ʰ���");
		d.setYear(1);
		
		System.out.println(d.getName());
		System.out.println(d.getSeason());
		System.out.println(d.getYear());
	}

}
