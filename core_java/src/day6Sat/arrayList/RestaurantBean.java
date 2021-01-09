package day6Sat.arrayList;
//Shrutis bean class
public class RestaurantBean {
	
	private int orderId;
	private String name;
	private double billAmt;
	
	RestaurantBean(){
		
	}

	public RestaurantBean(int orderId, String name, double billAmt) {
		super();
		this.orderId = orderId;
		this.name = name;
		this.billAmt = billAmt;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBillAmt() {
		return billAmt;
	}

	public void setBillAmt(double billAmt) {
		this.billAmt = billAmt;
	}

	@Override
	public String toString() {
		return "RestaurantBean [orderId=" + orderId + ", name=" + name + ", billAmt=" + billAmt + "]";
	}
	
	

}
