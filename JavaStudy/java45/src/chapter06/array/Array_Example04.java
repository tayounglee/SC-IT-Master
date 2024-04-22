package chapter06.array;

import java.util.*;

public class Array_Example04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();

        System.out.print("로또의 개수를 입력하세요: ");
        int lottoCount = scan.nextInt();

        if (lottoCount < 1) {
            System.out.println("로또의 개수는 1 이상이어야 합니다.");
            return;
        }

        int[][] lottos = new int[lottoCount][6];

        

        for (int i = 0; i < lottoCount; i++) {
            int[] numbers = new int[6];
            boolean[] check = new boolean[46];

            for (int j = 0; j < 6; j++) {
                int num;
                do {
                    num = random.nextInt(45) + 1;
                } while (check[num]);

                numbers[j] = num;
                check[num] = true;
            }

            for (int k = 0; k < numbers.length - 1; k++) {
                for (int l = k + 1; l < numbers.length; l++) {
                    if (numbers[k] > numbers[l]) {
                        int temp = numbers[k];
                        numbers[k] = numbers[l];
                        numbers[l] = temp;
                    }
                }
            }

            System.out.print("[ " + i + "]번째 : ");
            for (int j = 0; j < 6; j++) {
                System.out.print(numbers[j]);
                if (j < 5) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}