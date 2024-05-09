package chapter10.polymorphism;

public class VIPCustomer extends Customer{

	private int agentID;
	double saleRatio;
	
	public VIPCustomer(int customerID, String customerName
			, int agentID) {
		super(customerID, customerName);
		this.customerGrade = "VIP";
		this.bonusRatio = 0.05;
		this.saleRatio = 0.2;
		this.agentID = agentID;
	}
	
	@Override
	public int calcPrice(int price) {
		this.bonusPoint += price * this.bonusRatio;
		return price - (int)(price * this.saleRatio);
	}
	
	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo()
				+ " [담당 상담원 번호: " + this.agentID + "]";
	}
}
