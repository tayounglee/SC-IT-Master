package chapter11.object;

public class C092_string1 {

	public static void main(String[] args) {
/*	
		출력함수
		print() / println() / printf() / String.format()
		1. escape sequence (탈출 문자)
			\n : 개행
			\t : tab키 만큼 공백
			\" : 큰따옴표 출력
			\' : 작은따옴표 출력
		
		2. printf 출력서식 (자바 1.5이상)
		  - 지시자
			%b : boolean 형식으로 출력 
			%d : 정수 형식으로 출력
			%f : 소수점 형식으로 출력
			%c : 문자형식으로 출력 
			%s : 문자열 형식으로 출력
			%o : 8진수 정수의 형식으로 출력
			%x : 16진수 정수의 형식으로 출력
			
		  - 플래그
		  	" - "  : 왼쪽으로 정렬
			" + "  : 부호출력
			" 0 "  : 남는 자리를 0으로 채움
			" , "  : 일정 자리수마다 구분문자 표시
			" # "  : 8진수, 16진수 표시시 접두사  포함 등 출력형태 보완
			
			https://kadosholy.tistory.com/82
*/		

		int number = 10;
		double score = 12.345;
		String text = Integer.toBinaryString(number);
		 
		System.out.printf("%b %n", 3<1);         // boolean
		System.out.printf("%d %n", number);      // 10진수
		System.out.printf("%o %n", number);      //  8진수
		System.out.printf("%x %n%n", number);    // 16진수
		System.out.printf("%,d %n", 1000000);    // 10진수 (3자리수마다 ',' 표시)
		System.out.printf("%+d %n", 10);         // 10진수 (부호표시)
		System.out.printf("%+d %n", -10);        // 10진수 (부호표시)
		
		System.out.printf("%f %n", score);       // 부동소수점
		System.out.printf("%e %n%n", score);     // 지수
		
		System.out.printf("%c %n", 65);          // 문자 (Unicode에서 65는 A)
		System.out.printf("%s %n%n", text);      // 문자열 
		
		System.out.printf("[%10d] %n", number);  // 전체 10자리 (우측정렬) 
		System.out.printf("[%-10d] %n", number); // 전체 10자리 (좌측정렬)
		System.out.printf("[%010d] %n", number); // 전체 10자리 (빈공간 0으로 채움)
		System.out.printf("[%10.5f] %n", score); // 전체 10자리, 소수점아래 5자리
		
		System.out.println("=====================");
		
		String str = String.format("이름: %s, 나이: %d", "홍길동", 20);
		System.out.println(str);
		
	}

}
