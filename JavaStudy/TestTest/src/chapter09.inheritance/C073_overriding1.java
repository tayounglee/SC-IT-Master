package chapter08.inheritance;

public class C073_overriding1 {

	public static void main(String[] args) {
		
/*
	메서드 오버라이딩 조건
	1. 상속관계에서만 가능하다.
	2. 부모가 가지고 있는 메서드의 파라미터의 타입, 개수, 순서가 동일해야하고,
	   메서드의 이름도 동일해야하고,
	   리턴타입도 동일해야한다.
 */
		class A {
			int num = 10;
			
			public void methodA() {
				System.out.println("A : " + num);
			}
		}
		
		class B extends A{
			int num = 100;

			@Override
			public void methodA() {
				System.out.println("B : " + num);
			}
		}
		
		A aa = new A();
		A ab = new B();
		B bb = new B();
		
		// 멤버변수는 참조타입에 결정
		System.out.println(aa.num);
		System.out.println(ab.num);
		System.out.println(bb.num);
		// 멤버메서드는 생성타입에 결정(가상메서드)
		aa.methodA();
		ab.methodA();
		bb.methodA();

	}

}
