package day5.setExamples;

import java.util.*;

public class TestEpBean2 {
	
	public static void main(String[] args) {
		EmployeeBean ep1 =new EmployeeBean("abc",1234,23);
		EmployeeBean ep2 =new EmployeeBean("xyz",5678,24);
		EmployeeBean ep3 =new EmployeeBean("lmn",8910,25);
		
		Set<EmployeeBean> setOfEmployee =new HashSet<EmployeeBean>();
		setOfEmployee.add(ep1);
		setOfEmployee.add(ep2);
		setOfEmployee.add(ep3);
		
		Iterator<EmployeeBean> iter= setOfEmployee.iterator();		
		
		while(iter.hasNext()) {
			EmployeeBean x=iter.next();
			System.out.println(x);
		}
	}

}
