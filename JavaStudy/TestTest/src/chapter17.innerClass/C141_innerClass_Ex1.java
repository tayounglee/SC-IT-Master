package chapter16.innerclass;

class Name {
	String first;
	String family;
	
	Name(String first, String family) {
		this.first = first;
		this.family = family;
	}
}

class Human {
	int age;
	Name name;
	
	class Name {	//2
		String first;
		String family;
		
		Name(String first, String family) {
			this.first = first;
			this.family = family;
		}
		
		void outAge() {
			System.out.println("저는 " + age + "살입니다.");
		}
		
		void outWho() {	//3
			Util.outName(this);
			Util.outHuman(Human.this);
			
			System.out.println(this);			//4
			System.out.println(Human.this);		//4
		}

		@Override		//4
		public String toString() {
			return "Name객체";
		}
		
	}
	
	@Override		//4
	public String toString() {
		return "Human객체";
	}
	
	Human(int age, String first, String family) {
		this.age = age;
		this.name = new Name(first, family);
	}
	
	void intro() {
		System.out.println("안녕, " + age + "살 " + name.family + name.first + "이라고 해.");
	}
}

class Util {	//3
	static void outName(Human.Name name) {
		System.out.println(name.family + name.first + "이라고 해.");
	}

	static void outHuman(Human who) {
		who.intro();
	}
}

public class C141_innerClass_Ex1 {

	public static void main(String[] args) {
/*
	참조, 캡슐화 목적
 */
		Human kim = new Human(29, "상형", "김");
		kim.intro();
		kim.name.outAge();	//2
		kim.name.outWho();	//3
		
	}

}
