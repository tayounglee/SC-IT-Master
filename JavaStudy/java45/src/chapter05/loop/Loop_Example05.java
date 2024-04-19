package chapter05.loop;

public class Loop_Example05 {

	public static void main(String[] args) {
		
		System.out.println("1번");
		for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    System.out.print(i + 1 + " ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println(); // 줄 바꿈
        }
		
		System.out.println("2번");
		for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(i + j + 1 + " ");
            }
            System.out.println(); // 줄 바꿈
        }
	}

}