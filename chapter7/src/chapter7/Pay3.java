package chapter7;

import java.text.DecimalFormat;

public class Pay3 {
	
	
	String name;
	int bonbong, tex, silsu;

	public void setTex() {
		tex = (int)(bonbong * 0.05 + 0.5);
	}

	public void setSilsu() {
		silsu = bonbong - tex;
	}
	
	public void prnPay() {
		
		DecimalFormat comma = new DecimalFormat("###,###");
		
		System.out.println("撩      貲 : " +name);
		System.out.println("獄      瑰 : " +comma.format(bonbong));
		System.out.println("撮      旎 : " +comma.format(tex));
		System.out.println("褒熱滄擋 : " +comma.format(silsu));
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		Pay3 p1 = new Pay3();
		Pay3 p2 = new Pay3();
		
		p1.bonbong = 2000000;
		p1.name = "諾換檜";
		p1.setTex();
		p1.setSilsu();
		p1.prnPay();
		
		System.out.println("收收收收收收收收收收收收收收收收收");
		
		p2.bonbong = 2500000;
		p2.name = "嬴煎嘐";
		p2.setTex();
		p2.setSilsu();
		p2.prnPay();

	}

}
