package chapter11.object;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class C089_getClass {

	public static void main(String[] args) {
		
/*
		p411
		객체의 클래스 정보를 조사하는 Class 객체를 리턴한다.
		Class 객체는 대상 객체의 정보를 구하는 다수의 메서드를 제공한다.
 */
		
		Human kim = new Human(29, "김상형");
		
		Class cls = kim.getClass();
		System.out.println("클래스 이름 = " + cls.getName());
		System.out.println("슈퍼 클래스 = " + cls.getSuperclass().getName());

		System.out.print("필드 : ");
		Field[] fields = cls.getDeclaredFields();
		for (Field F : fields) {
			System.out.print(F.getName() + " ");
		}
		
		System.out.println();
		System.out.print("메서드 : ");
		Method methods[] = cls.getDeclaredMethods();
		for (Method M : methods) {
			System.out.print(M.getName() + " ");
		}
	}

}
