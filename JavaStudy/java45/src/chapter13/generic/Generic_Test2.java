package chapter13.generic;

import java.util.*;

public class Generic_Test2 {

	public static void main(String[] args) {
		ArrayList arNum = new ArrayList();
		arNum.add(1);
		arNum.add("문자열");
		
		int value = (int) arNum.get(0);
		System.out.println(arNum);
		//String temp = (String) arNum.get(1);
		
		ArrayList<Integer> arNum2 = new ArrayList<Integer>();
		arNum2.add(1);
		arNum2.add(23213);
		
		int value2 = arNum2.get(1);
		
		System.out.println(value2);
	}
}
