package chapter07.class_part1;

class Car {
	
	// 멤버 변수
	String name;
	boolean gasoline;
	
	// 멤버 메서드
	void run() {
		if (gasoline) {
			System.out.println("부릉 부릉");
		} else {
			System.out.println("덜컹 덜컹");
		}
	}
	void stop() {
		System.out.println("끼이익");
	}
}

// 소스파일의 파일명과 public 클래스명이 일치해야 한다.
public class C060_class_basic1 {

	public static void main(String[] args) {
/*
	[용어]
		객체 - 객체지향 프로그램의 대상, 생성된 인스턴스
		클래스 - 객체를 프로그래밍하기 위해 코드로 만든 상태
		인스턴스 - 클래스가 메모리에 생성된 상태
		멤버변수 - 클래스의 속성, 특성
		메서드 - 멤버변수를 이용하여 클래스의 기능을 구현
		참조변수 - 메모리에 생성된 인스턴스를 가리키는 변수
		참조값 - 생성된 인스턴스의 메모리 주소 값
		생성자 - 클래스를 처음 만들 때 멤버변수나 상수를 초기화
 */
		Car korando = new Car();
		korando.name = "코란도C";
		korando.gasoline = false;
		System.out.print(korando.name + " : ");
		korando.run();
		
		Car equus = new Car();
		equus.name = "에꿍스";
		equus.gasoline = true;
		System.out.print(equus.name + " : ");
		equus.run();
	}

}
