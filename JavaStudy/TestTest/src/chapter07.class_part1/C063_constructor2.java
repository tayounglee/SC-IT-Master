package chapter07.class_part1;

public class C063_constructor2 {

	public static void main(String[] args) {
		Time now = new Time(true, 12, 34);
		now.whatTime();
		
		System.out.println("==========");
		Time today = new Time(18, 30);
		today.whatTime();
		
		System.out.println("==========");
		Time today2 = new Time(true, 11, 30, 55, "today2");
		today2.whatTime();
		
	}

}
