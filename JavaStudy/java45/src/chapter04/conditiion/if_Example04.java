package chapter04.conditiion;

import java.util.*;

public class if_Example04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
				
		System.out.print("점수 입력: ");
		int result = scan.nextInt();
		
		if(result > 100 || result < 0) {
			System.out.println("잘못 입력했습니다");
			System.exit(0);
		}
		else if(result <= 100 && result >= 90) {
			System.out.println("수");
		}
		else if(result < 90 && result >= 80) {
			System.out.println("우");
		}
		else if(result < 80 && result >= 70) {
			System.out.println("미");
		}
		else if(result < 70 && result >= 60) {
			System.out.println("양");
		}
		else if(result < 60) {
			System.out.println("가");
		}
	}

}
