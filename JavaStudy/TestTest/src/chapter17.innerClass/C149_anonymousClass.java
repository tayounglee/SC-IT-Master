package chapter16.innerclass;

class A {
	void methodA() {
		System.out.println("A1");
	}
}

interface B {
	void methodB();
}

public class C149_anonymousClass {

	public static void main(String[] args) {
		// 익명클래스
		A a = new A();
		a.methodA();
		
		// 익명클래스 생성 (A클래스가 아닌 새롭게 만들어진 익명의 클래스)
		// new 조상클래스 이름 {}
		new Object() {
			void method() {
				System.out.println("A2");
			}
		}.method();
		
		// new 구현하는 인터페이스 이름 {}
		new B() {
			@Override
			public void methodB() {
				System.out.println("B");
			}
		}.methodB();

	}

}
