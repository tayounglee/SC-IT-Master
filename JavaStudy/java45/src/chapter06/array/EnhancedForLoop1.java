package chapter06.array;

public class EnhancedForLoop1 {

	public static void main(String[] args) {
		int[] score = {88, 94, 72, 75, 23};
		int sum = 0;
		// for(score은 반복대상. i는 요소를 저장할 제어변수)
		for(int i : score) {
			sum += i;
		}
		System.out.println("총점: " + sum);
		System.out.println("평균: " + (float) sum / score.length);
		int[] score2 = {88, 94, 72, 75, 23};
		for(int j : score2) {
			j++;
		}
		System.out.println("score[0] = " + score[0]);
	}
}
