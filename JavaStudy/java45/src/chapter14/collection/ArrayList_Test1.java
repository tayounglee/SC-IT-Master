package chapter14.collection;

import java.util.*;

public class ArrayList_Test1 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(0, 5); // index (x, y) / List x번째에 y의 값을 추가
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		list.remove(0); // list 0번째 값을 제거
		for(Integer i : list) {
			System.out.print(i + " ");
		}
		System.out.println();
		//index 1의 요소 리턴
		System.out.println("get(index) : " + list.get(1));
		//list의 사이즈 리턴
		System.out.println("size() : " + list.size());
	}
}
