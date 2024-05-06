package chapter14.collection;

import java.util.*;

public class HashMap_Test1 {

	public static void main(String[] args) {
		/*
		HashMap은 데이터를 저장할 때 키(Key)와 밸류(Value)가 짝을 이루어 저장
		데이터의 추가, 삭제, 특히 검색이 빠르다는 장점
		이러한 이유로 HashMap은 키(Key)값을 통해서만 검색이 가능하며, 
		HashMap의 키(Key) 값은 중복될 수 없고, 밸류(Value) 값은 키(Key) 값이 다르다면 중복 가능
		 */
		Scanner scan = new Scanner(System.in);
		//HashMap - hash구조를 갖으며 key, value를 쌍으로 저장
		HashMap<String, Integer> snack = new HashMap<>();
		snack.put("오징어땅콩", 2500);
		snack.put("죠리퐁", 1900);
		snack.put("핫브레이크", 450);
		snack.put("빼빼로", 900);
		
		//String mySnack = scan.next();
		String mySnack = "죠리퐁";
		System.out.println(mySnack + "의 가격은 " + snack.get(mySnack));
		
		snack.remove("빼빼로");
		System.out.println(snack.containsKey("빼빼로"));
		snack.replace("죠리퐁",  3000);
		System.out.println(snack.get("죠리퐁"));
		System.out.println(snack.isEmpty());
	}
}
