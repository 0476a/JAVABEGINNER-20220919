package ch16;

public class Employee {
	
	// static 변수
	public static int serialNumber = 1001;
	
	private int employeeId; // 객체 자신의 고유한 값을 가지는 변수로 활용 !! 멤버변수
	private String employeeName;
	private String department;
	
	public Employee(String employeeName, String department) {
		this.employeeId = serialNumber;
		serialNumber++;
		this.employeeName = employeeName;
		this.department = department;
	}


	public int getEmployeeId() {
		return employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public String getDepartment() {
		return department;
	}
	
	// static 함수
	public static int getSerialNumber() {
		// 주의 : static 메서드 안에서 멤버 변수를 사용할 수 없다.
		// department = "기획팀";
		// 멤버 변수는 new 한 이후에 사용할 수 있다.
		// 즉 멤버 변수는 객체가 생성되어야 사용할 수 있다. 중요!!
		return serialNumber;
	}
	
	
	
	

}
