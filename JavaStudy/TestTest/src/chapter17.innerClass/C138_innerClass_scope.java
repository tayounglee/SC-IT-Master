package chapter16.innerclass;

class OuterClass {
	int a = 10;			//인스턴스 변수
	static int b = 20;	//정적 변수
	
	void method() {
		int c = 30;		//지역 변수
		System.out.println(c);
	}
}

class OuterClass2{
	class A {}			//인스턴스 내부 클래스
	static class B {}	//정적 내부 클래스
	
	void method() {
		class C {}		//지역 내부 클래스
	}
}

public class C138_innerClass_scope {
/*
	내부 클래스(inner class)란 하나의 클래스 내부에 선언된 또 다른 클래스
	이처럼 내부 클래스는 보통 두 클래스가 서로 긴밀한 관계가 있거나, 
	하나의 클래스 또는 메소드에서만 사용되는 클래스일 때 이용되는 기법
	
 * 내부 클래스, 중첩 클래스 사용 이유
	클래스를 논리적으로 그룹화한다
	기존보다 더 많은 캡슐화의 적용이 가능하다
	가독성이 좋고 유지 관리가 쉬운 코드 작성이 가능하다
 */
	public static void main(String[] args) {
		OuterClass oc = new OuterClass();
		System.out.println(oc.a);
		System.out.println(OuterClass.b);
		oc.method();
	}

}
