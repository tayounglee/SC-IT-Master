package chapter11.object;

public class C090_clone {

/*
	독립적인 완전한 사본을 만들 경우 clone 메서드를 사용
 */
	
	public static void main(String[] args) {
		Human kim = new Human(29, "김상형");
		Human kim2 = (Human) kim.clone();

		kim2.name = "이순신";
		
		System.out.println("kim.name : " + kim.name);
		System.out.println("kim2.name : " + kim2.name);
		
		kim2.score[0] = 999;
		
		System.out.println("kim.score[0] : " + kim.score[0]);
		System.out.println("kim2.score[0] : " + kim2.score[0]);
	}

}
