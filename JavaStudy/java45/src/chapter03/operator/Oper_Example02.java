package chapter03.operator;

import java.util.*;

public class Oper_Example02 {

	public static void main(String[] args) {
		int kor, eng, math;
		double avg;
		boolean result;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("국어: ");
		kor = scan.nextInt();
		System.out.print("영어: ");
		eng = scan.nextInt();
		System.out.print("수학: ");
		math = scan.nextInt();
		
		avg = (kor + eng + math) / 3.0;
		result = avg >= 60 && kor >= 40 && eng >= 40 && math >= 40;
		System.out.print("합격여부 : " + (result ? "합격" : "불합격"));
//		System.out.println("합격여부 : " + result);
		
	}
}
