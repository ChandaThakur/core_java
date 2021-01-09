package day6Sat.arrayList;

import java.util.ArrayList;

public class RestaurantTestFor {
	
	public static void main(String[] args) {
		
		RestaurantBean order1=new RestaurantBean(10,"food1",300);
		RestaurantBean order2=new RestaurantBean(2,"food2",450);
		RestaurantBean order3=new RestaurantBean(5,"food3",600);
		RestaurantBean order4=new RestaurantBean(4,"food4",1400);
		
		ArrayList<RestaurantBean> orderList =new ArrayList<RestaurantBean>();
		
		orderList.add(order1);
		orderList.add(order2);
		orderList.add(order3);
		orderList.add(order4);
		//int n=orderList.size();
		
		for(int i=0;i<orderList.size();i++) {
			System.out.println(orderList.get(i));
		}
	}

}
