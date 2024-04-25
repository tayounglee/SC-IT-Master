package chapter09.inheritance;

import java.time.*;

class Human2{
	
	int age;
	String name;
	
	Human2(int age, String name){
		this.age = age;
		this.name = name;
	}
	
	Human2(float birth, String name){
		this(0, name);
		LocalDate now = LocalDate.now();
		this.age = now.getYear() - (int) birth + 1;
	}
	
	void Intro() {
		System.out.println("안녕, " + age + "살 " + name + "이야");
	}
}

class Student2 extends Human2{
	int stNum;
	String major;
	
	Student2(int age, String name, int stNum, String major){
		super(age, name);
		this.stNum = stNum;
		this.major = major;
	}
	
	Student2(float birth, String name, int stNum, String major){
		super(birth, name);
		this.stNum = stNum;
		this.major = major;
	}
}

public class Super {

	public static void main(String[] args) {
		Student2 no = new Student2(39, "노정란", 9908123, "건축");
		no.Intro();
		Student2 bae = new Student2(1989.10f, "백지영", 1125034, "간호");
		bae.Intro();
	}
}
