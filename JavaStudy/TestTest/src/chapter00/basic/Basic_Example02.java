package chapter00.basic;

import java.util.Scanner;

public class Basic_Example02 {

	public static void main(String[] args) {
		//키보드로 입력받을 준비
		Scanner sc = new Scanner(System.in);
		//이름
		String name = "";
		//나이
		int age = 0;
		//키
		double height = 0.0;
		
		System.out.print("이름 : ");
		name = sc.nextLine();
		System.out.print("나이 : ");
		age = sc.nextInt();
		System.out.print("키 : ");
		height = sc.nextDouble();
		
		System.out.println("이름은 " + name + "이고 나이는 " + age + "세, 키는 " + height + "Cm입니다.");
		sc.close();

	}

}
