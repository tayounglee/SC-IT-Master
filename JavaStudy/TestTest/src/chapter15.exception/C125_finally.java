package chapter14.exception;

import java.util.Scanner;

public class C125_finally {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("접속");
		try {
			System.out.println("전송");
			System.out.print("입력: ");
			int a = scan.nextInt();
			System.out.println(a);
			throw new Exception();
		}
		catch(Exception e) {
			System.out.println("예외 처리");
		}
		finally {
			scan.close();
			System.out.println("해제");
		}
	}

}
