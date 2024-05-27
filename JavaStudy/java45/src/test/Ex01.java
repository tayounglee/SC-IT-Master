package test;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
/*
		Ex.1 (40점)
		[ 사용자 정보 확인 PRORGRAM ]
		이름, 나이, 주소를 입력받고, 
		해당 정보를 출력하는 메서드를 작성하세요.
		
		필수 사항
		* main 메서드에서는 userInfo()를 호출하기만 할 것.
		* 주소는 공백을 포함하여 입력 및 출력할 것.
			- Ex. 주소 입력: 삼성동 코엑스 4층 ICT교육센터  
 */
		userInfo();

	}
	
	static void userInfo() {
		String name, address;
		int age;
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		name = scan.nextLine();
		System.out.print("나이 입력 : ");
		age = Integer.parseInt(scan.nextLine());
		System.out.print("주소 입력 : ");
		address = scan.nextLine();
		
		System.out.println("");
		
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("주소: " + address);
	}
}
