package chapter04.conditiion;

import java.util.*;

class If_Example01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("가로 입력: ");
		int x = scan.nextInt();
		System.out.print("세로 입력: ");
		int y = scan.nextInt();
		int wide = x * y;
		if(x == y) {
			System.out.println("정사각형의 넓이는 " + wide + "입니다.");
		}
		else {
			System.out.println("직사각형의 넓이는 " + wide + "입니다.");	
		}
	}
}
