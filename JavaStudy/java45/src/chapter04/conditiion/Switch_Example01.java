package chapter04.conditiion;

import java.util.*;

public class Switch_Example01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("연도를 입력하세요: ");
		int year = scan.nextInt();
		
		int zodiac  = year % 12;
		String result = "";
		
		switch(zodiac) {
		case 0:
			result = "원숭이";
			break;
		case 1:
			result = "닭";
			break;
		case 2:
			result = "개";
			break;
		case 3:
			result = "돼지";
			break;
		case 4:
			result = "쥐";
			break;
		case 5:
			result = "소";
			break;
		case 6:
			result = "호랑이";
			break;
		case 7:
			result = "토끼";
			break;
		case 8:
			result = "용";
			break;
		case 9:
			result = "뱀";
			break;
		case 10:
			result = "말";
			break;
		case 11:
			result = "양";
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
		}
		System.out.println(year + "년생은 " + result + "띠 입니다.");
	}

}
