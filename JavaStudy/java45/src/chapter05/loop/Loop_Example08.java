package chapter05.loop;

public class Loop_Example08 {

	public static void main(String[] args) {
		
		System.out.println("1번");
		for (int i = 1; i <= 5; i++) {
            // 공백 출력
            for (int j = 5 - i; j > 0; j--) {
                System.out.print(" ");
            }
            
            // 별(*) 출력
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            
            System.out.println(); // 줄 바꿈
        }
		
		System.out.println("2번");
		for (int i = 5; i > 0; i--) {

            // 별(*) 출력
            for (int k = 1; k <= 5 - i; k++) {
                System.out.print(" ");
            }
			// 공백 출력
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            
            
            System.out.println(); // 줄 바꿈
        }
	}

}
