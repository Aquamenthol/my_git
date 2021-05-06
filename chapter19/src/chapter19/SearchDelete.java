package chapter19;

import java.util.Vector;

/*		Vector
 * 			1.	크기가 가변 : 동적구조 <---- Array를 개선한 구조 : 정적구조
 * 			2.	순서(Index)다 필요한 곳에 사용
 * 			3. 객체만 입력가능 int x integer O
 * 			4. 객체면 입력가능하다 
 */
public class SearchDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name[] = {"왕눈이", "아로미", "투투"};	
		
		Vector v = new Vector();
		String s = "왕눈이";
		
		for (int i = 0; i < name.length; i ++) v.addElement(name[i]);
		if(v.contains(s)) {
			int i  = v.indexOf(s);
			System.out.println("해당 객체가 인덱스에 있습니다.");
		}
		else System.out.println("해당 객체가 없습니다.");
		
		v.removeElementAt(0);
		
		System.out.println("=====지우고 난 후에는======");
		
		for(int j = 0; j <v.size(); j++) {
			s = (String)v.elementAt(j);
			System.out.println("벡터 " + j + "번째 요소는 " + s);
		}
	}

}
