package chapter08.classPart;

class User{
	String name;
	int age;
	
	public void userInfo() {
		System.out.println("이름: " + name + ", 나이: " + age);
	}
	
	public User(String name, int age) {
		this(name);
		this.age = age;
	}
	
	public User(String name) {
		this.name = name;
	}
	
	public User() {
		
	}
}

public class Constructor1 {

	public static void main(String[] args) {
		/*생성자 규칙
		 * 생성자는 이름이 클래스와 같다.
		 * 클래스 생성시 생성자를 넣지 않아도 기본 생성자가 생성된다.
		 * 부모클래스는 자식클래스 보다 먼저 생성되어야 한다.
		 * 리턴타입을 갖지 않는다.
		 * 명시적 생성자가 있으면 기본 생성자는 별도로 생성해야 한다.
		 */
		User user1 = new User();
		user1.userInfo();
		
		User user2 = new User("홍길동");
		user2.userInfo();
		
		User user3 = new User("이순신", 70);
		user3.userInfo();
	}
}