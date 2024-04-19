
public class Loop_Example04 {

	public static void main(String[] args) {
		
		
		System.out.println("1번");
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print("0 ");
			}
			System.out.println();
		}
		
		System.out.println("2번");
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		
		
		System.out.println("3번");
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		
	}

}
