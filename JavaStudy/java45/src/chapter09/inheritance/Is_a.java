package chapter09.inheritance;

class Animal{
	String name;
	
	void move() {
		System.out.println("움직이다");
	}
}

class Human4 extends Animal {
	String name;
	
	@Override
	void move() {
		System.out.println("걷다");
	}	
}

public class Is_a {

	public static void main(String[] args) {
/*
 * 		is a relation
 * 		상속 관계, 다중 상속X		
 */
		Animal a = new Human4();	//사람은 동물이다 O
		Human4 b = new Human4();	//사람은 사람이다 O
//		Human4 c = new Animal();	//동물은 사람이다 X

		a.move();
		b.move();
//		c.move();
		
	}

}
