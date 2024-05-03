package chapter13.generic;

import java.util.*;

class Fruit{}
class Apple extends Fruit{}
class Banana extends Fruit{}

class FruitBox<T>{
	ArrayList<T> fruits = new ArrayList<>();
	
	public void add(T fruit) {
		this.fruits.add(fruit); 
	}
}

class FruitBox2<T, F>{
	ArrayList<T> apple = new ArrayList<>();
	ArrayList<F> banana = new ArrayList<>();
	
	public void add(T apple, F banana) {
		this.apple.add(apple);
		this.banana.add(banana);
	}
}

public class Generic_Test3 {

	public static void main(String[] args) {
		FruitBox<Fruit> box = new FruitBox<>();
		box.add(new Fruit());
		box.add(new Apple());
		box.add(new Banana());
		System.out.println(box);
				
		FruitBox2<Apple, Banana> box2 = new FruitBox2<>();
		box2.add(new Apple(), new Banana());
		box2.add(new Apple(), new Banana());
		
		System.out.println(box2);
		
	}
}
