package chapter08.classPart;

public class Constructor3 {

	public static void main(String[] args) {
		Time now = new Time(true, 12, 34);
		now.whatTime();
		
		System.out.println("============");
		Time today = new Time(18, 30);
		today.whatTime();
	}
}
