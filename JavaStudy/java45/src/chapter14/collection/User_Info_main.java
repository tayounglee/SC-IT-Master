package chapter14.collection;

import java.util.*;

public class User_Info_main {
	
	public static void main(String[] args) {
		int select = 0;
		boolean isLoop = true;
		
		User_Info_method ui_Method = new User_Info_method();
		Scanner scan = new Scanner(System.in);
		
		while(isLoop) {
			ui_Method.printMenu();
			select = scan.nextInt();
			
			switch(select) {
				//0. 종      료
				case 0:
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
				case 1:
					ui_Method.signUp();
					break;
				case 2:
					ui_Method.memberCheck();
					break;
				case 3:					
					ui_Method.memberCheckAll();
					break;
				default:
					System.out.println("잘못 입력하였습니다.\n");
					break;
			}	
		}
	}
}