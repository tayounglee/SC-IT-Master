package chapter13.collection;

import java.util.HashMap;

public class C115_collection_hashMap1 {

	public static void main(String[] args) {
/*
		HashMap은 데이터를 저장할 때 키(Key)와 밸류(Value)가 짝을 이루어 저장
		데이터의 추가, 삭제, 특히 검색이 빠르다는 장점
		이러한 이유로 HashMap은 키(Key)값을 통해서만 검색이 가능하며, 
		HashMap의 키(Key) 값은 중복될 수 없고, 밸류(Value) 값은 키(Key) 값이 다르다면 중복 가능
*/
			HashMap<String,Integer> Snack = new HashMap<String,Integer>();
			Snack.put("오징어 땅콩", 2500);
			Snack.put("죠리퐁", 1900);
			Snack.put("핫브레이크", 450);
			Snack.put("빼빼로", 900);
			
			String MySnack = "죠리퐁";
			System.out.println(MySnack + "의 가격은 " + Snack.get(MySnack));
			
			Snack.remove("빼빼로");	//key와 일치하는 데이터 삭제
			System.out.println(Snack.containsKey("빼빼로"));
			Snack.replace("죠리퐁", 3000);
			System.out.println(Snack.get("죠리퐁"));
			System.out.println(Snack.isEmpty());
	}

}
