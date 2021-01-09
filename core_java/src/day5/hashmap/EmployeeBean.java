package day5.hashmap;

import java.util.*;

import day3.ClassAttributes.Employee;

public class EmployeeBean {
	
	public static void main(String[] args) {
		
		Employee ep1 = new Employee(93036,"Chanda");
		Employee ep2 = new Employee(93003,"Shruti");
		Employee ep3 = new Employee(93037,"Sajida");
		Employee ep4 = new Employee(93036,"Anyone");
		
		Map<Integer, Employee> employeeInfo=new HashMap<Integer,Employee>();
		
		employeeInfo.put(93, ep1);
		employeeInfo.put(91, ep2);
		employeeInfo.put(83, ep3);
		employeeInfo.put(70, ep4);
		
		Set<Integer> keysSet= employeeInfo.keySet();
		
		//Using Iterator
		
		System.out.println("using iterator \n");
		Iterator<Integer> iter= keysSet.iterator();
		
		while(iter.hasNext()) {
			Integer key=iter.next();
			Employee values=employeeInfo.get(key);
			
			System.out.println(key +" " +values);
		}
		
		//Using for each loop
		
		System.out.println("Using for each loop \n");
		for(Integer x:keysSet) {
			
			Employee values=employeeInfo.get(x);
			
			System.out.println(x +" " +values);
		}
		
	}

}
