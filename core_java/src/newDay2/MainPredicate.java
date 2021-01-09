package newDay2;

import java.util.ArrayList;
import java.util.Arrays;

public class MainPredicate {
	
	public static void main(String[] args) {
		PojoEmp e1=new PojoEmp(101,23000,23,"f","pagal","tuhai");
		PojoEmp e2=new PojoEmp(102,23000,23,"m","pagal","tuhai");
		PojoEmp e3=new PojoEmp(103,23000,23,"f","pagal","tuhai");
		
		ArrayList<PojoEmp> emp=new ArrayList<PojoEmp>();
		emp.addAll(Arrays.asList(new PojoEmp[] {e1,e2,e3}));
		System.out.println(EmpPredicate.filterEmp(emp, EmpPredicate.isAdultFemale()));
		
	}

}
