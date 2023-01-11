package ch10;

public class MainTest1 {

	public static void main(String[] args) {
		
		
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();
		Student s5 = new Student();
		// 객체에 접근해서 상태값 초기화
		s1.studentName = "철수";
		s1.studentId = 1;
		s1.address = "부산시 진구";
		
		s2.studentName = "길수";
		s2.studentId = 2;
		s2.address = "부산시 해운대구";
		
		s3.studentName = "티모";
		s3.studentId = 3;
		s3.address = "푸른언덕";
		
		s4.studentName = "사자";
		s4.studentId = 4;
		s4.address = "밀림";
		
		s5.studentName = "모기";
		s5.studentId = 5;
		s5.address = "도시";
		
		// 기능을 사용해보자
		s1.study(); // 출력값 : 철수 학생이 공부를 합니다.
		s1.breakTime(); // 출력값 : 1번 학생이 휴식을 합니다.
		System.out.println("------------");
		
		s2.study(); // 출력값 : 길수 학생이 공부를 합니다.
		s2.breakTime(); // 출력값 : 2번 학생이 휴식을 합니다.
		System.out.println("------------");
		
		s3.study(); // 출력값 : 티모 학생이 공부를 합니다.
		s3.breakTime(); // 출력값 : 3번 학생이 휴식을 합니다.
		System.out.println("------------");
		
		s4.testTime(); // 출력값 : 사자 학생이 시험을 칩니다.
		System.out.println("------------");
		
		s5.cleanTime(); // 출력값 : 5번 학생이 청소를 합니다.
		System.out.println("-------------");
		
		
		
	} // end of main

} // end of class
