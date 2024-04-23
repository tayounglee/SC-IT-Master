package chapter08.classPart;

import java.util.*;

public class Theater {
	public static void main(String[] args) {
		Theater_Method tm = new Theater_Method();
		Scanner scan = new Scanner(System.in);
		int num = 0, cnt = 0;
		
		while(true) {
			tm.printMenu();				//메뉴 출력
			System.out.print("번호를 선택하세요 : ");
			num = scan.nextInt();
									
			switch(num) {
				case 1:					//좌석 확인
					System.out.println();
					tm.seatInfo();
					break;
				case 2:					//좌석 예약
					cnt = tm.inputCnt();
					tm.reservationSeats(cnt);
					break;
				case 0:
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
				default:				//잘못 입력 출력
					System.out.println("잘못 입력하셨습니다.");
					break;
			}
		}
	}
}
