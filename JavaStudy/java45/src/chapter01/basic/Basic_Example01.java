package chapter01.basic;

import java.util.*;

public class Basic_Example01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name;
		int age;
		float height;
		
		System.out.print("이름 : ");
		name = scan.next();
		System.out.print("나이 : ");
		age = scan.nextInt();
		System.out.print("키 : ");
		height = scan.nextFloat();
		
		System.out.println("이름은 "+ name + "이고 나이는 "+ age +"세, 키는 "+ height +"CM입니다.");
		
	}
}