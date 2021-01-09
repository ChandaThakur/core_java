package day4.arraylist.arrayListogBeans;

import java.util.ArrayList;

import day3.ClassAttributes.Employee;

public class Examples {
	
	public static void main(String[] args) {
		
		Employee ep1 =new Employee(123,"asdf");
		Employee ep2 =new Employee(123,"avfsdf");
		Employee ep3 =new Employee(123,"agsdf");
		Employee ep4 =new Employee(123,"agjsdf");
		
		ArrayList<Employee> epList =new ArrayList<Employee>();
		
		epList.add(ep1);
		epList.add(ep2);
		epList.add(ep3);
		epList.add(ep4);
		
		System.out.println(epList);
		
		for(Employee x:epList) {
			System.out.println(x);
		}
		
		
	}

}
