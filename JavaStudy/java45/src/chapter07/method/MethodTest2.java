package chapter07.method;

public class MethodTest2 {

	public static void main(String[] args) {
		method1();
		String str = method2();
		System.out.println(str);
		int[] arr = {1, 2, 3, 4, 5};
		method3(arr);
		int result = method4(1,2);
		System.out.println(result);
	}
	
	static void method1() {
		System.out.println("파라미터 x 반환값 x");
	}
	
	static String method2() {
		System.out.println("파라미터 x 반환값 O");
		return "Hello Java!";
	}
	
	static void method3(int[] arr) {
		System.out.println("파라미터 O 반환값 x");
		for(int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	static int method4(int a, int b) {
		System.out.println("파라미터 O 반환값 O");
		
		return a + b;
	}

}
