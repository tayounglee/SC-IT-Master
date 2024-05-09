package chapter13.collection;

import java.util.ArrayList;
import java.util.List;

public class C108_collection_arrayList1 {

	public static void main(String[] args) {
/*
	컬렉션 프레임워크(collection framework)란 다수의 데이터를 쉽고 효과적으로 처리할 수 있는 
	표준화된 방법을 제공하는 클래스의 집합을 의미합니다
	
	즉, 데이터를 저장하는 자료 구조와 데이터를 처리하는 알고리즘을 구조화하여 클래스로 구현해 놓은 것입니다.
	이러한 컬렉션 프레임워크는 자바의 인터페이스(interface)를 사용하여 구현됩니다.
 */
		// List <- ArrayList
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(2, 5);	// Index 2에 5의 값을 추가
		for (Integer i : list) {
			System.out.print(i + " ");
		}
		list.remove(0);	// Index 0 값 제거
		System.out.println();
		for (Integer i : list) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("get(index): " + list.get(1));	// Index 1 값 리턴
		System.out.println("size(): " + list.size());	// list의 사이즈 리턴
		
	}

}
