package chapter01.basic;

public class CharType {

	public static void main(String[] args) {
		char ch1 = '한';
		char ch2 = '\uD55C';
		System.out.println(ch1);
		System.out.println(ch2);
		int i = ch1;
		System.out.println(i);
		
		System.out.println("안 녕 하 \n 세 요 ");
		System.out.println("안 녕 하 \t 세 요 ");
		System.out.println("안 녕 하 \' 세 요 ");
		System.out.println("안 녕 하 \" 세 요 ");
		System.out.println("안 녕 하 \\ 세 요 ");
	}
}
