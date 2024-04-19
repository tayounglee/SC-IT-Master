package chapter04.conditiion;

class ifTest2 {
	public static void main(String[] args) {
		int age = 15;
		
		if(age >= 19) {
			System.out.println("성인입니다.");
			System.out.println("술집 입장.");
		}
		System.out.println("==============");
		
		if(age >= 19)
			System.out.println("성인입니다.");
			System.out.println("술집 입장.");
		
	}
}
