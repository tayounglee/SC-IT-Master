package chapter11.interface_part;

//도적
public class Thief extends Novice implements Skill{

	//명시적 생성자
	public Thief() {};
	//Thief형 인스턴스 생성시 Novice의 명시적 생성자를 호출하여 각각의 초기값을 가지는 인스턴스 생성
	public Thief(String name, int strength, int dexterity, int intelligence) {
		super(name, strength, dexterity, intelligence);
	}
	
	//상위 클래스 Novice의 attack()메서드를 재정의(오버라이드)
	@Override
	public void attack() {
		System.err.println("치명적인 공격\n");
	}

	//interface Skill의 메서드 skill()를 구현한다. (오버라이드) 
	@Override
	public void skill() {
		System.err.println("중독\n");
	}
	
	public String toString() {
		return String.format("[ID: %s(도적), stat: 힘(%d), 민첩(%d), 지능(%d)]"
				, super.getName(), super.getStrength(), super.getDexterity(), super.getIntelligence());
	}
}
