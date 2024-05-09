package chapter10.interface_part;

class HandPhone {
	void call() { System.out.println("전화를 건다."); }
	void receive() { System.out.println("전화를 받는다."); }
}

interface Camera {
	void takepicture();
}

class HandPhoneCamera extends HandPhone implements Camera {
	@Override
	public void takepicture() { System.out.println("찰칵. 사진을 찍는다."); }
}

public class C085_multiInheritance {

	public static void main(String[] args) {
		HandPhoneCamera myphone = new HandPhoneCamera();
		myphone.call();
		myphone.receive();
		myphone.takepicture();
	}

}

interface A {}
interface B {}
interface C extends A, B {}
class D {}
class E extends D implements A, B {}
