package chapter07.class_part1;

class Time2 {
	private boolean am;
	private int hour;
	private int minute;
	private int second;
	
	Time2(int hour, int minute, int second) {
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}

	public int getHour() {	return hour; }
	public void setHour(int hour) {
		if (hour >= 0 && hour <= 23) {
			this.am = hour < 12;
			this.hour = hour % 12;
			if (this.hour == 0) this.hour = 12;
		}
	}
	
	public int getMinute() {	return minute; }
	public void setMinute(int minute) {
		if (minute >= 0 && minute <= 59) {
			this.minute = minute;
		}
	}
	
	public int getSecond() {	return second; }
	public void setSecond(int second) {
		if (second >= 0 && second <= 59) {
			this.second = second;
		}
	}
	
	void whatTime2() {
		System.out.print(am ? "오전 ":"오후 ");
		System.out.println(hour + "시 " + minute + "분 " + second + "초");
	}
}

public class C066_accessor {

	public static void main(String[] args) {
/*
	접근 지정자, 접근 제어자
	- 클래스 내부의 변수나 메서드, 생성자에 대한 접근 권한을 가짐

	- public    : 외부 클래스 어디에서나 접근
	- protected : 같은 패키지 내부와 상속 관계의 클래스에서만 접근
	- (default) : 같은 패키지 내부에서만 접근
	- private   : 같은 클래스 내부에서만 접근
 */
		Time2 now = new Time2(00, 10, 20);
		now.whatTime2();
		// now.hour = 34;			// 에러
		
		now.setHour(34);			// 거부
		now.setSecond(-25);			// 거부
		now.whatTime2();
		
		now.setHour(10);			// 가능
		now.setMinute(45);			// 가능
		now.whatTime2();
	}

}
