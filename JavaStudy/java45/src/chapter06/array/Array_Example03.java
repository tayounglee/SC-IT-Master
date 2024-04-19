package chapter06.array;

public class Array_Example03 {

	public static void main(String[] args) {
		
		String[] arr = {"브레드", "윌크", "초코", "소세지", "치즈"};
		String[] temp = new String[arr.length];
	
		System.out.print("원래 배열 -> ");
		
		for(String str : arr) {
			System.out.print(str + " ");
		}
		System.out.println();
		
		int index = arr.length - 1;
		//int index = 1;
		
        for (String str : arr) {
            temp[index--] = str;
            //index++;
        }
		
		
		System.out.print("역순 배열 -> ");
		
		for (String str : temp) {
			System.out.print(str + " ");
        }
	}
}