package chapter03.operator;

public class Operator3 {

	public static void main(String[] args) {
		int num = 10;
		int i = 2;
		
		boolean value = ((num = num + 10) < 10 && (i = i + 2) < 10);
		System.out.println(value);
		System.out.println(num);
		System.out.println(i);
		
		num = 10;
		i = 2;
		
		//num의 조건이 true 이기때문에 boolean은 true를 반환하고 i의 값은 계산되지 않는다.
		value = ((num = num + 10) > 10 || (i = i + 2) < 10);
		System.out.println(value);
		System.out.println(num);
		System.out.println(i);
	}

}
