package chapter08.classPart;

class Member{
	public String id;
	public String pw;
	public String phoneNumber;
	
	public Member(String id, String pw, String phoneNumber) {
		this.id = id;
		this.pw = pw;
		this.phoneNumber = phoneNumber;
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		/*
		 * 접근 지정자, 접근 제어자
		 * 클래스 내부의 변수나 메서드, 생성ㅈ아에 대한 접근 권한을 가짐
		 * public : 외부 클래스 어디서나 접근
		 * protected : 같은 패키지 내부와 상속 관계의 클래스에서만 접근
		 * (default) : 같은 패키지 내부에서만 접근
		 * private : 같은 클래스 내부에서만 접근
		 */
	}

}
