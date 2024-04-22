package chapter07.method;

public class MethodTest5 {

	public static void main(String[] args) {
			System.out.println(getSum(1, 2));
			System.out.println(getSum(1, 2, 3, 4));
			System.out.println(getSum(1, 2, 3, 4, 5, 6, 7));
	}
	
	static int getSum(int... a) {
		int sum = 0;
		for (int i : a) {
			sum += i;
		}
		
		return sum;
	}
}
