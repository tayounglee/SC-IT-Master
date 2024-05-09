package chapter11.object;

class Student {
	String name;
	int stdNum;
	
	Student() {	}
	Student(String name, int stdNum) {
		this.name = name;
		this.stdNum = stdNum;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		//getClass() 메서드의 반환 결과는 실행 중인 객체의 클래스 정보를 가지고 있는 Class 객체
		if (getClass() != obj.getClass()) {	
			return false;
		}
		Student other = (Student) obj;
		if (this.stdNum != other.stdNum)
			return false;
		return true;
	}
	
	@Override
	public int hashCode() {
		return this.stdNum;
	}
	
}
public class C088_hashcode {

	public static void main(String[] args) {
		Student st1 = new Student("홍길동", 20240001);
		Student st2 = new Student("홍길동", 20240001);
		Student st3 = st1;
		Student st4 = new Student("홍길동", 20240003);
		
		System.out.println(st1 == st2);
		System.out.println(st1 == st3);
		System.out.println(st1 == st4);
		System.out.println("==============");
		
		System.out.println(st1.equals(st2));
		System.out.println(st1.equals(st3));
		System.out.println(st1.equals(st4));
		System.out.println("==============");
		
		System.out.println(st1.hashCode());
		System.out.println(st2.hashCode());
		System.out.println(st3.hashCode());
		System.out.println(st4.hashCode());
		System.out.println("==============");
		
		//실제 주소값
		System.out.println(System.identityHashCode(st1));
		System.out.println(System.identityHashCode(st2));
		System.out.println(System.identityHashCode(st3));
		System.out.println(System.identityHashCode(st4));
		
	}

}
