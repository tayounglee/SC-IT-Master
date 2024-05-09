package chapter10.polymorphism;

public class Customer {
	//멤버 변수
	protected int customerID;	//상속관계 or 같은 패키지 까지 접근 허용
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	//기본 생성자
	public Customer() {
		//메서드 호출
		initCustomer();
	}
	
	//명시적 생성자
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;		//초기화
		this.customerName = customerName;	
		initCustomer();	//메서드 호출
	}
	
	//멤버 메서드
	private void initCustomer() {
		this.customerGrade = "SILVER";	//초기화
		this.bonusRatio = 0.01;
	}
	//멤버 메서드
	public int calcPrice(int price) {
		this.bonusPoint += price * this.bonusRatio;
		return price;
	}
	//멤버 메서드
	public String showCustomerInfo() {
		return this.customerName + "님의 등급은 "
				+ this.customerGrade + "이며, 보너스 포인트는 "
				+ this.bonusPoint + "입니다.";
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
	
}
