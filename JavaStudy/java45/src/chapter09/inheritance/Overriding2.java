package chapter09.inheritance;

class Human3 {
	int age;
	String name;
	
	Human3(int age, String name){
		this.age = age;
		this.name = name;
	}
	
	void intro() {
		System.out.println("안녕, " + age + "살 " + name + "이야");
	}
}

class Student3 extends Human3 {
	int stNum;
	String major;
	
	Student3(int age, String name, int stNum, String major){
		super(age, name);
		this.stNum = stNum;
		this.major = major;
	}

	@Override
	void intro() {
		System.out.println(major + "학과 " + stNum + "학번 " + name + "입니다.");
	}

	void study() {
		System.out.println("스터디 스터디");
	}

}

public class Overriding2 {

	public static void main(String[] args) {
		Human3 kim = new Human3(29, "김상혁");
		kim.intro();

//		Student3 lee = new Student3(42, "이승우", 9312345, "경영");
//		lee.intro();
//		lee.study();
		
		Human3 lee = new Student3(42, "이승우", 9312345, "경영");
		lee.intro();
//		lee.study();
	}

}
