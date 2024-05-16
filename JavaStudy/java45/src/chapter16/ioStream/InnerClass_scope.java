package chapter16.ioStream;

class OuterClass2{
	class A{						//인스턴스 내부 클래스
	static class B{}
		void method() { //정적 내부 클래스
			class C{} ;

		}
	}
}

public class InnerClass_scope {

	public static void main(String[] args) {
		OuterClass OuterClass = OuterClass();	//	OuterClss oc = new OuterClass();
		System.out.println();
		System.out.println(OuterClass.a);
	}
}
