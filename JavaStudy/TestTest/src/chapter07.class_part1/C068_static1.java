package chapter07.class_part1;

class Test1 {
	// 인스턴스 변수, 멤버 변수
	private String name1 = "홍길동";
	// 정적 멤버 변수
	public static final String name2 = "고길동";
	
	public void printName() {
		System.out.println(this.name1);
	}
}

public class C068_static1 {
	public static void main(String[] args) {
//		System.out.println(name1);		//에러
		//static영역에 있는 메인메서드에서 출력을 하기 위해서는 객체를 생성해 주던가 스태틱한 영역의 데이터를 가져다 쓰던가 해야한다.
		Test1 ex = new Test1();
//		System.out.println(ex.name1);
		ex.printName();
		
		//정적 멤버 변수는 인스턴스의 생성없이 클래스의 이름으로 호출 가능
		System.out.println(Test1.name2);
	}

}
