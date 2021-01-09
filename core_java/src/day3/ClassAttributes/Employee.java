package day3.ClassAttributes;

public class Employee {
	
	private int epId;
	private String epName;
	
//Defoult constructer
	public Employee() {
		
	}
	
//parameterised constructer
	public Employee(int epId, String epName) {
		super();
		this.epId = epId;
		this.epName = epName;
	}
	
// getter and setter to access above methods outside the class
	public int getEpId() {
		return epId;
	}
	public void setEpId(int epId) {
		this.epId = epId;
	}
	public String getEpName() {
		return epName;
	}
	public void setEpName(String epName) {
		this.epName = epName;
	}
// to get the value directly using obj name without using .get() and .set()
	@Override
	public String toString() {
		return "Employee [epId=" + epId + ", epName=" + epName + "]";
	}
	
	
	

}
