package chapter15.exception;

public class Exception_Test2 {

   public static void main(String[] args) {
      //다중 예외 처리 (catch문을 여러개 만들 수 있다
      int a, b, c;
      a = 5;
      b = 3;
      int[] arr = {1,2,3,4,5};
      
      try {
         c = a / b;
         System.out.println("c = " + c);
         arr[5] = 100; //배열의 범위 넘어섬!!
      } catch (ArithmeticException e) {
         System.out.println("0으로 나누기 예외 발생");
      } catch (ArrayIndexOutOfBoundsException e) {
         System.out.println("첨자가 배열 범위를 넘어섰습니다.");
      } catch(Exception e) {
    	  System.out.println(e.getMessage());
      }
      
      System.out.println("프로그램 실행 완료");
   }

}