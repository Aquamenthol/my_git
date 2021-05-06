package chapter19;

import java.util.*;

public class NewHashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable ht;
		ht = new Hashtable();
		ht.put("one", "俺备府");		// one key俊 俺备府 按眉
		ht.put("two", "空传捞");
		ht.put("three", "酒肺固");
		
		String s = (String)ht.get("two");
		
		if (s == null)	System.out.println("tow = " + s);
		else			System.out.println(s);
	}

}
