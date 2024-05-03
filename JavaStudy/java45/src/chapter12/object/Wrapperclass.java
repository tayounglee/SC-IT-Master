package chapter12.object;

public class Wrapperclass {

	public static void main(String[] args) {
		int i =  1234;
		Integer wrapint = new Integer(i);
		String str = wrapint.toString();
		System.out.println(str);
		
		String a = "56", b = "78";
		System.out.println(a + b);
		System.out.println(Integer.parseInt(a) + Integer.parseInt(b));
	}
}
