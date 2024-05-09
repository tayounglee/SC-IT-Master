package chapter13.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class C112_collection_linkedList2 {

	public static void main(String[] args) {
		LinkedList<String> arName = new LinkedList<String>(); 
		//추가
		arName.add("장보고");
		arName.add("김유신"); 
		arName.add("강감찬"); 
		arName.add("을지문덕"); 
		arName.addLast("곽재우"); 	//LinkedList 맨뒤에 추가
		arName.addFirst("이순신"); 	//LinkedList 맨앞에 추가
		
		for(String name : arName) {
			System.out.print(name + " ");
		}
		System.out.println("\n===================");
		
		
		//검색
		System.out.println(arName.size());	  //저장된 객체의 개수 반환
		System.out.println(arName.isEmpty()); //LinkedList가 비어있는지 확인
		System.out.println(arName.indexOf("강감찬")); //지정된 객체가 저장된 위치를 찾아 반환
		System.out.println(arName.get(3));	  //지정된 위치에 저장된 객체를 반환
		
		//변경
		arName.set(0, "광개토대왕");
		
		for(String name : arName) {
			System.out.print(name + " ");
		}
		System.out.println("\n===================");
		// 정렬
//		Collections.sort(arName);
		// 역순정렬
//		Collections.reverse(arName);
		// 무작위
//		Collections.shuffle(arName);
		
		//제거
		arName.removeFirst();	//첫번째 노드 제거
		arName.removeLast();	//마지막 노드 제거
		arName.remove(2);		//index 위치 객체 제거
		arName.remove("을지문덕");	//지정된 객체 제거
		
		for(String name : arName) {
			System.out.print(name + " ");
		}
	}

}
