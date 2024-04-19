package chapter03.operator;

import java.util.Scanner;

public class Oper_Example01 {

	public static void main(String[] args) {
		int a = 0, b = 0; //받은 금액 , 상품가격, 거스름돈
		Scanner scan = new Scanner(System.in);
		
		System.out.print("받은 금액 : ");
		a = scan.nextInt();
		System.out.print("상품 가격 : ");
		b = scan.nextInt();
		int c = a - b;
		System.out.println("거스름돈 : " + c);
	}

}
