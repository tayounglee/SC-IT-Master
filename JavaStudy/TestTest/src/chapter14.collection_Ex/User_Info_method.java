package chapter13.collection;

import java.util.Scanner;
import java.util.TreeSet;

public class User_Info_method {
	
	Scanner scan = new Scanner(System.in);
	TreeSet<User> userList;	//유저 리스트
	
	User_Info_method() {
		userList = new TreeSet<>();
	}

	//메뉴 출력
	public void printMenu() {
		System.out.println("""
				
				*** User 정보 확인 프로그램 ***
				    1. 회원 가입
				    2. 회원 조회
				    3. 전체 조회
				    0. 종　　　료
				""");
		System.out.print("> 번호를 입력하세요: ");
	}
	
	//문구 출력
	public void printText(int num) {
		switch (num) {
			case 1 -> System.out.println("> 프로그램을 종료합니다.");
			case 2 -> System.out.println("> 번호를 잘못 입력하셨습니다.");
			case 3 -> System.out.println("> 회원 정보가 없습니다.");
		}
	}

	//유저 생성
	public void createUser() {
		System.out.println();
		System.out.print("> I  D: ");
		String id = scan.next();
		System.out.print("> P  W: ");
		String pw = scan.next();
		System.out.print("> NAME: ");
		String name = scan.next();
		
		User user = new User(id, pw, name);
		
		if(userList.contains(user))
			System.out.println("> 존재하는 ID입니다.");
		else {
			userList.add(user);
			System.out.printf("> %s님, 가입을 축하합니다.\n", id);
		}
	}

	//회원 조회
	public void selectUser() {
		System.out.print("> 조회할 ID: ");
		String id = scan.next();
		for (User user : userList) {
			if(user.getId().equals(id)) {
				System.out.print("> PW 확인: ");
				String pw = scan.next();
				
				if(user.getPw().equals(pw)) {
					System.out.println("--- 회원 조회 결과 ---");
					System.out.println(user);
					return;
				}
			}
		}
		printText(3);
	}

	//전체 조회
	public void selectAll() {
		if(userList.isEmpty()) {
			printText(3);
			return;
		}
			
		System.out.println("--- 전체 조회 결과 ---");
		for (User user : userList) {
			System.out.println(user);
		}
	}

}
