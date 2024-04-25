package chapter09.inheritance;

//final 클래스는 상속 불가
class AA {
	final static double PI = 3.14;
	
	void method() {
		System.out.println("method 실행");
	}
	
	final void finalMethod() {
		System.out.println("final method 실행");
	}
}

class BB extends AA {
	@Override
	void method() {
		super.method();
		System.out.println("method BB 실행");
	}
	
//	final 메서드는 오버라이드 불가
//	@Override
//	final void finalMethod() {
//		
//	}
}

public class Final {

	public static void main(String[] args) {
/*
 * final
 * 		- final 변수 : 상수, 값 변경 불가
 * 		- final 클래스 : 상속 불가
 * 		- final 메서드 : override 불가
 */
		AA aa = new AA();
		AA ab = new BB();
		BB bb = new BB();
		
		System.out.println(aa.PI);
		System.out.println(ab.PI);
		System.out.println(bb.PI);
//		aa.PI = 3.14123123123234;		//final 변수는 재할당 불가
		
		aa.method();
		aa.finalMethod();
		ab.method();
		ab.finalMethod();				// BB에서는 오버라이드 할 수 없어 못 가져오고 AA에 있는 final method를 불러옴
		bb.method();
		bb.finalMethod();
	}

}
