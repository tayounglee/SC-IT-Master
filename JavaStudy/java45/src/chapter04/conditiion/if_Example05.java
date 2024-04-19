package chapter04.conditiion;

import java.util.*;

public class if_Example05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int year;
		
		System.out.print("연도: ");
		year = scan.nextInt();
		
		if((year%4 == 0 && year%100 != 0 )|| year%400 == 0) {
			System.out.println("윤년");
		}
		else {
			System.out.println("평년");
		}
	}
}
