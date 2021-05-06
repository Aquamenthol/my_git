package chapter11;

import java.util.Scanner;

class PrivateTestVar {
	private int kuk = 0;
	
	public int getKuk() {
		return kuk;
	}
	
	public void setKuk(int kuk) {
		if (kuk > 100)
			System.out.println("kuk 값을 다시 입력해주세요");
		else	
			this.kuk = kuk;
		}
}

public class PrivateTestVariMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("값을 입력하시오.");
		Scanner sc = new Scanner(System.in);
		PrivateTestVar ptv = new PrivateTestVar();
		ptv.setKuk(100);
		int kuk = ptv.getKuk();
		System.out.println(kuk);
	}

}
