package ch16;

public class MainTest2 {

	public static void main(String[] args) {
		// static 변수는 클래스 이름으로 접근할 수 있다.
		int result = Employee.serialNumber;
		// static 함수는 클래스 이름으로 접근 가능하다.
		int result2 = Employee.getSerialNumber();
		System.out.println(result2); // 출력값 : 1001
		System.out.println(result); // 출력값 : 1001
		//////////////////////////////////////////////////////////
		Employee employeeKim = new Employee("김길동", "영업팀");
		Employee employeeLee = new Employee("이순신", "무역팀");
		Employee employeeHong = new Employee("홍길동", "개발팀");
		
		int num1 = employeeKim.getEmployeeId();
		int num2 = employeeLee.getEmployeeId();
		int num3 = employeeHong.getEmployeeId();
		
//		System.out.println("num1 -->" + num1); // 출력값 : 1002 -> 잘못된 값. (static 쓰기전)
//		System.out.println("num2 -->" + num2); // 출력값 : 1002
		
		System.out.println("num1 -->" + num1); // 출력값 : num1 -->1001
		System.out.println("num2 -->" + num2); // 출력값 : num2 -->1002
		System.out.println("num3 -->" + num3); // 출력값 : num3 -->1003
		// 인스턴스들이 공유하는 변수 -- 현재 마지막번호가 뭔가??
		System.out.println(employeeKim.serialNumber); // 출력값 : 1004
		System.out.println(employeeLee.serialNumber); // 출력값 : 1004
		System.out.println(employeeHong.serialNumber); // 출력값 : 1004
		
		// static 변수를 호출하는 방법
		// 클래스 이름으로 접근 가능하다 !!!
		System.out.println(Employee.serialNumber); // 출력값 : 1004
		
		int total = add(10,100);
		System.out.println(total); // 출력값 : 110
	

	} // end of main
	
	// static 이 있으므로 객체와 상관없이 사용가능!
	// 두 수를 받아 덧셈 하는 코드의 기능
	public static int add(int n1, int n2) {
		return n1 + n2;
	} // end of add

} // end of class
