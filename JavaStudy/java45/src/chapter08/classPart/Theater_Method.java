package chapter08.classPart;

import java.util.*;

public class Theater_Method {
	private int[][] seats = new int[7][7];
	Scanner scan = new Scanner(System.in);
	
	void printMenu(){
		System.out.println("메뉴의 번호를 선택해 주세요.");
		System.out.println("=================");
		System.out.println("1. 좌석 확인");
		System.out.println("2. 좌석 예약");
		System.out.println("0. 종        료");
		System.out.println("=================");
	}
	
	int inputCnt() {
		System.out.print("몇개의 좌석을 예약하시겠습니까? : ");
        return scan.nextInt();
	}
	
	void seatInfo() {
		System.out.println("※좌석 예약 정보");
		System.out.println("---------------------");
		System.out.println("   1 2 3 4 5 6 7");
		System.out.println("---------------------");
		
        for (int i = 0; i < seats.length; i++) {
        	System.out.print((i + 1) + "| ");
            for (int j = 0; j < seats[i].length; j++) {
                System.out.print(seats[i][j] == 1 ? "1 " : "0 ");
            }
            System.out.println();
        }
        System.out.println();
	}
	
	void reservationSeats(int cnt){
		for (int i = 0; i < cnt; i++) {
            System.out.print("예약할 좌석의 행 : ");
            int row = scan.nextInt();
            System.out.print("예약할 좌석의 열 : ");
            int col = scan.nextInt();

            if (row < 1 || row > 7 || col < 1 || col > 7) {
                System.out.println("행과 열은 1부터 7까지의 값을 입력해야 합니다.");
                i--;
                continue;
            }

            if (seats[row - 1][col - 1] == 0) {
                seats[row - 1][col - 1] = 1;
                System.out.println("예약되었습니다.");
            } else {
                System.out.println(row + "행 " + col + "열은 이미 예약된 좌석입니다.");
                i--;
            }
        }
		System.out.println();
	}
}