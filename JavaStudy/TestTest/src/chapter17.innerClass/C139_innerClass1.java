package chapter16.innerclass;

class AA {		//AA는 B의 외부 클래스
	int i = 100;
	BB b = new BB();
	
	//BB클래스를 AA클래스 안에서만 사용하려고 하면 안에다가 집어넣는다
	//AA의 멤버에 접근이 용이해짐, AA에서만 사용될 거면 불필요한 부분이 밖으로 드러나지 않았으므로 "캡슐화"
	class BB {	//BB는 AA의 내부 클래스
		void method() {
			i += 100;
			//BB클래스에서 AA클래스의 멤버를 사용하기 위해서는
			AA a = new AA();
			System.out.println("=====");
			System.out.println(a.i);
			System.out.println(i);		//객체 생성없이 멤버에 바로 접근
		}
	}
	
	static class CC {
		void method() { }
	}
}

//class CC {
//	AA.BB b = new AA.BB();
//}

public class C139_innerClass1 {

	public static void main(String[] args) {
//		BB err1 = new BB();			// 내부클래스에 접근 불가
//		err1.method();
		
//		AA.BB err2 = new AA.BB();	// 인스턴스 내부 클래스는 생성 불가
//		AA.CC f = new AA.CC();	// 정적 내부 클래스는 생성 가능
//		f.method();
		
		AA a = new AA();
		a.b.method();
		
		AA.BB b = a.b;
		b.method();
		
		AA.BB c = a.new BB();
		c.method();
		
		AA.BB d = new AA().b;
		d.method();
		
		AA.BB e = new AA().new BB();
		e.method();
	}

}
