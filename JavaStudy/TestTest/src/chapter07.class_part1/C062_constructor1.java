package chapter07.class_part1;

class User {
	String name;
	int age;

/*
	생성자(constructor)
	- 클래스를 통해 생성되는 인스턴스의 초기화를 도와주는 메서드의 일종
	- 클래스 내에 선언되며, 클래스의 이름과 같으며, 리턴 값이 없다
	- 생성자도 오버로딩이 가능하므로 하나의 클래스에 여러 개의 생성자가 존재 가능

	생성자 역할
	 - 객체를 생성할 때 멤버변수를 초기화하는 특수한 형태의 메서드다
	 - 반드시 존재해야만 한다

	생성자 개념
	 - 디폴트 생성자/ 컴파일할때 없으면 자바컴파일러가 자동으로 생성한다
	 - 기본 생성자/ 메서드와 비슷하지만 이름은 반드시 클래스이름으로 되어있다
	 - 명시적 생성자/ 매개변수를 원하는 값으로 받아 초기화를 시켜줌
	 - 명시적 생성자/ 명시적 생성자를 만들면 더이상 기본 생성자는 자동으로 만들어지지 않는다
		-> 명시적 생성자가 있으면, 기본생성자가 자동 생성되지 않기 때문에 오류가 발생한다
 
	생성자 규칙
	 - 생성자는 이름이 클래스와 같다
	 - 클래스 생성시 생성자를 넣지 않아도 기본 생성자가 생성된다
	 - 부모클래스는 자식클래스 보다 먼저 생성되어야 한다
	 - 리턴타입을 갖지 않는다
	 - 명시적 생성자가 있으면 기본 생성자가 생성되지 않는다
	 - 기본 생성자가 없으면 오류가 난다
	 - 해결방법
	 	-> 기본 생성자를 만들어 주던지
		-> 명시적 생성자의 값을 이용을 하던지
*/
	//기본 생성자
	User() {
		
	}
	
	//명시적 생성자
	User(String aName) {
		name = aName;
	}
	//생성자 오버로딩
	User(String aName, int aAge) {
		name = aName;
		age = aAge;
	}
	
	public void UserInfo() {
		System.out.println("이름: " + name + ", 나이: " + age);
	}
}

class User2 {
	String name;
	int age;
	
//	User2(String aName, int aAge) {
//		name = aName;
//		age = aAge;
//	}
	
	public void UserInfo() {
		System.out.println("이름: " + name + ", 나이: " + age);
	}
}

public class C062_constructor1 {

	public static void main(String[] args) {
		// 인스턴스1
		User user1 = new User();
		user1.UserInfo();
		
		// 인스턴스2
		User user2 = new User("홍길동");
		user2.age = 33;
		user2.UserInfo();

		// 인스턴스3
		User user3 = new User("이순신", 55);
		user3.UserInfo();
		
		System.out.println("=========");
		
		// 인스턴스4
		User2 user4 = new User2();
		user4.UserInfo();
		
//		User2 user5 = new User2("고길동", 74);
//		user4.UserInfo();
		
		
	}

}
