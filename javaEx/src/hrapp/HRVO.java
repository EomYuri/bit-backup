package hrapp;

public class HRVO {
	// 필드
	private String empName;
	private int empSalary;
	
	//생성자
	public HRVO(String empName, int empSalary) {
		super();
		this.empName = empName;
		this.empSalary = empSalary;
	}
	// getter/setter
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}
	
	// 출력용 오버라이드
	@Override
	public String toString() {
		return "HRVO [empName=" + empName + ", empSalary=" + empSalary + "]";
	}
	
	
	

	

}
