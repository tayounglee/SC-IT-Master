package chapter07.class_part1;

public class Time {
/*
	* 필드, 속성의 초기화 순서
	1. 클래스 변수 : 기본값 → 명시적 초기화 → 클래스 초기화 블록
	2. 인스턴스 변수 : 기본값 → 명시적 초기화 → 인스턴스 초기화 블록 → 생성자
 */
	boolean am;
	int hour;
	int minute;
	int second;

/*
	1. 인스턴스 초기화 블록
 */
	{
		System.out.println("초기화 블록");
		java.time.LocalTime now = java.time.LocalTime.now();
		hour = now.getHour();
		if (hour >= 12) {
			hour -= 12;
			am = false;
		} else {
			am = true;
		}
		minute = now.getMinute();
		second = now.getSecond();
	}
	
/*
	2. 클래스 초기화 블록
 */
	static {
		System.out.println("static 초기화 블록");
	}
	
/*
	this
	- 클래스 내부에서는 해당 인스턴스를 부를 이름이 없음.
	- 인스턴스 이름이 각자 달라지기 때문에 this를 사용해서
	지금 다루는 데이터가 그 자신을 가리키도록 this를 사용함.	
 */
	Time() { }
	
	Time(boolean am, int hour, int minute, int second, String str) {
		this(am, hour, minute, second);
		System.out.println("param 5개인 생성자" + str);
	}
	
	Time(boolean am, int hour, int minute, int second) {
		System.out.println("param 4개인 생성자");
		this.am = am;
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	Time(boolean am, int hour, int minute) {
		System.out.println("param 3개인 생성자");
		this.am = am;
		this.hour = hour;
		this.minute = minute;
		this.second = 0;
	}
	
	Time(int hour24, int minute) {
		System.out.println("param 2개인 생성자");
		this.am = hour24 < 12;
		this.hour = hour24 % 12;
		this.minute = minute;
		this.second = 0;
	}
	
	void whatTime() {
		System.out.print(am ? "오전 ":"오후 ");
		System.out.println(hour + "시 " + minute + "분 " + second + "초");
	}
}
