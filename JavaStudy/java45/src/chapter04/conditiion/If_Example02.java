package chapter04.conditiion;

import java.util.*;

public class If_Example02 {

	public static void main(String[] args) {
			int a, b, c, max;
			Scanner scan = new Scanner(System.in);
			
			System.out.print("숫자1 : ");
			a = scan.nextInt();
			System.out.print("숫자2 : ");
			b = scan.nextInt();
			System.out.print("숫자3 : ");
			c = scan.nextInt();
			
			if(a > b && a > c) {
				max = a;
			}
			else if (b > c){
				max = b;
			}
			else {
				max = c;
			}
			System.out.println("최대값: " + max);
	}

}
