package StudyGroup;

class Animal{
	protected String name;
	
	Animal(String name){
		this.name = name;
	}
	
	void Sound() {
		System.out.println(name + " 소리를 내보겠습니다.");
	}
}

class Cat extends Animal{
	
	Cat(String name) {
		super(name);
	}
	
	void Sound() {
		System.out.println(name + " : 야옹");
	}
}

class Dog extends Animal{
	
	Dog(String name) {
		super(name);
	}
	
	void Sound() {
		System.out.println(name + " : 멍멍 ");
	}
}

class Duck extends Animal{
	
	Duck(String name) {
		super(name);
	}
	
	void Sound() {
		System.out.println(name + " : 꽥꽥");
	}
}

public class Animal_Info {

	public static void main(String[] args) {
		Animal ani = new Animal("동물");
		ani.Sound();
		
		Cat cat = new Cat("고양이");
		cat.Sound();
		Dog dog = new Dog("강아지");
		dog.Sound();
		Duck duck = new Duck("오리");
		duck.Sound();
	}
}
