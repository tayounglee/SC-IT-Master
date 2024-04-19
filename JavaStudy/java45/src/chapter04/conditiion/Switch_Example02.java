package chapter04.conditiion;

import java.util.*;

public class Switch_Example02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("연산자 (+, -, *, /): ");
		String operator = scan.next();
		System.out.print("정수1 입력: ");
		float a = scan.nextFloat();
		System.out.print("정수2 입력: ");
		float b = scan.nextFloat();
		
		float result = 0;
		
		switch(operator) {
			case "+":
				result = a + b;
				break;
			case "-":
				result = a - b;
				break;
			case "*":
				result = a * b;
				break;
			case "/":
				if(b == 0) {
					System.out.println("0으로 나눌 수 없습니다.");
					System.exit(0);
				}
				result = a / b;
				break;	
		}
		
		System.out.println(result);
	}

}
