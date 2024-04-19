package chapter06.array;

public class TwoDimensionTest2 {

	public static void main(String[] args) {
		int[][] score = {{77, 56, 70, 82}, {99, 96, 89, 88}, {81, 69, 62, 80}};
		
		int classSum = 0;
		for (int student = 0; student < score.length; student++) {
			int sum = 0;
			for (int subject = 0; subject < score[0].length; subject++) {
				sum += score[student][subject];
			}
			System.out.println((student + 1) + "번 총점: " + sum + ", 평균: " + (float) sum / score[0].length);
			classSum += sum;
		}
		System.out.println("학급 전체 평균: " + (float) classSum / (score.length * score[0].length));
	}

}
