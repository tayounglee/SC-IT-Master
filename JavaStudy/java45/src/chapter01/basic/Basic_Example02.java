package chapter01.basic;

public class Basic_Example02 {
	private static void swap(int[] arr) {
		int temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;
		
	}
	
	public static void main(String[] args) {
		int x = 200;
		int y = 100;
		int[] arr = {x, y};
		
		System.out.println("교환전");
		System.out.println("x = " + arr[0]);
		System.out.println("y = " + arr[1] + "\n");
		
		swap(arr);
		/*int temp = x;
		x = y;
		y = temp;*/
		
		System.out.println("교환후");
		System.out.println("x = " + arr[0]);
		System.out.println("y = " + arr[1]);
		}

}
