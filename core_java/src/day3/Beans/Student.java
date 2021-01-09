package day3.Beans;

public class Student {
	
	private int rollNum;
	private String studentName;
	private String course;
	
	public Student()
	{
		
	}
	
	public Student(int rollNum, String studentName, String course) {
		super();
		this.rollNum = rollNum;
		this.studentName = studentName;
		this.course = course;
	}

	public int getRollNum() {
		return rollNum;
	}

	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [rollNum=" + rollNum + ", studentName=" + studentName + ", course=" + course + "]";
	}
	
	

}
