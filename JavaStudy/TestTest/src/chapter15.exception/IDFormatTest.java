package chapter14.exception;

import java.util.Scanner;

public class IDFormatTest {
	private String userID;
	
	public String getUserID() {
		return userID;
	}
	
	public void setUserID(String userID) throws IDFormatException {
		// 사용자 정의 예외 클래스 IDFormatException 생성
		// userID가 null						
		//   => ERR "아이디는 null일 수 없습니다." 출력
		// userID가 8자 ~ 20자 가 아닐 경우		
		//   => ERR "아이디는 8자 이상 20자 이하로 쓰세요." 출력
		if(userID == null) {
			throw new IDFormatException("아이디는 null일 수 없습니다.");
		}else if(userID.length() < 8 || userID.length() > 20) {
			throw new IDFormatException("아이디는 8자 이상 20자 이하로 쓰세요.");
		}
		this.userID = userID;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		IDFormatTest test = new IDFormatTest();
		
		System.out.print("ID : ");
		String userID = scan.next();
		userID = null;
		
//		String userID = null;
		try {
			test.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}
		
//		userID = "1234567";
		try {
			test.setUserID(userID);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
