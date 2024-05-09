package chapter07.class_part1;

/*
	멤버변수의 경우 보통 private키워드를 사용하여 
	외부로부터의 직접적인 접근을 막고, 
	getter/setter라 부르는 멤버메소드를 만들어 사용함으로써 
	내부 데이터에 제한적 접근을 할 수 있게 합니다.
 */
/*
	접근 지정자, 접근 제어자
	- 클래스 내부의 변수나 메서드, 생성자에 대한 접근 권한을 가짐
	
	- public    : 외부 클래스 어디에서나 접근
	- protected : 같은 패키지 내부와 상속 관계의 클래스에서만 접근
	- (default) : 같은 패키지 내부에서만 접근
	- private   : 같은 클래스 내부에서만 접근
*/
class Member {
	private String id;
	private String password;
	private String phoneNumber;
	
	public Member(String id, String password, String phoneNumber) {
		super();
		this.id = id;
		this.password = password;
		this.phoneNumber = phoneNumber;
	}

	// 회원 ID는 변경되지 않으므로 getter만 존재(읽기 전용)
	public String getId() {
		return id;
	}

	// 회원 비밀번호는 변경만 가능하므로 setter만 존재
	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void memberInfo(String pwCheck) {
		if(this.password.equals(pwCheck)) {
			System.out.println("[ 회원 정보 ]");
			System.out.println(" *아이디	: " + this.id);
			System.out.println(" *전화번호	: " + this.phoneNumber);
		}
	}
}

public class C067_encapsulation {

	public static void main(String[] args) {
		Member member1 = new Member("hong2", "123", "01012345678");
//		member1.id;		//직접적인 접근 불가
		member1.getId();
		member1.getPhoneNumber();
		// 회원정보 확인 시 메서드를 통해서 확인
		member1.memberInfo("123");
	}

}
