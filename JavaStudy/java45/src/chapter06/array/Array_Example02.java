package chapter06.array;

import java.util.*;

public class Array_Example02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int text = 0;
		int sum = 0;
		
		while(text < 2) {
			System.out.print("배열의 크기 : ");
			text = scan.nextInt();
		
			if(text < 2) {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
		
		int[] arr = new int[text];
		for(int i = 0; i < arr.length; i++) {
			System.out.print("arr[" + i + "] = ");
			arr[i] = scan.nextInt();
			sum += arr[i];
		}
		
        // 배열 원소 출력
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i == text - 1) {
        		System.out.print(" = " + sum);
        		System.exit(0);
        	}
            System.out.print(" + ");
        }
	}
}
