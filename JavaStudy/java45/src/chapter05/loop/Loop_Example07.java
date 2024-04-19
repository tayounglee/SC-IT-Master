package chapter05.loop;

public class Loop_Example07 {

	public static void main(String[] args) {

		System.out.println("3번");
		for(int i = 1; i <= 5; i++) {
			for(int j = 5 - i; j > 0; j--) {
				System.out.print(" ");
			}
			
			for(int k = 0; k < i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("4번");
		for(int i = 1; i <= 5; i++) {
			for(int k = 0; k < i - 1; k++) {
				System.out.print(" ");
			}
			
			for(int j = 5 - i; j >= 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
