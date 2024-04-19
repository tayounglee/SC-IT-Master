package chapter03.operator;

import java.util.*;

public class Oper_Example04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("kor점수: ");
		int kor = scan.nextInt();
		System.out.print("eng점수: ");
		int eng = scan.nextInt();
		System.out.print("math점수: ");
		int math = scan.nextInt();
		
		int sum = kor + eng + math;
		double avg = sum / 3.0;
		System.out.print("총합: " + sum + " 평균: " + avg);
		
	}
}
