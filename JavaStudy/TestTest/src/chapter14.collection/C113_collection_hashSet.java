package chapter13.collection;

import java.util.HashSet;
import java.util.Iterator;

public class C113_collection_hashSet {

	public static void main(String[] args) {
		//hashset은 hashmap을 이용함
		
/*
		Set
		 - 객체를 중복해서 저장할 수 없으며, 하나의 null 값만 저장가능
		 - 중복을 자동으로 제거
		 - 순서를 보장하지 않음
		
 */
		HashSet<String> kangwon= new HashSet<String>();
		kangwon.add("춘천시");
		kangwon.add("철원군");
		kangwon.add("정선군");
		kangwon.add("강릉시");
		kangwon.add("화천군");
		kangwon.add("춘천시");
		
		Iterator<String> it = kangwon.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("===============");
		System.out.println(kangwon.size());
		System.out.println(kangwon.contains("화천군"));
		
		kangwon.remove("정선군");
//		kangwon.clear();	//모든 값 제거
		
		System.out.println("===============");
		for (String s : kangwon) {
			System.out.println(s);
		}
	}

}
