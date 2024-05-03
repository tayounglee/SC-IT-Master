package chapter12.object;

record Member(String name, int memberCode) {}

public class Record_Test {

	public static void main(String[] args) {
	Member member = new Member("홍길동", 1234);
    	System.out.println(member);
    	System.out.println(member.name());
    	System.out.println();

	}
}