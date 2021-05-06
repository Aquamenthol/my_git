package chapter8;

// bean 클래스.
public class SetGetTest {
	
	private String name;
	private String phone;
	private String address;
	private int age; 
	private boolean marrige; 
	private int [] math;
	
	// Set Get 자동생성 하자. 효율적으로 코딩을 합시다.
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isMarrige() {
		return marrige;
	}
	public void setMarrige(boolean marrige) {
		this.marrige = marrige;
	}
	public int[] getMath() {
		return math;
	}
	public void setMath(int[] math) {
		this.math = math;
	}

}
