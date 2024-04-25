package chapter09.inheritance;

class Human{
	int age;
	String name;
	
	Human(int age, String name){
		System.out.println("== Human 생성자 ==");
		this.age = age;
		this.name = name;
	}
	
	void intro() {
		System.out.println("안녕, " + age + "살 " + name + "이야");
	}
}

class Student extends Human{
	int stNum;
	String major;
	
	Student(int age, String name, int stNum, String major){
		super(age, name);
		this.stNum = stNum;
		this.major = major;
	}
	
	void study() {
		System.out.println("스터디 스터디");
	}
}

public class Inheritance {
	public static void main (String args[]) {
		Human kim = new Human(29,"김상혁");
		kim.intro();
		
		Student lee = new Student(42, "이승우", 9312345, "경영");
		lee.intro();
		lee.study();
	}
}
