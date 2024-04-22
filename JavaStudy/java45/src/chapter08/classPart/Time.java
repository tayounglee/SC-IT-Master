package chapter08.classPart;

import java.time.*;

public class Time {

		/*필드, 속성, 멤버변수의 초기화 순서
		 * 클래스 변수 : 기본값 > 명시적 초기화 > 클래스 초기화 블록
		 * 인스턴스 변수 : 기본값 > 명시적 초기화 > 인스턴스 초기화 블록 > 
		 */
	static final int num = 999; // 클래스 변수
		
	boolean am;
	int hour;
	int min;
	int sec;
		
	static {
		System.out.println("static 초기화 블럭");
	}
	
	{
		System.out.println("instance 초기화 블럭");
		LocalTime now = LocalTime.now();
		hour = now.getHour();
		if(hour >= 12) {
			hour -= 12;
			am = false;
		}
		else {
			am = true;
		}
		
		min = now.getMinute();
		sec = now.getSecond();
	}
		
	Time(){}
	
	public Time(boolean am, int hour, int minute) {
		this.am = am;
		this.hour = hour;
		this.min = minute;
		this.sec = 0;
	}
	
	public Time(int hour, int minute) {
		this.am = hour < 12;
		this.hour = hour % 12;
		this.min = minute;
		this.sec = 0;
	}
	
	void whatTime() {
		System.out.println(am ? "오전" : "오후");
		System.out.println(hour + "시 " + min + "분 " + sec + "초");
	}
}
