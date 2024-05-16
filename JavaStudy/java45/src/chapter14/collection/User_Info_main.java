package chapter14.collection;

import java.util.Scanner;

public class User_Info_main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		User_Info_method uim = new User_Info_method();
		int num = 0;
		
		while(true) {
			uim.printMenu();
			num = scan.nextInt();
			
			switch (num) {
				case 1 -> uim.createUser();
				case 2 -> uim.selectUser();
				case 3 -> uim.selectAll();
				case 0 -> { 
					uim.printText(1);
					return;
				}
				default -> uim.printText(2);
			}
		}

	}

}
