package chapter14.collection;

import java.time.*;
import java.time.format.*;
import java.util.*;

public class User_Info_method {
	Scanner scan = new Scanner(System.in);
	User user = new User();
	String member;
	String id;
	String pw;
	String name;
	String User[];
	boolean isMember = false;   // 회원이 없을때 회원이 없다를 반환
	
	
	
	
	void printMenu() {
		System.out.println("*** User 정보 확인 프로그램 ***");
		for(int i = 1; i < 4; i++ ) {
			if(i >= 4) {
				System.out.println("0. 종료");
			}
			else {
				System.out.print(i + ". ");
				switch(i) {
					case 1:
						System.out.println("회원 가입");
						break;
					case 2:
						System.out.println("회원 조회");
						break;
					case 3:
						System.out.println("전체 조회");
						break;
					default:
						break;
				}	
			}
		}
		System.out.print("번호를 입력하세요 : ");
	}
	
	//2. 회원 조회
	void memberCheck() {
		System.out.print("조회할 ID: ");
		member = scan.next();
		
		if(member.equals(User)) {
			
		}
		else {
			System.out.println("회원 정보가 없습니다.\n");
		}
	}
	
	//3. 전체 조회
	void memberCheckAll() {
		if(isMember) {
			
		}
		else {
			System.out.println("회원 정보가 없습니다.\n");
		}
	}
	
	// 현재 시간 체크
	void timeCheck() {
		LocalDateTime now = LocalDateTime.now();
		String formatedNow = now.format(DateTimeFormatter.ofPattern("yyyy/MM/dd a HH:mm:ss"));
		user.setReg_Date(formatedNow);
	}
	
	//1. 회원 가입
	void signUp() {
		System.out.print("I  D: ");
		id = scan.next();
		user.setId(id);
		System.out.print("P  W: ");
		pw = scan.next();
		user.setPw(pw);
		System.out.print("NAME: ");
		name = scan.next();
		user.setName(name);
		System.out.println(id + "님, 가입을 축하합니다.\n");
		timeCheck();
		
		System.out.println(user.toString()); //시간 체크용
	}
}