import java.util.*;

public class Loop_Example02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0, i = 0, j = 0;
		
		while(i < 5) {
			System.out.print("정수 입력: ");
			j = scan.nextInt();
			sum += j;
			i++;
		}
		System.out.println(sum);
	}

}
