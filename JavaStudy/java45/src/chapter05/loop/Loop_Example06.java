package chapter05.loop;

public class Loop_Example06 {

	public static void main(String[] args) {
		
		System.out.println("1번");
		for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // 줄 바꿈
        }
		
		System.out.println("2번");
		for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(); // 줄 바꿈
        }
	}

}
