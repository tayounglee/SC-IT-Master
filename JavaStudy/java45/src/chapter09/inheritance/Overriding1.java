package chapter09.inheritance;

public class Overriding1 {
	
	public static void main(String[] args) {
		/*
		 * 메서드 오버라이딩 조건 
		 * 1. 상속관계여야만 가능 
		 * 2. 부모가 가지고 있는 메서드의 파라미터의 타입, 개수, 선서가 동일 
		 *    메서드의 이름 동일, 리턴 타입 동일
		 */   
		class A {
			int num = 10;
			
			public void methodA() {
				System.out.println("A: " + num);
			}
		}
		
		class B extends A{
			int num = 100;
			
//			@Override
			public void methodA() {
				System.out.println("B: " + num);
			}
		}
		
		A aa = new A();
		A ab = new B();
		B bb = new B();
		//멤버 변수는 참조타입에 결정
		System.out.println(aa.num);
		System.out.println(ab.num);
		System.out.println(bb.num);
		//멤버 메서드는 생성 타입에 결정
		aa.methodA();
		ab.methodA();
		bb.methodA();	
	}

}
