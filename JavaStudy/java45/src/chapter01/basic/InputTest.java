package chapter01.basic;

import java.util.Scanner;

public class InputTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("byte : ");
		byte a = scan.nextByte();
		System.out.print("short : ");
		short b = scan.nextShort();
		System.out.print("int : ");
		int c = scan.nextInt();
		System.out.print("long : ");
		long d = scan.nextLong();
		System.out.print("float : ");
		float e = scan.nextFloat();
		System.out.print("double : ");
		double f = scan.nextDouble();
		System.out.print("String: ");
		String g = scan.next();

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
	}
}
