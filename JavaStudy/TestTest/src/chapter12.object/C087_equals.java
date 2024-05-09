package chapter11.object;

public class C087_equals {

	public static void main(String[] args) {
		User userA = new User(100, "이상원");
		User userB = userA;
		User userC = new User(100, "이상원");
		
		if(userA == userB)	//동일성비교
			System.out.println("userA와 userB의 주소는 같습니다.1");
		else
			System.out.println("userA와 userB의 주소는 다릅니다.2");
			
		if(userA.equals(userB))	//동등성비교
			System.out.println("userA와 userB는 동일합니다.3");
		else
			System.out.println("userA와 userB는 동일하지 않습니다.4");
		
		
		if(userA == userC)
			System.out.println("userA와 userC의 주소는 같습니다.5");
		else
			System.out.println("userA와 userC의 주소는 다릅니다.6");
		
		if(userA.equals(userC))
			System.out.println("userA와 userC는 동일합니다.7");
		else
			System.out.println("userA와 userC는 동일하지 않습니다.8");
		
	}

}
