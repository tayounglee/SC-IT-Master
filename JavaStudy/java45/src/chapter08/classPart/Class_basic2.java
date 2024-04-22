package chapter08.classPart;

class Human{
	int age;
	String name;
	
	void intro() {
		System.out.println("안녕, " + age + "살 " + name + "이야");
	}
	
	Human(){}
	Human(String aName, int aAge){
		name = aName;
		age = aAge;
	}
}

public class Class_basic2 {

	public static void main(String[] args) {
		/*[용어]
		 * 객체 - 객체지향 프로그램의 대상, 생성된 인스턴스
		 * 클래스 - 객체를 프로그래밍하기 위해 코드로 만든 상태
		 * 인스턴스 - 클래스가 메모리에 생성된 상태
		 * 멤버변수 - 클래스의 속성, 특성
		 * 메서드 - 멤버변수를 이용하여 클래스의 기능을 구현
		 * 참조변수 - 메모리에 새성된 인스턴스를 가리키는 변수
		 * 참조값 - 생성된 인스턴스의 메모리 주소 값
		 * 생성자 - 클래스를 처음 만들 때 멤버변수나 상수를 초기화
		 */
		Human human = new Human("이태영", 30);		 
		human.intro();
	}

}
