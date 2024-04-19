package chapter05.loop;

public class For_Example01 {

	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		for(int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		for(int i = 1; i < 10; i += 2) {
			System.out.print(i + " ");
		}
		System.out.println();
		for(int i = 0; i <= 10; i += 2) {
			System.out.print(i + " ");
		}
		System.out.println();
		for(int i = 10; i <= 100; i += 10) {
			System.out.print(i + " ");
		}
		System.out.println();
		for(int i = 5; i > 0; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		for(int i = 10000; i > 0; i /= 10) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

}
