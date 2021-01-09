package day3.Beans;

public class Canteen {
	
	private String foodName;
	private int price;
	
	public Canteen() {
		
	}

	public Canteen(String foodName, int price) {
		super();
		this.foodName = foodName;
		this.price = price;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Canteen [foodName=" + foodName + ", price=" + price + "]";
	}
	
	

}
