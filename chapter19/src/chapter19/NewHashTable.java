package chapter19;

import java.util.*;

public class NewHashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable ht;
		ht = new Hashtable();
		ht.put("one", "������");		// one key�� ������ ��ü
		ht.put("two", "�մ���");
		ht.put("three", "�Ʒι�");
		
		String s = (String)ht.get("two");
		
		if (s == null)	System.out.println("tow = " + s);
		else			System.out.println(s);
	}

}
