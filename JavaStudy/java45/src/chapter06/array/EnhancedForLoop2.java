package chapter06.array;

public class EnhancedForLoop2 {

	public static void main(String[] args) {
		int[][] score = {{77, 56, 70, 88}, {55, 33, 89, 91}, {87, 24, 11, 53}};
		
		for(int[] student : score) {
			for(int subject : student) {
				System.out.print(subject + ", ");
			}
			System.out.println();
		}
	}

}
