package chapter06.array;

import java.util.*;

public class Random_Example {

	public static void main(String[] args) {
		
		
		double num = Math.random();
		int num2 = (int) (Math.random() * 10 + 1);
		System.out.println(num);
		System.out.println(num2);
		
		
		Random r = new Random();
		int num3 = r.nextInt(100);
		System.out.println(num3);
	}
}
