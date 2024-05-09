package chapter12.generic;

class Coffee { }
class Juice  { }

class BeverageBox {
    // 모든 클래스 타입을 받기 위해 최고 조상인 Object 타입으로 설정
    private Object[] beberage;

    public BeverageBox(Object[] beberage) {
        this.beberage = beberage;
    }

    public Object getBeverage(int index) {
        return beberage[index];
    }
}

class BeverageBox2<T> {
	// 외부로부터 받아오는 제네릭타입 사용
	private T[] beberage;
//	static T t;		// static에서 사용 불가
	
	public BeverageBox2(T[] beberage) {
		this.beberage = beberage;
//		T t = new T();	// T타입으로 인스턴스 생성 불가
	}
	
	public T getBeverage(int index) {
		return beberage[index];
	}
}
public class C099_generic1 {

	public static void main(String[] args) {
		Coffee[] arr = {
	            new Coffee(),
	            new Coffee()
	    };
		BeverageBox box = new BeverageBox(arr);

		// 형변환을 해야하거나 사용되지 않은 타입에 err를 발생시키지 않는 문제
		Coffee coffee = (Coffee) box.getBeverage(0);
//		Juice juice = (Juice) box.getBeverage(1);

		// 제네릭 사용
		Coffee[] arr2 = {
				new Coffee(),
				new Coffee()
		};
		BeverageBox2<Coffee> box2 = new BeverageBox2<>(arr2);

		// 잘못된 타입이 사용될 수 있는 문제를 컴파일 과정에서 제거하여 개발을 용이하게 해준다.
		Coffee coffee2 = box2.getBeverage(0);
//		Juice juice2 = box2.getBeverage(1);
	}

}
