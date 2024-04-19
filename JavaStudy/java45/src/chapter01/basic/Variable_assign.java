package chapter01.basic;

public class Variable_assign {

	public static void printTypes(int value) {
        System.out.println("a: " + value);
        System.out.println("b: " + (short)value);
        System.out.println("c: " + (long)value);
    }
	public static void main(String[] args) {
        int input = 10;
        printTypes(input);
    }
}
