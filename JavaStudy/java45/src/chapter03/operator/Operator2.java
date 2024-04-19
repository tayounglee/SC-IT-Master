package chapter03.operator;

public class Operator2 {

	public static void main(String[] args) {
		int value = 3;
		int a = ++value;
		System.out.println("value = " + value + ", a = " + a);
		int value2 = 8;
		System.out.println(value2);
		value2 = -value2;
		System.out.println(value2);
		
		System.out.println(4 + 5);
		System.out.println("영구와 " + "땡칠이");
		System.out.println("응답하라 " + "1988");
		System.out.println("" + 19 + 88 + "응답하라");
		
		String str = "안녕" + "하세요" + 13313;
		System.out.println(str);
	}

}
