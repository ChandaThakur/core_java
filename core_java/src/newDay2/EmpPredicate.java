package newDay2;

import java.util.*;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmpPredicate {
	
	public static Predicate<PojoEmp> isAdultFemale(){
		return p->p.getAge()>24 &&p.getGender().equalsIgnoreCase("f");
	}
	
	public static Predicate<PojoEmp> isAdultMale(){
		return p->p.getAge()>21 &&p.getGender().equalsIgnoreCase("m");
	}
	
	public static Predicate<PojoEmp> isAgeMoreThen(Integer age){
		return p->p.getAge()>age;
	}
	
	public static List<PojoEmp> filterEmp(List<PojoEmp> emp, Predicate<PojoEmp> predicate){
		return emp.stream().filter(predicate).collect(Collectors.<PojoEmp>toList());
	}
	
	

}
