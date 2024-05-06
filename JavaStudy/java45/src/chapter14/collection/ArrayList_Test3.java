package chapter14.collection;

import java.util.ArrayList;

record Student(String name, int stdNum) { }

public class ArrayList_Test3 {

	public static void main(String[] args) {
		ArrayList<Student> stList = new ArrayList<>();
		stList.add(new Student("홍길동", 20241001));
		stList.add(new Student("이순신", 20241002));
		stList.add(new Student("강감찬", 20241003));
		
		for (int i = 0; i < stList.size(); i++) {
//			String result = String.format("이름: %s, 학번: %d", stList.get(i).name(), stList.get(i).stdNum());
//			System.out.println(result);
			System.out.println(stList.get(i));
		}
		
		for (Student s : stList) {
			System.out.println(s);
		}
	}

}
