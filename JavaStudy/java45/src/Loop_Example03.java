import java.util.*;

public class Loop_Example03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		System.out.print("숫자 입력: ");
		int i = scan.nextInt();
		System.out.print("숫자 입력: ");
		int j = scan.nextInt();
		
		if(i > j) {
			while(j <= i) {
				sum += j;
				j++;
				
			}
		}
		else {
			while(i <= j) {
				sum += i;
				i++;
				
			}
		}
		System.out.println(sum);
	}

}
