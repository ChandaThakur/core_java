package newDay2;

public class PojoEmp {
	
	private Integer empId;
	private Integer age;
	private Integer salary;
	private String gender;
	private String fName;
	private String lName;
	
	public PojoEmp(Integer empId, Integer age,Integer salary, String gender, String fName, String lName) {
		super();
		this.empId = empId;
		this.age = age;
		this.gender = gender;
		this.fName = fName;
		this.lName = lName;
		this.salary = salary;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "PojoEmp [empId=" + empId + ", age=" + age + ", salary=" + salary + ", gender=" + gender + ", fName="
				+ fName + ", lName=" + lName + "]";
	}

	
	

}
