package chapter03.operator;

import java.util.*;

public class Oper_Example05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 정수: ");
		int a = scan.nextInt();
		System.out.print("두번째 정수: ");
		int b = scan.nextInt();
		System.out.print("세번째 정수: ");
		int c = scan.nextInt();
		
		int max = (a > b && a > c) ? a : b > c ? b : c;
		
		
		System.out.println("최대값: " + max);
		
	}
}
