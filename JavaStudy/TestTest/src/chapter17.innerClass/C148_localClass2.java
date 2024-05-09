package chapter16.innerclass;

class Human5 {
	int age;
	String name;
	
	Human5(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	void intro() {
		//지역클래스에서 사용할 지역변수는 반드시 final이어야 한다
//		String nameCaption = "이름";		//err
		String nameCaption = "이름";
		final String ageCaption = "나이";
		
		// 지역 클래스는 객체를 생성하기 전에 클래스 선언문이 먼저 와야 한다.
//		Formatter format = new Formatter();		//불가
//		format.outInfo();

		// 지역 클래스는 잠시 선언해서 사용하는 임시적인 타입이어서 접근 지정자 및 static 을 붙일 수 없다.
		class Formatter {
			void outInfo() {
				System.out.println(nameCaption + " : " + name);
				System.out.println(ageCaption + " : " + age);
			}
		}
		
//		nameCaption = "ㅇㅇ";
		
		Formatter format = new Formatter();
		format.outInfo();
	}
}

public class C148_localClass2 {

	public static void main(String[] args) {
		Human5 kim = new Human5(29, "김상형");
		kim.intro();
	}

}
