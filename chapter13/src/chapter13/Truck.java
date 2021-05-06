package chapter13;

class Car {
	public int spd;
	
	public Car() {	}
}

public class Truck extends Car{
	
	int spd;
	
	public Truck() {
		System.out.println("Truck Class의 default 생성자가 호출");
	}
	
	public void speedUp(int speed) {
		spd = speed;
	}
	public int getCarSpd() {
		return super.spd;		// 4번 코드로 값을 return;
	}
	
	public int getTruckSpd() {
		return this.spd;		//	11번 코드로 값을 return;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Truck myTruck;
		myTruck = new Truck();
		myTruck.speedUp(300);
		
//		Truck suc = (Truck)myTruck;
//		myTruck.speedUp(200);
		System.out.println("Truck speed is " + myTruck.getTruckSpd());
		//System.out.printf("Truck speed is %d", myTruck.getTruckSpd());
		System.out.println("Car class의 spd 멤버변수의 값 : " + myTruck.spd);
		System.out.println("Car speed의 spd 멤버변수의 값 : " + myTruck.getCarSpd());
		
	}
	
}
