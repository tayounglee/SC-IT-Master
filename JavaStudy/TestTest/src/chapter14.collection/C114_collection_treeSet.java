package chapter13.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class C114_collection_treeSet {

	public static void main(String[] args) {
/*
		TreeSet은 이진 검색 트리(binary search tree)라는 자료구조의 형태로 데이터를 저장하는 컬렉션 클래스
		이진 검색 트리는 정렬, 검색, 범위검색(range search)에 높은 성능을 가짐
		그리고 Set 인터페이스를 구현했으므로 중복된 데이터의 저장을 허용하지 않고, 저장순서를 유지하지 않음
*/
			// 저장될때부터 이진트리를 이용하여 검색속도 극대화 + 정렬
			TreeSet<Integer> ts = new TreeSet<>();
			ts.add(3);
			ts.add(2);
			ts.add(5);
			ts.add(1);
			ts.add(4);
			ts.add(2);
			
			System.out.println(ts.first());	//최소값 출력
			System.out.println(ts.last());	//최대값 출력
			System.out.println(ts.contains(2)); 
			
			System.out.println("================");
			Iterator<Integer> it = ts.iterator();
			while (it.hasNext()) {
				System.out.println(it.next());
			}

			// TreeSet을 이용한 로또
			TreeSet<Integer> lotto = new TreeSet<>();
			for (int i = 0; lotto.size() < 6; i++) {
				lotto.add((int) (Math.random()*45 + 1));			
			}
			for (Integer n : lotto) {
				System.out.print(n + " ");
			}
	}

}
