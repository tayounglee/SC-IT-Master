package chapter14.exception;

public class C122_throw2 {

	public static void main(String[] args) {
		String name = null;
		try {
			printScore(name);
		}
		catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
	}
	
	static void printScore(String name) throws NullPointerException {
		System.out.println("메서드 실행");
		if (name == null) {
			throw new NullPointerException("이름이 무효합니다.");
		}
		System.out.println(name.length());
	}
}
