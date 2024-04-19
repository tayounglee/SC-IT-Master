package chapter03.operator;

import java.util.*;

public class Oper_Example03 {

	public static void main(String[] args) {
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("0~999 사이의 정수를 입력하세요");
		int num = scan.nextInt();
		
		int num100 = num % 10;
		int num10 = num100 /10;
		int num1 = num10;
		
		/*
		while(num > 0) {
		sum += num%10;
		int quot = num/10;
		num = quot;
		}
		*/
		System.out.println("각 자리수의 합: " + sum);
	}

}
