package chapter13;

class Car {
	public int spd;
	
	public Car() {	}
}

public class Truck extends Car{
	
	int spd;
	
	public Truck() {
		System.out.println("Truck Class�� default �����ڰ� ȣ��");
	}
	
	public void speedUp(int speed) {
		spd = speed;
	}
	public int getCarSpd() {
		return super.spd;		// 4�� �ڵ�� ���� return;
	}
	
	public int getTruckSpd() {
		return this.spd;		//	11�� �ڵ�� ���� return;
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
		System.out.println("Car class�� spd ��������� �� : " + myTruck.spd);
		System.out.println("Car speed�� spd ��������� �� : " + myTruck.getCarSpd());
		
	}
	
}
