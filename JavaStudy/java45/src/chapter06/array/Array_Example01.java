package chapter06.array;

import java.util.*;

public class Array_Example01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[] {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		int[] temp = new int[] {0};
		System.out.print("Original : "); 
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("변경하고 싶은 위치1을 입력하세요");
		int swap = scan.nextInt();
		System.out.println("변경하고 싶은 위치2을 입력하세요");
		int swap2 = scan.nextInt();
		
		temp[0] = arr[swap - 1];
		arr[swap - 1] = arr[swap2 - 1];
		arr[swap2 - 1] = temp[0];
		
		System.out.print("New : "); 
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
