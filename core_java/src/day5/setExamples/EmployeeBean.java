package day5.setExamples;

public class EmployeeBean {
	
	private String epName;
	private int epId;
	private int epAge;
	
	public EmployeeBean() {
		
	}
	
	public EmployeeBean(String epName, int epId, int epAge) {
		super();
		this.epName = epName;
		this.epId = epId;
		this.epAge = epAge;
	}

	public String getEpName() {
		return epName;
	}

	public void setEpName(String epName) {
		this.epName = epName;
	}

	public int getEpId() {
		return epId;
	}

	public void setEpId(int epId) {
		this.epId = epId;
	}

	public int getEpAge() {
		return epAge;
	}

	public void setEpAge(int epAge) {
		this.epAge = epAge;
	}

	@Override
	public String toString() {
		return "EmployeeBean [epName=" + epName + ", epId=" + epId + ", epAge=" + epAge + "]";
	}
	
	

}
